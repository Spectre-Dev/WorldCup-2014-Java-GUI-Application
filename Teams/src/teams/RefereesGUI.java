/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 * RefereesGUI.java
 * @author Richie Mangan
 *  StudentNumber: X13114514
 * This class lists all referees in the WC214 either by listing all, or by searching by nationality
 */
import javax.swing.JOptionPane;

public class RefereesGUI extends javax.swing.JFrame {
    //Declaring variables
    String refName, nationality, role, federation, photo;
    private int numGames, counter, refNumber;
    boolean match;
    
    //declaring and creating an Array of 25 objects
    Referee refsArray[] = new Referee[25];

    //Constructor - Initialising variabes
    public RefereesGUI() {
        initComponents();
        refName = new String();
        numGames = 0;
        nationality = new String();
        role = new String();
        federation = new String();
        photo = new String();
        counter = 0;    //This is used when traversing the array later in the for loop
        refNumber = 1; //This is used in the JOptionPane to show the ref number in the list.
        match = false;
        initReferees();
    }

    //creatng instances of the referee class for use below in creating objects with referee stats
    public final void initReferees() {
        Referee ref1 = new Referee();
        Referee ref2 = new Referee();
        Referee ref3 = new Referee();
        Referee ref4 = new Referee();
        Referee ref5 = new Referee();
        Referee ref6 = new Referee();
        Referee ref7 = new Referee();
        Referee ref8 = new Referee();
        Referee ref9 = new Referee();
        Referee ref10 = new Referee();
        Referee ref11 = new Referee();
        Referee ref12 = new Referee();
        Referee ref13 = new Referee();
        Referee ref14 = new Referee();
        Referee ref15 = new Referee();
        Referee ref16 = new Referee();
        Referee ref17 = new Referee();
        Referee ref18 = new Referee();
        Referee ref19 = new Referee();
        Referee ref20 = new Referee();
        Referee ref21 = new Referee();
        Referee ref22 = new Referee();
        Referee ref23 = new Referee();
        Referee ref24 = new Referee();
        Referee ref25 = new Referee();

        //Populating the objects with referee stats
        ref1.setRefName("Ravshan Irmatov");
        ref1.setNationality("Uzbekistan");
        ref1.setNumGames(17);
        ref1.setFederation("AFC");
        ref1.setPhoto("");
        refsArray[counter] = ref1;
        counter++;

        ref2.setRefName("Yuichi Nishimura");
        ref2.setNationality("Japan");
        ref2.setNumGames(2);
        ref2.setFederation("AFC");
        ref2.setPhoto("");
        refsArray[counter] = ref2;
        counter++;

        ref3.setRefName("Nawaf Shukralla");
        ref3.setNationality("Bahrain");
        ref3.setNumGames(1);
        ref3.setFederation("AFC");
        ref3.setPhoto("");
        refsArray[counter] = ref3;
        counter++;

        ref4.setRefName("Ben Williams");
        ref4.setNationality("Austrailia");
        ref4.setNumGames(66);
        ref4.setFederation("AFC");
        ref4.setPhoto("");
        refsArray[counter] = ref4;
        counter++;

        ref5.setRefName("Noumandiez Doué");
        ref5.setNationality("Ivory Coast");
        ref5.setNumGames(5);
        ref5.setFederation("CAF");
        ref5.setPhoto("");
        refsArray[counter] = ref5;
        counter++;

        ref6.setRefName("Bakary Gassama");
        ref6.setNationality("Gambia");
        ref6.setNumGames(3);
        ref6.setFederation("CAF");
        ref6.setPhoto("");
        refsArray[counter] = ref6;
        counter++;

        ref7.setRefName("Djamel Haimoudi");
        ref7.setNationality("Algeria");
        ref7.setNumGames(5);
        ref7.setFederation("CAF");
        ref7.setPhoto("");
        refsArray[counter] = ref7;
        counter++;

        ref8.setRefName("Joel Aguilar");
        ref8.setNationality("El Salvadore");
        ref8.setNumGames(13);
        ref8.setFederation("CONCACAF");
        ref8.setPhoto("");
        refsArray[counter] = ref8;
        counter++;

        ref9.setRefName("Mark Geiger");
        ref9.setNationality("America");
        ref9.setNumGames(8);
        ref9.setFederation("CONCACAF");
        ref9.setPhoto("");
        refsArray[counter] = ref9;
        counter++;

        ref10.setRefName("Marco Rodríguez");
        ref10.setNationality("Mexico");
        ref10.setNumGames(4);
        ref10.setFederation("CONCACAF");
        ref10.setPhoto("");
        refsArray[counter] = ref10;
        counter++;

        ref11.setRefName("Néstor Pitana");
        ref11.setNationality("Argentina");
        ref11.setNumGames(0);
        ref11.setFederation("CONMEBOL");
        ref11.setPhoto("");
        refsArray[counter] = ref11;
        counter++;

        ref12.setRefName("Sandro Ricci");
        ref12.setNationality("Brazil");
        ref12.setNumGames(1);
        ref12.setFederation("CONMEBOL");
        ref12.setPhoto("");
        refsArray[counter] = ref12;
        counter++;

        ref13.setRefName("Enrique Osses");
        ref13.setNationality("Chile");
        ref13.setNumGames(5);
        ref13.setFederation("CONMEBOL");
        ref13.setPhoto("");
        refsArray[counter] = ref13;
        counter++;

        ref14.setRefName("Wilmar Roldán");
        ref14.setNationality("Columbia");
        ref14.setNumGames(5);
        ref14.setFederation("CONMEBOL");
        ref14.setPhoto("");
        refsArray[counter] = ref14;
        counter++;

        ref15.setRefName("Carlos Vera");
        ref15.setNationality("Ecuador");
        ref15.setNumGames(6);
        ref15.setFederation("CONMEBOL");
        ref15.setPhoto("");
        refsArray[counter] = ref15;
        counter++;

        ref16.setRefName("Peter O'Leary");
        ref16.setNationality("New Zealand");
        ref16.setNumGames(4);
        ref16.setFederation("OFC");
        ref16.setPhoto("");
        refsArray[counter] = ref16;
        counter++;

        ref17.setRefName("Felix Brych");
        ref17.setNationality("Germany");
        ref17.setNumGames(6);
        ref17.setFederation("UEFA");
        ref17.setPhoto("");
        refsArray[counter] = ref17;
        counter++;

        ref18.setRefName("Cüneyt Çakır");
        ref18.setNationality("Turkey");
        ref18.setNumGames(16);
        ref18.setFederation("UEFA");
        ref18.setPhoto("");
        refsArray[counter] = ref18;
        counter++;

        ref19.setRefName("Jonas Eriksson");
        ref19.setNationality("Sweden");
        ref19.setNumGames(22);
        ref19.setFederation("UEFA");
        ref19.setPhoto("");
        refsArray[counter] = ref19;
        counter++;

        ref20.setRefName("Björn Kuipers");
        ref20.setNationality("Neatherlands");
        ref20.setNumGames(15);
        ref20.setFederation("UEFA");
        ref20.setPhoto("");
        refsArray[counter] = ref20;
        counter++;

        ref21.setRefName("Milorad Mažić");
        ref21.setNationality("Serbia");
        ref21.setNumGames(26);
        ref21.setFederation("UEFA");
       ref21.setPhoto("");
        refsArray[counter] = ref21;
        counter++;

        ref22.setRefName("Pedro Proença");
        ref22.setNationality("Portugal");
        ref22.setNumGames(32);
        ref22.setFederation("UEFA");
        ref22.setPhoto("");
        refsArray[counter] = ref22;
        counter++;

        ref23.setRefName("Nicola Rizzoli");
        ref23.setNationality("Italy");
        ref23.setNumGames(31);
        ref23.setFederation("UEFA");
        ref23.setPhoto("");
        refsArray[counter] = ref23;
        counter++;

        ref24.setRefName("Carlos Velasco Carballo");
        ref24.setNationality("Spain");
        ref24.setNumGames(66);
        ref24.setFederation("UEFA");
        ref24.setPhoto("");
        refsArray[counter] = ref24;
        counter++;

        ref25.setRefName("Howard Webb");
        ref25.setNationality("Spain");
        ref25.setNumGames(42);
        ref25.setFederation("UEFA");
        ref25.setPhoto("");
        refsArray[counter] = ref25;
        counter++;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        refTA = new javax.swing.JTextArea();
        NationalityTf = new javax.swing.JTextField();
        nationalityBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        bacBtn = new javax.swing.JButton();
        homBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        refTA.setColumns(20);
        refTA.setRows(4);
        refTA.setOpaque(false);
        jScrollPane1.setViewportView(refTA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 430, 250, 260);

        NationalityTf.setText("Search by Country:");
        NationalityTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityTfActionPerformed(evt);
            }
        });
        NationalityTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NationalityTfKeyPressed(evt);
            }
        });
        jPanel1.add(NationalityTf);
        NationalityTf.setBounds(10, 387, 120, 22);

        nationalityBtn.setText("Search");
        nationalityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityBtnActionPerformed(evt);
            }
        });
        nationalityBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nationalityBtnKeyPressed(evt);
            }
        });
        jPanel1.add(nationalityBtn);
        nationalityBtn.setBounds(150, 385, 110, 25);

        displayBtn.setFont(new java.awt.Font("Helvetica LT Std Light", 0, 18)); // NOI18N
        displayBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/allRefs.png"))); // NOI18N
        displayBtn.setBorderPainted(false);
        displayBtn.setContentAreaFilled(false);
        displayBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/allRefsHover.png"))); // NOI18N
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });
        jPanel1.add(displayBtn);
        displayBtn.setBounds(190, 182, 260, 110);

        bacBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Back Button (2).png"))); // NOI18N
        bacBtn.setBorderPainted(false);
        bacBtn.setContentAreaFilled(false);
        bacBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/backHover.png"))); // NOI18N
        bacBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacBtnActionPerformed(evt);
            }
        });
        jPanel1.add(bacBtn);
        bacBtn.setBounds(390, 0, 60, 60);

        homBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeButton2_2.png"))); // NOI18N
        homBtn.setBorderPainted(false);
        homBtn.setContentAreaFilled(false);
        homBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeButton2hover.png"))); // NOI18N
        homBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homBtn);
        homBtn.setBounds(0, 0, 60, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/BackgroundRefsPage.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 450, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(468, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bacBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacBtnActionPerformed
        RulesRegsGUI myRules = new RulesRegsGUI();
        myRules.setVisible(true);

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bacBtnActionPerformed

    private void homBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homBtnActionPerformed
        // TODO add your handling code here:
        WorldCup myHome = new WorldCup();
        myHome.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_homBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
       // Traversing the array and displaying each referee to the user.
        refTA.setText("");
        refNumber = 1;
        for (int i = 0; i < counter; i++) {
            refTA.append("Referee " + refNumber + "\nName: " + refsArray[i].getRefName() + "\nNation: " + refsArray[i].getNationality() + "\nNumber of Games: " + refsArray[i].getNumGames() + "\nFederation: " + refsArray[i].getFederation() + "\n\n");
            //JOptionPane.showMessageDialog(null, "Referee " + refNumber + "\nName: " + refsArray[i].getRefName() + "\nNation: " + refsArray[i].getNationality() + "\nNumber of Games: " + refsArray[i].getNumGames() + "\nFederation: " + refsArray[i].getFederation());
            refNumber++;
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void NationalityTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityTfActionPerformed

    private void nationalityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityBtnActionPerformed
        //setting match variable to detect if user input has been found in the array
        match = false;
       refTA.setText("");
        
        //Storing the user input to search by nationality 
        String userNation = NationalityTf.getText();
        
        //for loop with nested if statement to traverse the array, looking for objects that match the users choice of nationality
        for (int i = 0; i < refsArray.length; i++) {
            if (refsArray[i].getNationality().equalsIgnoreCase(userNation)) {
                match = true;
                refTA.append("Name: " + refsArray[i].getRefName() + "\nCountry: " + refsArray[i].getNationality() + "\nGames: " + refsArray[i].getNumGames() + "\nConfederation: " + refsArray[i].getFederation() + "\n\n");
           
            }
        }   //outputting a message to the user of no match is found
        if (match == false) {
            refTA.setText("Sorry, No match found: ");
            //JOptionPane.showMessageDialog(null, "Sorry, No match found: ");
        }
    }//GEN-LAST:event_nationalityBtnActionPerformed

    private void nationalityBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nationalityBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityBtnKeyPressed

    private void NationalityTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NationalityTfKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityTfKeyPressed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RefereesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RefereesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RefereesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RefereesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new RefereesGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NationalityTf;
    private javax.swing.JButton bacBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton homBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nationalityBtn;
    private javax.swing.JTextArea refTA;
    // End of variables declaration//GEN-END:variables
}
