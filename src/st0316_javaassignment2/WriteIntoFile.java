/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Marcus Tan
 */
public class WriteIntoFile {
    private String searchString;
    private int webPagecounter;
    private String OfflineFillecontent;
    private String BatFilecontent;
            
    public WriteIntoFile(String searchString, int webPagecounter, String OfflineFilecontent, String BatFilecontent){
        this.searchString = searchString;
        this.webPagecounter = webPagecounter;
        this.OfflineFillecontent = OfflineFilecontent;
        this.BatFilecontent = BatFilecontent;     
    }
    
    public void CreateBatFile(){
        try{
            String filename =searchString + "-TOP " +webPagecounter;
            
            File Batfile = new File("savePages\\"+filename+"(OriginalURL).bat");
            
            Batfile.createNewFile();
            
            // If file exist, IT will replace with the new one 
            FileWriter Batfilefw = new FileWriter(Batfile.getAbsoluteFile(), false); // because of the false
                    BufferedWriter Batfilebw = new BufferedWriter(Batfilefw);
                    Batfilebw.write(BatFilecontent);
                    Batfilebw.close();
                
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void CreateOfflineFile(){
        try{
            String filename = searchString +"-TOP " + webPagecounter;
            
            File OfflineFile = new File("savePages\\"+filename+"(OFFLINEFILE).html");

            OfflineFile.createNewFile();

            // If file exist, IT will replace with the new one 
            FileWriter OfflineFilefw = new FileWriter(OfflineFile.getAbsoluteFile(), false);// because of the false
            BufferedWriter OfflineFilebw = new BufferedWriter(OfflineFilefw);
            OfflineFilebw.write(OfflineFillecontent);
            OfflineFilebw.close();
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
