/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st0316_javaassignment2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcus Tan
 */
public class NewGui extends javax.swing.JFrame {

    WebpagesContainer webpages = new WebpagesContainer();
    
    /**
     * Creates new form NewGui
     */
    public NewGui() {
        initComponents();
            PagesChoice.add("2");
            PagesChoice.add("3");
            PagesChoice.add("4");
            PagesChoice.add("5");
            PagesChoice.add("6");
            PagesChoice.add("7");
            PagesChoice.add("8");
            PagesChoice.add("9");
            PagesChoice.add("10");
            PagesChoice.add("11");
            PagesChoice.add("12");
            
            
            
            StatusTA.append("Welcome to the WebCollector! \n\n");
            StatusTA.append("Please enter your search string and search engine of choice!\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        SearchPanel = new javax.swing.JPanel();
        SearchLabel = new javax.swing.JLabel();
        SearchTF = new javax.swing.JTextField();
        NumberOfPageLabel = new javax.swing.JLabel();
        PagesChoice = new java.awt.Choice();
        SearchBtn = new javax.swing.JButton();
        ThreadPanel = new javax.swing.JPanel();
        Thread1Label = new javax.swing.JLabel();
        Thread2Label = new javax.swing.JLabel();
        Thread3Label = new javax.swing.JLabel();
        Thread4Label = new javax.swing.JLabel();
        Thread1TA = new java.awt.TextArea();
        Thread2TA = new java.awt.TextArea();
        Thread4TA = new java.awt.TextArea();
        Thread3TA = new java.awt.TextArea();
        URLPanel = new javax.swing.JPanel();
        URLLabel = new javax.swing.JLabel();
        UrlTA = new java.awt.TextArea();
        StatusPanel = new javax.swing.JPanel();
        StatusTA = new java.awt.TextArea();
        jPanel1 = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Word", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 11))); // NOI18N

        SearchLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        SearchLabel.setText("Enter your Search Phrase:");

        SearchTF.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        NumberOfPageLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        NumberOfPageLabel.setText("Choose the Number of Pages to save:");

        SearchBtn.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchTF))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(NumberOfPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(PagesChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchBtn)))
                .addContainerGap())
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchLabel)
                    .addComponent(SearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NumberOfPageLabel)
                        .addComponent(PagesChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SearchBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ThreadPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thread Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 11))); // NOI18N

        Thread1Label.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Thread1Label.setText("Thread 1: ");

        Thread2Label.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Thread2Label.setText("Thread 2: ");

        Thread3Label.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Thread3Label.setText("Thread 3: ");

        Thread4Label.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Thread4Label.setText("Thread 4: ");

        Thread1TA.setEditable(false);

        Thread2TA.setEditable(false);

        Thread4TA.setEditable(false);

        Thread3TA.setEditable(false);

        javax.swing.GroupLayout ThreadPanelLayout = new javax.swing.GroupLayout(ThreadPanel);
        ThreadPanel.setLayout(ThreadPanelLayout);
        ThreadPanelLayout.setHorizontalGroup(
            ThreadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThreadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThreadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Thread2Label)
                    .addComponent(Thread4Label)
                    .addComponent(Thread3Label)
                    .addComponent(Thread1Label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThreadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Thread1TA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thread2TA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thread4TA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thread3TA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ThreadPanelLayout.setVerticalGroup(
            ThreadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThreadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThreadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Thread1Label)
                    .addComponent(Thread1TA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(ThreadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Thread2Label)
                    .addComponent(Thread2TA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(ThreadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Thread3Label)
                    .addComponent(Thread3TA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThreadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Thread4TA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thread4Label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        URLPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "URL (Unique)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 11))); // NOI18N

        URLLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        URLLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        URLLabel.setText("List of URLs");

        UrlTA.setEditable(false);

        javax.swing.GroupLayout URLPanelLayout = new javax.swing.GroupLayout(URLPanel);
        URLPanel.setLayout(URLPanelLayout);
        URLPanelLayout.setHorizontalGroup(
            URLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(URLPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(URLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(URLLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UrlTA, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        URLPanelLayout.setVerticalGroup(
            URLPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(URLPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(URLLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UrlTA, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        StatusPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 11))); // NOI18N

        StatusTA.setEditable(false);

        javax.swing.GroupLayout StatusPanelLayout = new javax.swing.GroupLayout(StatusPanel);
        StatusPanel.setLayout(StatusPanelLayout);
        StatusPanelLayout.setHorizontalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StatusTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        StatusPanelLayout.setVerticalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusPanelLayout.createSequentialGroup()
                .addComponent(StatusTA, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.setCurrentDirectory(new java.io.File("D:\\Y3S1\\Advanced Java Programming\\AJP Assignment 2\\MYOWNAssignment\\SER"));
        jFileChooser1.setDialogTitle("");
        jFileChooser1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ThreadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(URLPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(StatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThreadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(URLPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        String searchString = SearchTF.getText(); // Search string
        int numOfWebpages = Integer.parseInt(PagesChoice.getSelectedItem()); // Can set number of pages
        int UrlCounter = 1;
        // Replaces all spaces, with + because of the search engines
        // BUT. if bing, need change to &20 or something like that. but we using
        // Yahoo and Google for now.
        if(searchString.contains(" ")) searchString = searchString.replaceAll("(\\s+)|(\\n)", "+"); 
        
        // Thread in an array for 2 search engines
        // For maybe advanced feature got something around here we can do /*ignore first*/
        Thread [] tA = new Thread[2]; 
        
        StatusTA.append("\nYour Search String is: " + searchString + "\n\n");
        
        for(int i=1; i<=2; i++){
            String searchEngine = ""; // google
            if (i==1){
                searchEngine = "Google"; // google
                
                StatusTA.append("Passing search to:" + searchEngine +"\n");
                
                // Refer to class file SetSearch
                // Note : We are passing the shared resource WebpagesContainer (also a created class) into
                //        the SetSearch. More will be said in the SetSearch. Maybe good idea to continue
                //        Understanding in the SetSearch, explain there easier.
                SetSearch ss = new SetSearch(searchString, searchEngine, numOfWebpages, webpages);
                StatusTA.append("Search Received by Google! \n\n");
                
                tA[i-1] = new Thread(ss, "Google");
            } if(i==2) {
                searchEngine = "Bing"; // yahoo
                
                StatusTA.append("Passing search to:" + searchEngine +"\n");
                
                // Refer to class file SetSearch
                // Note : We are passing the shared resource WebpagesContainer (also a created class) into
                //        the SetSearch. More will be said in the SetSearch. Maybe good idea to continue
                //        Understanding in the SetSearch, explain there easier.
                SetSearch ss = new SetSearch(searchString, searchEngine, numOfWebpages, webpages);
                StatusTA.append("Search Received by Yahoo! \n\n");
                
                tA[i-1] = new Thread(ss, "Bing");
            }
        }
        
        tA[0].start();
        tA[1].start();
       
        StatusTA.append("Adding Web Url into Queue \n");
        StatusTA.append("\nPlease wait for a moment. Thank you. \n\n");
        
        String currentPage1 = QueueAdd.getCurrentPage();
        while(tA[0].isAlive() || tA[1].isAlive()){
            String currentPage2 = QueueAdd.getCurrentPage();
            while(!currentPage1.equals(currentPage2 = QueueAdd.getCurrentPage())){
                currentPage1 = currentPage2;
                String CurrentThread = SetSearch.getCurrentThreadName();
                
                UrlTA.append(UrlCounter + ": " + " (" + CurrentThread + ") " + currentPage1 + "\n");
                
                
                if (CurrentThread.equals("Bing")){
                    Thread1TA.append("\n\n Inserting Url Number:" + UrlCounter + " into queue from " + CurrentThread);
                } else if (CurrentThread.equals("Google")){
                    Thread2TA.append("\n\n Inserting Url Number:" + UrlCounter + " into queue from " + CurrentThread);
                }
                UrlCounter++;
            }
        }

        
        
        for(int i=0; i<tA.length; i++){
            try {
                // Thread joining would mean that only after all these threads are done
                // Than it will continue the rest of the code below. In our case is the
                // Serialisation i put below
                tA[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(NewGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // SERIALISATION PART. Both the exporting and importing test. It works
        System.out.println("");
        Queue<Webpage> savedWebpages = new LinkedList<>();  // For printing
        try{
            int webPagecounter = 1;
            
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

                String BatFilecontent = "start "+webpage.getWebName();
                String OfflineFilecontent = webpage.getWebHTML();
                
                WriteIntoFile WriteIntoFile = new WriteIntoFile(searchString, webPagecounter, OfflineFilecontent, BatFilecontent);
                 
                WriteIntoFile.CreateOfflineFile();
                WriteIntoFile.CreateBatFile();
                
                webPagecounter++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_SearchBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel NumberOfPageLabel;
    private java.awt.Choice PagesChoice;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JTextField SearchTF;
    private javax.swing.JPanel StatusPanel;
    private java.awt.TextArea StatusTA;
    private javax.swing.JLabel Thread1Label;
    private java.awt.TextArea Thread1TA;
    private javax.swing.JLabel Thread2Label;
    private java.awt.TextArea Thread2TA;
    private javax.swing.JLabel Thread3Label;
    private java.awt.TextArea Thread3TA;
    private javax.swing.JLabel Thread4Label;
    private java.awt.TextArea Thread4TA;
    private javax.swing.JPanel ThreadPanel;
    private javax.swing.JLabel URLLabel;
    private javax.swing.JPanel URLPanel;
    private java.awt.TextArea UrlTA;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
