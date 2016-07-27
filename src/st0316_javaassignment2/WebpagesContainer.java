/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class WebpagesContainer implements Serializable{
    private Queue<Webpage> savedWebpages = null; // Main item that is Serialised
    
    // Temporary holding for efficiency
    // For Understanding:
    // The tmpHold is used merely to record which webpages
    // have been recorded down. THIS DOES NOT INCLUDE THE
    // READING of the HTML. It only records down the name
    // of the webpage, hence the ArrayList<String>
    // Created for efficiency, cause it would affect the
    // While loop in the SetSearch
    //
    // NOTE: The methods that use tmpHold
    //       addTmpHold
    //       getSize
    //       contains
    // Refer to SetSearch for reasoning
    private transient ArrayList<String> tmpHold = null; 
    
    /**
     * Constructor
     * 
     * Initializing savedWebpages and tmpHold object.
     */
    public WebpagesContainer(){
        savedWebpages = new LinkedList<>();
        tmpHold = new ArrayList<>();
    }
    
    synchronized public void addTmpHold(String webpage){
        tmpHold.add(webpage);
    }
    
    synchronized public int getSize(){
        return tmpHold.size();
    }
    
    synchronized public boolean contains(String webURL){
        return tmpHold.contains(webURL);
    }
    
    public void add(String webpage){
        String webHTML = "";
        // This thread starts the reading of the HTML code from the
        // gathered websites. This thread will be started the instance
        // a webpage is found in the search results from the search Engine
        // NOTE : CAN BE DONE BETTER HERE 
        // INNER CLASS???????
        // Efficiency point.. Currently about 13s to 12s run time
        Thread t = new Thread(webHTML = GetHTML.getHTML(webpage));
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(WebpagesContainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Page only added after HTML is gotten due to t.join();
        savedWebpages.add(new Webpage(webpage, webHTML));
    }
    
    public Queue<Webpage> getSavedWebpages(){
        // Method may be decommissioned but used currently for saving purposes
        // However it is used to get the savedWebpages after Serialization
        return savedWebpages;
    }
    
    private void writeObject(ObjectOutputStream oos) 
            throws IOException, ClassNotFoundException{
        oos.defaultWriteObject();
        oos.writeObject(savedWebpages);
    }
    
    private void readObject(ObjectInputStream ooi) 
            throws IOException, ClassNotFoundException{
        ooi.defaultReadObject();
        this.savedWebpages = (Queue<Webpage>)ooi.readObject();
    }    
}
