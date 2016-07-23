/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author user
 */
public class WebpagesContainer {
    private Queue webpages = null;
    
    public WebpagesContainer(){
        webpages = new LinkedList<>();
    }
    
    synchronized public void add(String webpage){
        webpages.add(webpage);
    }
    
    synchronized public boolean contains(String webpage){
        return webpages.contains(webpage);
    }
    
    synchronized public int size(){
        return webpages.size();
    }
    
    public Queue getWebpages(){
        return webpages;
    }
}
