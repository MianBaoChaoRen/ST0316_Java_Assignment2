/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        // COMMENTS TYPED IN THE MAIN IS ALL RUBBISH LANGUAGE CAUSE I DONT PLAN
        // TO SAVE WHATEVER IS HERE
        //
        // Contain list of webpages << Shared Resource so everything taps from here
        // This whole shit here is merely for test only, thats why all in main, simulation
        // of situation
        
        WebpagesContainer webpages = new WebpagesContainer();
        
        String searchString = "Star Wars"; // Search string
        int numOfWebpages = 12; // Can set number of pages
        
        // Replaces all spaces, with + because of the search engines
        // BUT. if bing, need change to &20 or something like that. but we using
        // Yahoo and Google for now.
        if(searchString.contains(" ")) searchString = searchString.replaceAll("(\\s+)|(\\n)", "+"); 
      
        System.out.println("Welcome to the CowCrawler! "
                + "Please enter your search string and search engine of choice!\n");
        
        // Thread in an array for 2 search engines
        // For maybe advanced feature got something around here we can do /*ignore first*/
        Thread [] tA = new Thread[2]; 
        for(int i=1; i<=2; i++){
            String searchEngine = "google"; // google
            if(i==2) searchEngine = "yahoo"; // yahoo
            System.out.println("Passing search : " + searchString + " to " + searchEngine + " ... ");
            
            // Refer to class file SetSearch
            // Note : We are passing the shared resource WebpagesContainer (also a created class) into
            //        the SetSearch. More will be said in the SetSearch. Maybe good idea to continue
            //        Understanding in the SetSearch, explain there easier.
            SetSearch ss = new SetSearch(searchString, searchEngine, numOfWebpages, webpages); 
            System.out.println("Search passed!");
            tA[i-1] = new Thread(ss);
        }
        
        System.out.println("\nStarting searching for \"" + searchString + "\"");
        tA[0].start(); // Start
        tA[1].start(); // Start
        System.out.println("Please wait for a moment . . . . .\n");
        for(int i=0; i<tA.length; i++){
            try {
                // Thread joining would mean that only after all these threads are done
                // Than it will continue the rest of the code below. In our case is the
                // Serialisation i put below
                tA[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ST0316_JavaAssignment2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // SERIALISATION PART. Both the exporting and importing test. It works
        System.out.println("");
        Queue<Webpage> savedWebpages = new LinkedList<>();  // For printing
        try{
            FileOutputStream fos = new FileOutputStream("savedWebpages.ser");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(webpages); // Write object method is special, refer the WebpagesContainer
            os.close();

            FileInputStream fis = new FileInputStream("savedWebpages.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            WebpagesContainer wc = (WebpagesContainer)ois.readObject(); // Read object method is special, refer the WebpagesContainer
            savedWebpages = wc.getSavedWebpages();
            for (Webpage webpage : savedWebpages) {
                // Check if the HTML went through so i dont need to visually check it
                // IF not empty wont print. Should have 12. or whatever num of webpages
                if(!webpage.getWebHTML().equals(""))System.out.println(webpage.getWebName()); 
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
