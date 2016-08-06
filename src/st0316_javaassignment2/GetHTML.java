/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author user
 */
public class GetHTML {
    // Current Page is used solely for search Engine purposes
    // Due to the need to navigate between pages
    // Usage seen in SetSearch. Explaination will be there
    private static String currentPage = "";
    
    public static String getHTML(String pageAddr) {
        StringBuilder sb = new StringBuilder(); // StringBuilder because it is not synchronized, therefore it is faster
            try {
                URL url = null;
                url = new URL(pageAddr);
                currentPage = url.toString();
                URLConnection conn = url.openConnection();
                conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }
                reader.close();
            } catch (MalformedURLException e) {
                return "";
            } catch (IOException e) {
                return "";
            }
        return sb.toString();
    }
    
    public static String getCurrentPage() {
        return currentPage;
    }

    public static void resetCurrentPage() {
        currentPage = "";
    }
}
