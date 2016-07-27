/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class SetSearch implements Runnable{
    private String searchString = "";
    private String searchEngine = "";   
    private Pattern searchPattern = null;
    
    private int numOfWebpages = 0;
    
    private WebpagesContainer webpages = null;
    
    
    public SetSearch(String searchString, String searchEngine, int numOfWebpages, WebpagesContainer webpages){
        // EXPLAINATION
        // Although there are 2 threads from the main, the WebpagesContainer is
        // still the same resource therefore the synchronized methods in 
        // WebpagesContainer class
        // Look at run() method next
        this.searchString = searchString;
        this.webpages = webpages;
        this.numOfWebpages = numOfWebpages;
        
        switch (searchEngine) {
            case "google":
                this.searchEngine = SearchEngines.google.getSearchEngine();
                this.searchPattern = SearchEngines.google.getSearchPattern();
                break;
            case "yahoo":
                this.searchEngine = SearchEngines.yahoo.getSearchEngine();
                this.searchPattern = SearchEngines.yahoo.getSearchPattern();
                break;
        }
    }
    
    @Override
    public void run(){
        // Does not have to be synchronized as both threads are to run together
        // Only those things in the WebpagesContainer has to be as we are adding
        // to the variable there.
        //
        // As we only want a certain number of webpages, hence the while loop.
        // Note: See the WebpagesContainer part if haven't, it will explain
        //       the codes here better.
        int pageCount = 0; // Used with the currentPage from GetHTML class
        while(webpages.getSize()<numOfWebpages){
            String searchHTML = "";
            while(searchHTML.equals("")){
                searchHTML = getSearchURL(pageCount); // Refer to method below
            }
            Matcher matcher = searchPattern.matcher(searchHTML);
            while(matcher.find() && webpages.getSize() < numOfWebpages){
                String webURL = matcher.group(1).replaceAll("(<b>|<\\/b>)|(\\/$)", "");
                if(!webpages.contains(webURL)) {
                    webpages.addTmpHold(webURL); // Adding to TmpHold for recording
                    webpages.add(webURL); // Adding to the saved areas
                }
            }
            pageCount++;
        }
    }
    
    /**
     * Returns a String that should be the HTML of the given webpage
     * @param pageCount
     * @return 
     */
    private String getSearchURL(int pageCount){
        String searchURL = "";
        if((searchURL = GetHTML.getCurrentPage()).equals("")){ // Means that this is the first page of the searchEngine
            return GetHTML.getHTML(searchEngine + searchString);
            // Going to next page hence all the symbols.
            // Apparently Google and Yahoo has about the same format
        }else return GetHTML.getHTML(searchURL.replaceAll(searchString + "&.+", searchString + "&start=" + pageCount + "0")); 
    }
}