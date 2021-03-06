/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public enum SearchEngines {
    Google(1), Bing(2), Yahoo(3);
    private String searchEngine = "";
    private Pattern searchPattern = null;
    
    SearchEngines(int searchEngineType){
        if(searchEngineType==1){
           searchEngine = "https://www.google.com/search?q=";
           searchPattern = Pattern.compile(
                    Pattern.quote("<h3 class=\"r\"><a href=\"") 
                            + "(.*?)" 
                            + Pattern.quote("\" onmousedown"));  
//           searchPattern = Pattern.compile(
//                    Pattern.quote("<cite class=\"_Rm\">") 
//                            + "(.*?)" 
//                            + Pattern.quote("</cite>"));  
        }else if (searchEngineType==2){
           searchEngine = "https://www.bing.com/search?q=";
           searchPattern = Pattern.compile(
                    Pattern.quote("<h2><a href=\"") 
                            + "(.*?)" 
                            + Pattern.quote("\" h="));
        }else if (searchEngineType==3){
           searchEngine = "https://sg.search.yahoo.com/search?p=";
           searchPattern = Pattern.compile(
                    Pattern.quote("<a class=\" td-u\" href=\"") 
                            + "(.*?)" 
                            + Pattern.quote("\" target"));
//           searchPattern = Pattern.compile(
//                    Pattern.quote("<span class=\" fz-ms fw-m fc-12th wr-bw\">") 
//                            + "(.*?)" 
//                            + Pattern.quote("</span>"));
        }
           
    }
    
    public String getSearchEngine(){
        return searchEngine;
    }
    
    public Pattern getSearchPattern(){
        return searchPattern;
    }
}
