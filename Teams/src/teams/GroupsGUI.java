/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

import java.awt.Desktop;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 * @author Dzulija Puspure
 * @author x13399691
 */
public final class GroupsGUI extends javax.swing.JFrame {
    
    //variables
    private String groupName, team1, team2, team3, team4;
    //declaring an int value to count through the array
    private int count;
    Groups myGroups[];

    /**
     * Creates new form Groups
     */
    public GroupsGUI() {
        initComponents();
        myGroups = new Groups[8];
        //initializing the variables
        groupName = new String();
        team1 = new String();
        team2 = new String();
        team3 = new String();
        team4 = new String();
        count = 0;
        initGroups(); 
    }

    public void initGroups() {
        //declaring instances of the Groups.java
        Groups groupA = new Groups();
        Groups groupB = new Groups();
        Groups groupC = new Groups();
        Groups groupD = new Groups();
        Groups groupE = new Groups();
        Groups groupF = new Groups();
        Groups groupG = new Groups();
        Groups groupH = new Groups();

        groupA.setGroupName("A ");
        groupA.setTeam1("Brazil");
        groupA.setTeam2("Croatia");
        groupA.setTeam3("Mexico");
        groupA.setTeam4("Cameroon");
        myGroups[count] = groupA;
        count++;

        groupB.setGroupName("B ");
        groupB.setTeam1("Spain");
        groupB.setTeam2("Netherlands");
        groupB.setTeam3("Chile");
        groupB.setTeam4("Australia");
        myGroups[count] = groupB;
        count++;

        groupC.setGroupName("C ");
        groupC.setTeam1("Colombia");
        groupC.setTeam2("Greece");
        groupC.setTeam3("Côte d’Ivoire");
        groupC.setTeam4("Japan");
        myGroups[count] = groupC;
        count++;

        groupD.setGroupName("D ");
        groupD.setTeam1("Uruguay");
        groupD.setTeam2("Costa Rica");
        groupD.setTeam3("England");
        groupD.setTeam4("Italy");
        myGroups[count] = groupD;
        count++;

        groupE.setGroupName("E ");
        groupE.setTeam1("Switzerland");
        groupE.setTeam2("Ecuador");
        groupE.setTeam3("France");
        groupE.setTeam4("Honduras");
        myGroups[count] = groupE;
        count++;

        groupF.setGroupName("F ");
        groupF.setTeam1("Argentina");
        groupF.setTeam2("Bosnia and Herzegovina");
        groupF.setTeam3("Iran");
        groupF.setTeam4("Nigeria");
        myGroups[count] = groupF;
        count++;

        groupG.setGroupName("G ");
        groupG.setTeam1("Germany");
        groupG.setTeam2("Portugal");
        groupG.setTeam3("Ghana");
        groupG.setTeam4("USA");
        myGroups[count] = groupG;
        count++;

        groupH.setGroupName("H ");
        groupH.setTeam1("Belgium");
        groupH.setTeam2("Algeria");
        groupH.setTeam3("Russia");
        groupH.setTeam4("Korea Republic");
        myGroups[count] = groupH;
        count++;
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
        searchBtn = new javax.swing.JButton();
        searchTf = new javax.swing.JTextField();
        dispGrp = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        aBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        dBtn = new javax.swing.JButton();
        eBtn = new javax.swing.JButton();
        fBtn = new javax.swing.JButton();
        gBtn = new javax.swing.JButton();
        hBtn = new javax.swing.JButton();
        searchLbl = new javax.swing.JLabel();
        siteBtn = new javax.swing.JButton();
        gameBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        searchBtn.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/searchBtn.png"))); // NOI18N
        searchBtn.setBorderPainted(false);
        searchBtn.setContentAreaFilled(false);
        searchBtn.setFocusPainted(false);
        searchBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/searchhooverBtn.png"))); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn);
        searchBtn.setBounds(360, 30, 80, 20);

        searchTf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTfActionPerformed(evt);
            }
        });
        jPanel1.add(searchTf);
        searchTf.setBounds(250, 30, 100, 20);

        dispGrp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dispGrp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/displayallBtn.png"))); // NOI18N
        dispGrp.setBorderPainted(false);
        dispGrp.setContentAreaFilled(false);
        dispGrp.setFocusPainted(false);
        dispGrp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/displayallhooverBtn.png"))); // NOI18N
        dispGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispGrpActionPerformed(evt);
            }
        });
        jPanel1.add(dispGrp);
        dispGrp.setBounds(290, 570, 150, 40);

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
        homeBtn.setBounds(0, 0, 60, 60);

        aBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Abtn.png"))); // NOI18N
        aBtn.setBorderPainted(false);
        aBtn.setContentAreaFilled(false);
        aBtn.setFocusPainted(false);
        aBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/mouseoverA.png"))); // NOI18N
        aBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBtnActionPerformed(evt);
            }
        });
        jPanel1.add(aBtn);
        aBtn.setBounds(80, 160, 370, 40);

        bBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Bbtn.png"))); // NOI18N
        bBtn.setBorderPainted(false);
        bBtn.setContentAreaFilled(false);
        bBtn.setFocusPainted(false);
        bBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/mouseoverB.png"))); // NOI18N
        bBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBtnActionPerformed(evt);
            }
        });
        jPanel1.add(bBtn);
        bBtn.setBounds(100, 210, 350, 40);

        cBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Cbtn.png"))); // NOI18N
        cBtn.setBorderPainted(false);
        cBtn.setContentAreaFilled(false);
        cBtn.setFocusPainted(false);
        cBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/mouseoverC.png"))); // NOI18N
        cBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cBtn);
        cBtn.setBounds(120, 260, 340, 40);

        dBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Dbtn.png"))); // NOI18N
        dBtn.setBorderPainted(false);
        dBtn.setContentAreaFilled(false);
        dBtn.setFocusPainted(false);
        dBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/mouseoverD.png"))); // NOI18N
        dBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dBtn);
        dBtn.setBounds(150, 310, 300, 40);

        eBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Ebtn.png"))); // NOI18N
        eBtn.setBorderPainted(false);
        eBtn.setContentAreaFilled(false);
        eBtn.setFocusPainted(false);
        eBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/mouseoverE.png"))); // NOI18N
        eBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBtnActionPerformed(evt);
            }
        });
        jPanel1.add(eBtn);
        eBtn.setBounds(170, 360, 290, 40);

        fBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Fbtn.png"))); // NOI18N
        fBtn.setBorderPainted(false);
        fBtn.setContentAreaFilled(false);
        fBtn.setFocusPainted(false);
        fBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/mouseoverF.png"))); // NOI18N
        fBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fBtn);
        fBtn.setBounds(190, 410, 270, 40);

        gBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Gbtn.png"))); // NOI18N
        gBtn.setBorderPainted(false);
        gBtn.setContentAreaFilled(false);
        gBtn.setFocusPainted(false);
        gBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/mouseoverG.png"))); // NOI18N
        gBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBtnActionPerformed(evt);
            }
        });
        jPanel1.add(gBtn);
        gBtn.setBounds(220, 460, 240, 40);

        hBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Hbtn.png"))); // NOI18N
        hBtn.setBorderPainted(false);
        hBtn.setContentAreaFilled(false);
        hBtn.setFocusPainted(false);
        hBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/mouseoverH.png"))); // NOI18N
        hBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hBtnActionPerformed(evt);
            }
        });
        jPanel1.add(hBtn);
        hBtn.setBounds(240, 510, 220, 40);

        searchLbl.setBackground(new java.awt.Color(153, 153, 153));
        searchLbl.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        searchLbl.setForeground(new java.awt.Color(255, 255, 255));
        searchLbl.setText("Search by Team Name:");
        searchLbl.setOpaque(true);
        jPanel1.add(searchLbl);
        searchLbl.setBounds(110, 30, 140, 20);

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

        gameBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/predictionBtn.png"))); // NOI18N
        gameBtn.setBorderPainted(false);
        gameBtn.setContentAreaFilled(false);
        gameBtn.setFocusPainted(false);
        gameBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/predictionhooverBtn.png"))); // NOI18N
        gameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameBtnActionPerformed(evt);
            }
        });
        jPanel1.add(gameBtn);
        gameBtn.setBounds(380, 640, 60, 50);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/backgroundGroups.png"))); // NOI18N
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

    private void bBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBtnActionPerformed
        // TODO add your handling code here:
        BGroupTable b = new BGroupTable();
        b.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_bBtnActionPerformed

    private void cBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtnActionPerformed
        // TODO add your handling code here:
        CGroupTable c = new CGroupTable();
        c.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_cBtnActionPerformed

    private void dBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnActionPerformed
        // TODO add your handling code here:
        DGroupTable d = new DGroupTable();
        d.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_dBtnActionPerformed

    private void eBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBtnActionPerformed
        // TODO add your handling code here:
        EGroupTable e = new EGroupTable();
        e.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_eBtnActionPerformed

    private void fBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBtnActionPerformed
        // TODO add your handling code here:
        FGroupTable f = new FGroupTable();
        f.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_fBtnActionPerformed

    private void gBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBtnActionPerformed
        // TODO add your handling code here:
        GGroupTable g = new GGroupTable();
        g.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_gBtnActionPerformed

    private void hBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hBtnActionPerformed
        // TODO add your handling code here:
        HGroupTable h = new HGroupTable();
        h.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_hBtnActionPerformed

    private void dispGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispGrpActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < count; i++) {
            JOptionPane.showMessageDialog(null,"Group: " + myGroups[i].getGroupName() + "\nTeam 1: " + myGroups[i].getTeam1() + "\nTeam 2: " + myGroups[i].getTeam2() + "\nTeam 3: " + myGroups[i].getTeam3() + "\nTeam 4 " + myGroups[i].getTeam4() );
        }
    }//GEN-LAST:event_dispGrpActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String userTeam = searchTf.getText();
        int match = 0;
        //for loop for searching through the array
        for (int i = 0; i < count; i++) {
            if (myGroups[i].getTeam1().equalsIgnoreCase(userTeam)||myGroups[i].getTeam2().equalsIgnoreCase(userTeam)||myGroups[i].getTeam3().equalsIgnoreCase(userTeam)||myGroups[i].getTeam4().equalsIgnoreCase(userTeam)) {
                //Outputting the group name
                JOptionPane.showMessageDialog(null,"Chosen team is in Group: " + myGroups[i].getGroupName());
                match++;
            }
          
        }   
        if (match == 0) {
            JOptionPane.showMessageDialog(null, "Team you choose cannot be found. Please try again. ");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

private void searchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTfActionPerformed
 // TODO add your handling code here:
}//GEN-LAST:event_searchTfActionPerformed

    private void gameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameBtnActionPerformed
        // TODO add your handling code here:
        GameGUI s = new GameGUI();
        s.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_gameBtnActionPerformed

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

    private void aBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBtnActionPerformed
        // TODO add your handling code here:
        AGroupTable a = new AGroupTable();
        a.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_aBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GroupsGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aBtn;
    private javax.swing.JButton bBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton cBtn;
    private javax.swing.JButton dBtn;
    private javax.swing.JButton dispGrp;
    private javax.swing.JButton eBtn;
    private javax.swing.JButton fBtn;
    private javax.swing.JButton gBtn;
    private javax.swing.JButton gameBtn;
    private javax.swing.JButton hBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchLbl;
    private javax.swing.JTextField searchTf;
    private javax.swing.JButton siteBtn;
    // End of variables declaration//GEN-END:variables
}
