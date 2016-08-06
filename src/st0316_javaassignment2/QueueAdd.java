/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.net.MalformedURLException;
import java.net.URL;

    
/**
 *
 * @author Marcus Tan
 */
public class QueueAdd implements Runnable{
    
    private static String currentPage = "";
    
    private WebpagesContainer webContainer;
    private String webURL = "";
    
    public QueueAdd(WebpagesContainer webContainer, String webURL){
        try{ 
            URL url = null;
            url = new URL(webURL);
            currentPage = url.toString();
        
        } catch (MalformedURLException e) {
        }
        this.webContainer = webContainer;
        this.webURL = webURL;
    }
    
    public void run(){
        webContainer.add(new Webpage(webURL, GetHTML.getHTML(webURL)));
    }
    
    public static String getCurrentPage() {
        return currentPage;
    }
}
