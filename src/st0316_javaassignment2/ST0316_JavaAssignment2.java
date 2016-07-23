/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Marcus Tan           - 1448892
 *         Theodoric Keith Lim  - 1431223
 */
public class ST0316_JavaAssignment2 {

    /**
     * @param args the command line argument
     */
    
    public static void main(String[] args) {
        // Contain list of webpages
        WebpagesContainer webpages = new WebpagesContainer();
        
        String searchString = "Ong Tiong Poh";
        int numOfWebpages = 12;
        if(searchString.contains(" ")) searchString = searchString.replaceAll("(\\s+)|(\\n)", "+");
      
        System.out.println("Welcome to the CowCrawler! "
                + "Please enter your search string and search engine of choice!\n");
        
        Thread [] tA = new Thread[2]; 
        for(int i=1; i<=2; i++){
            String searchEngine = "google";
            if(i==2) searchEngine = "yahoo";
            System.out.println("Passing search : " + searchString + " to " + searchEngine + " ... ");
            SetSearch ss = new SetSearch(searchString, searchEngine, numOfWebpages, webpages);
            System.out.println("Search passed!");
            tA[i-1] = new Thread(ss);
        }
        
        System.out.println("\nStarting searching for \"" + searchString + "\"");
        tA[0].start();
        tA[1].start();
        System.out.println("Please wait for a moment . . . . .\n");
        for(int i=0; i<tA.length; i++){
            try {
                tA[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ST0316_JavaAssignment2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Here are your search results on \"" + searchString + "\"");
        Queue uniqueWebpages = webpages.getWebpages();
        Iterator i = uniqueWebpages.iterator();
        FileOutputStream fos = null;
        
        int j = 1;
        while(i.hasNext()){
//            System.out.println(j++ + " : " + i.next());
            try{
                fos = new FileOutputStream(searchString + "_" + j +".txt");
                fos.write(String.valueOf(PageRead.readPage((String)i.next())).getBytes());
            }catch(Exception e){
                System.out.println(e);
            }   
        }
    }
}
