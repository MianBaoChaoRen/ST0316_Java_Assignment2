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
        this.searchString = searchString;
        this.webpages = webpages;
        this.numOfWebpages = numOfWebpages;
        
        if(searchEngine.equals("google")){
            this.searchEngine = SearchEngines.google.getSearchEngine();
            this.searchPattern = SearchEngines.google.getSearchPattern();
        }else if(searchEngine.equals("yahoo")){
            this.searchEngine = SearchEngines.yahoo.getSearchEngine();
            this.searchPattern = SearchEngines.yahoo.getSearchPattern();
        }
    }
    
    @Override
    synchronized public void run(){
        int pageCount = 0;
        while(webpages.size()<numOfWebpages){
            String searchHTML = "";
            while(searchHTML.equals("")){
                searchHTML = getSearchURL(pageCount);
            }
            Matcher matcher = searchPattern.matcher(searchHTML);
            while(matcher.find() && webpages.size() < numOfWebpages){
                String webURL = matcher.group(1).replaceAll("(<b>|<\\/b>)|(https:\\/\\/)|(\\/$)", "");
                if(!webpages.contains(webURL))webpages.add(webURL);
            }
            pageCount++;
        }
    }
    
    private String getSearchURL(int pageCount){
        String searchURL = "";
        if((searchURL = PageRead.getCurrentPage()).equals("")){
            return PageRead.readPage(searchEngine + searchString).toString();
        }else return PageRead.readPage(searchURL.replaceAll(searchString + "&.+", searchString + "&start=" + pageCount + "0")).toString();
    }
}