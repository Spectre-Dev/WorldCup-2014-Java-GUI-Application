/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

import java.awt.Desktop;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x13399691
 */
public class GameGUI extends javax.swing.JFrame {
//declaring an array list
    private ArrayList <Game> pList;
    //decalring variables
    private String prediction;
    private String name;
    private int count;
    /**
     * Creates new form GameGUIi
     */
    public GameGUI() {
        initComponents();
        //create new array list
        pList = new ArrayList <>();
      //initializing variables
        prediction = new String();
        name = new String();
        count = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        groupBtn = new javax.swing.JButton();
        textLbl = new javax.swing.JLabel();
        predictionTf = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        siteBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeButton2_2.png"))); // NOI18N
        homeBtn.setBorderPainted(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setFocusPainted(false);
        homeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeButton2hover.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn);
        homeBtn.setBounds(0, 0, 73, 60);

        groupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Back Button.png"))); // NOI18N
        groupBtn.setBorderPainted(false);
        groupBtn.setContentAreaFilled(false);
        groupBtn.setFocusPainted(false);
        groupBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/backHover.png"))); // NOI18N
        groupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupBtnActionPerformed(evt);
            }
        });
        jPanel1.add(groupBtn);
        groupBtn.setBounds(380, 0, 73, 60);

        textLbl.setBackground(new java.awt.Color(153, 153, 153));
        textLbl.setForeground(new java.awt.Color(255, 255, 255));
        textLbl.setText("Enter country:");
        textLbl.setOpaque(true);
        jPanel1.add(textLbl);
        textLbl.setBounds(120, 430, 100, 20);
        jPanel1.add(predictionTf);
        predictionTf.setBounds(220, 430, 160, 22);

        nameLbl.setBackground(new java.awt.Color(153, 153, 153));
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setText("Enter your name:");
        nameLbl.setOpaque(true);
        jPanel1.add(nameLbl);
        nameLbl.setBounds(120, 460, 100, 20);

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });
        jPanel1.add(nameTf);
        nameTf.setBounds(220, 460, 160, 22);

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/addBtn.png"))); // NOI18N
        addBtn.setBorderPainted(false);
        addBtn.setContentAreaFilled(false);
        addBtn.setFocusPainted(false);
        addBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/addhooverBtn.png"))); // NOI18N
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn);
        addBtn.setBounds(40, 500, 80, 30);

        displayBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/displayBtn.png"))); // NOI18N
        displayBtn.setBorderPainted(false);
        displayBtn.setContentAreaFilled(false);
        displayBtn.setFocusPainted(false);
        displayBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/displayhooverBtn.png"))); // NOI18N
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });
        jPanel1.add(displayBtn);
        displayBtn.setBounds(130, 500, 80, 30);

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/searchcountBtn.png"))); // NOI18N
        searchBtn.setBorderPainted(false);
        searchBtn.setContentAreaFilled(false);
        searchBtn.setFocusPainted(false);
        searchBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/searchcounthooverBtn.png"))); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn);
        searchBtn.setBounds(220, 500, 80, 30);

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/deleteBtn.png"))); // NOI18N
        deleteBtn.setBorderPainted(false);
        deleteBtn.setContentAreaFilled(false);
        deleteBtn.setFocusPainted(false);
        deleteBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/deletehooverBtn.png"))); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn);
        deleteBtn.setBounds(310, 500, 80, 30);

        siteBtn.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        siteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/fullsiteBtn.png"))); // NOI18N
        siteBtn.setBorderPainted(false);
        siteBtn.setContentAreaFilled(false);
        siteBtn.setFocusPainted(false);
        siteBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/fullsitehooverBtn.png"))); // NOI18N
        siteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(siteBtn);
        siteBtn.setBounds(10, 660, 140, 23);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/BackgroundGame.png"))); // NOI18N
        jPanel1.add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 450, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        WorldCup myHome = new WorldCup();
        myHome.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void groupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupBtnActionPerformed
        // TODO add your handling code here:
        GroupsGUI back = new GroupsGUI();
        back.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_groupBtnActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        //get text from textfields
        prediction = predictionTf.getText();
        name = nameTf.getText();

        //add details to one single object
        Game a = new Game();
        a.setPrediction(prediction);
        a.setName(name);

        //add object to array list
        pList.add(a);

        //increment counter
        count++;
        predictionTf.setText("Successful");
        nameTf.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        //loop through array list & show all of the contents of array list
        for(int i = 0; i < pList.size(); i++){
            JOptionPane.showMessageDialog(null, "Prediction: " + pList.get(i).getPrediction() + "\nWho predicted: " + pList.get(i).getName());
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String searchType = JOptionPane.showInputDialog(null, "Please enter the country you are looking for:");

        //trying for each loop. Declaring instance of an object & giving name = x
        for(Game x:pList){
            if(searchType.equalsIgnoreCase(x.getPrediction())){
                JOptionPane.showMessageDialog(null, "Prediction: " +x.getPrediction()+ "\nWho predicted: " +x.getName());
            }
        }

    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here: if statement
        if(predictionTf.getText().equals("")||nameTf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "You must enter predicted country and your name to delete");
        }
        else if(count ==0){
            JOptionPane.showMessageDialog(null, "Sorry, there are no items to delete!");
        }
        else{
            prediction = predictionTf.getText();
            name = nameTf.getText();

            for(int i = 0; i < pList.size(); i++){
                if(pList.get(i).getPrediction().equals(prediction)&&pList.get(i).getName().equals(name)){
                    pList.remove(i);
                    count = count -1;
                    JOptionPane.showMessageDialog(null, "Deleted!");
                    break;
                }
                if(i==count-1){
                    JOptionPane.showMessageDialog(null, "Sorry that item could not be found");
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void siteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteBtnActionPerformed
        // TODO add your handling code here:

        /*
        *@reference: http://stackoverflow.com/questions/10967451/open-a-link-in-browser-with-java-button
        */

        try
        {
            Desktop.getDesktop().browse(new URL("http://www.fifa.com/index.html").toURI());
        }
        catch (Exception e) {}
    }//GEN-LAST:event_siteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton groupBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField predictionTf;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton siteBtn;
    private javax.swing.JLabel textLbl;
    // End of variables declaration//GEN-END:variables
}
