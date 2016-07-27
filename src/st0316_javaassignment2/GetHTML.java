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
        // Counter used to keep track of the protocol additions used
        // 0 = No protocol addition needed
        //               OR
        // 0 = add http:// when "https://" is not present
        // 1 = add https:// when "https://" is not present
        // Codes seen in lines 36 to 41
        int count = 0; 
        
        StringBuilder sb = new StringBuilder(); // StringBuilder because it is not synchronized, therefore it is faster
        String protocol = "";
        while (sb.toString().equals("") && count < 2) { // Note: While Loop using count && Try Catch only returns "" when count==2
            try {
                URL url = null;
                if (!pageAddr.contains("https://")) {
                    if(count==0){
                        protocol = "http://";
                        count++;
                    }else if(count==1) protocol = "https://";
                }
                url = new URL(protocol + pageAddr);
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
                e.printStackTrace();
                if(count==2)return "";
            } catch (IOException e) {
                e.printStackTrace();
                if(count==2)return "";
            }
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
