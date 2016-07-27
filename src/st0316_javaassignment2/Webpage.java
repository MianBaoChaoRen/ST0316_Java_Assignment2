package st0316_javaassignment2;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Webpage implements Serializable{
    private String webName = "";
    private String webHTML = "";
    
    /**
     * Constructor
     *  Class created to hold the web page along with its content
     * @param webName
     * @param webHTML 
     */
    public Webpage(String webName, String webHTML){
        this.webName = webName;
        this.webHTML = webHTML;
    }

    /**
     * @return the webName
     */
    public String getWebName() {
        return webName;
    }

    /**
     * @return the webHTML
     */
    public String getWebHTML() {
        return webHTML;
    }
}
