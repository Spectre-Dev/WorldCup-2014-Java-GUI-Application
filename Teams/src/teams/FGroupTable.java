/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

import java.awt.Desktop;
import java.net.URL;

/**
 * @author Dzulija Puspure
 * @author x13399691
 */
public class FGroupTable extends javax.swing.JFrame {

    /**
     * Creates new form FGroupTable
     */
    public FGroupTable() {
        initComponents();
    }
    
    public void tableF(){
   
    
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
        siteBtn = new javax.swing.JButton();
        fullBtn = new javax.swing.JButton();
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

        fullBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/scheduleBtn.png"))); // NOI18N
        fullBtn.setBorderPainted(false);
        fullBtn.setContentAreaFilled(false);
        fullBtn.setFocusPainted(false);
        fullBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/schedulehooverBtn.png"))); // NOI18N
        fullBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fullBtn);
        fullBtn.setBounds(120, 470, 200, 30);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/BackgroundGF.png"))); // NOI18N
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

    private void fullBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullBtnActionPerformed
        // TODO add your handling code here:
        Schedule x = new Schedule();
        x.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_fullBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FGroupTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FGroupTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FGroupTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FGroupTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FGroupTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton fullBtn;
    private javax.swing.JButton groupBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton siteBtn;
    // End of variables declaration//GEN-END:variables
}
