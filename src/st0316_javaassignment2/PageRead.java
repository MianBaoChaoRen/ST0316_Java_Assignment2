/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
 
public class PageRead {
    private static String currentPage = "";
    
    public static StringBuilder readPage(String pageAddr) {
        try {
            URL url = new URL(pageAddr);
            URLConnection conn = url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            System.out.println("Connecting . . ." + pageAddr);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            currentPage = conn.getURL().toString();
            String line;
            StringBuilder sb=new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line+"\n");
            }
            reader.close();
            return sb;            
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return new StringBuilder("");
        }  catch (IOException e) {
            // RMB print server is overloaded, please try again in a while
            e.printStackTrace();
            return new StringBuilder("");
        }
    }
    
    public static String getCurrentPage(){
        return currentPage;
    }
    
    public static void resetCurrentPage(){
        currentPage = "";
    }
}
