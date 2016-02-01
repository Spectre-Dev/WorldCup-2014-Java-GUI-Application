/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author: Ian Cunnngham
 * @student Number: x13114425
 * @File: Quiz.java
 */
public class Quiz extends javax.swing.JFrame {

    int count;

    /**
     * Creates new form Quiz
     */
    public Quiz() {
        initComponents();
        quizTF.setVisible(false);
        ans1RBtn.setVisible(false);
        ans2RBtn.setVisible(false);
        ans3RBtn.setVisible(false);
        submitBtn2.setVisible(false);
        submitBtn3.setVisible(false);
        submitBtn4.setVisible(false);
        submitBtn5.setVisible(false);
        answerTF.setVisible(false);
        //jTextArea1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        startBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        ans2RBtn = new javax.swing.JRadioButton();
        ans1RBtn = new javax.swing.JRadioButton();
        ans3RBtn = new javax.swing.JRadioButton();
        submitBtn = new javax.swing.JButton();
        submitBtn2 = new javax.swing.JButton();
        submitBtn3 = new javax.swing.JButton();
        submitBtn4 = new javax.swing.JButton();
        submitBtn5 = new javax.swing.JButton();
        quizTF = new javax.swing.JTextField();
        titleLbl = new javax.swing.JLabel();
        countLbl = new javax.swing.JLabel();
        scoreLbl = new javax.swing.JLabel();
        answerTF = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        teamsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        jPanel1.add(startBtn);
        startBtn.setBounds(10, 140, 70, 25);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);
        exitBtn.setBounds(370, 140, 70, 25);

        buttonGroup1.add(ans2RBtn);
        ans2RBtn.setText("ans 2");
        ans2RBtn.setContentAreaFilled(false);
        ans2RBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans2RBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ans2RBtn);
        ans2RBtn.setBounds(110, 310, 250, 50);

        buttonGroup1.add(ans1RBtn);
        ans1RBtn.setText("ans 1");
        ans1RBtn.setContentAreaFilled(false);
        jPanel1.add(ans1RBtn);
        ans1RBtn.setBounds(110, 290, 250, 50);

        buttonGroup1.add(ans3RBtn);
        ans3RBtn.setText("ans 3");
        ans3RBtn.setContentAreaFilled(false);
        jPanel1.add(ans3RBtn);
        ans3RBtn.setBounds(110, 330, 250, 50);

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn);
        submitBtn.setBounds(180, 460, 80, 25);

        submitBtn2.setText("Submit");
        submitBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn2);
        submitBtn2.setBounds(180, 460, 80, 25);

        submitBtn3.setText("Submit");
        submitBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn3ActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn3);
        submitBtn3.setBounds(180, 460, 80, 25);

        submitBtn4.setText("Submit");
        submitBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn4ActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn4);
        submitBtn4.setBounds(180, 460, 80, 25);

        submitBtn5.setText("Submit");
        submitBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn5ActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn5);
        submitBtn5.setBounds(180, 460, 80, 25);

        quizTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quizTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quizTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizTFActionPerformed(evt);
            }
        });
        jPanel1.add(quizTF);
        quizTF.setBounds(75, 170, 300, 130);

        titleLbl.setFont(new java.awt.Font("Mangal", 0, 30)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Quiz");
        jPanel1.add(titleLbl);
        titleLbl.setBounds(185, 75, 80, 40);

        countLbl.setBackground(new java.awt.Color(255, 255, 255));
        countLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        countLbl.setOpaque(true);
        jPanel1.add(countLbl);
        countLbl.setBounds(350, 460, 40, 25);

        scoreLbl.setBackground(new java.awt.Color(204, 204, 204));
        scoreLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        scoreLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLbl.setText("Score");
        scoreLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scoreLbl.setOpaque(true);
        jPanel1.add(scoreLbl);
        scoreLbl.setBounds(300, 460, 50, 25);

        answerTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTFActionPerformed(evt);
            }
        });
        jPanel1.add(answerTF);
        answerTF.setBounds(120, 320, 210, 22);

        saveBtn.setText("Save Score");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveBtn);
        saveBtn.setBounds(330, 540, 110, 40);

        nameLbl.setBackground(new java.awt.Color(204, 204, 204));
        nameLbl.setFont(new java.awt.Font("Mangal", 1, 13)); // NOI18N
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLbl.setText("Enter Name:");
        nameLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nameLbl.setOpaque(true);
        jPanel1.add(nameLbl);
        nameLbl.setBounds(10, 540, 110, 40);

        nameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(nameTF);
        nameTF.setBounds(120, 540, 110, 40);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/Back Button.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.setContentAreaFilled(false);
        backBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/backHover.fw.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn);
        backBtn.setBounds(5, 5, 50, 50);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeButton2.png"))); // NOI18N
        homeBtn.setBorder(null);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/homeHover.fw.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn);
        homeBtn.setBounds(70, 5, 50, 50);

        viewBtn.setText("View Scores");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewBtn);
        viewBtn.setBounds(330, 590, 110, 40);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/BackgroundNoText.jpg"))); // NOI18N
        jPanel1.add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 450, 700);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 450, 700);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(450, 700));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(120, 440, 450, 700);

        teamsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/TeamsButton.fw.png"))); // NOI18N
        teamsBtn.setBorder(null);
        teamsBtn.setContentAreaFilled(false);
        teamsBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/teams/pictures/TeamsButtonHover.fw.png"))); // NOI18N
        teamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(teamsBtn);
        teamsBtn.setBounds(345, 5, 100, 50);

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

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        Quiz myQuiz = new Quiz();
        myQuiz.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void ans2RBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans2RBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans2RBtnActionPerformed

    private void quizTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizTFActionPerformed
        // TODO add your handling code hkjhhh
    }//GEN-LAST:event_quizTFActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        // TODO add your handling code here:
        answerTF.setText("");
        count = 0;
        nameTF.setText("");
        quizTF.setVisible(true);
        answerTF.setVisible(true);
        submitBtn.setVisible(true);

        String question, answer, option1, option2, option3;
        BasicQ b;
        question = "What team won the 1998 Fifa World Cup?";
        quizTF.setText(question);
        answer = answerTF.getText();
        b = new BasicQ(question, answer);
        countLbl.setText(Integer.toString(count));
    }//GEN-LAST:event_startBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        String answer;
        answer = answerTF.getText();

        if (answer.equalsIgnoreCase("France")) {
            JOptionPane.showMessageDialog(null, "That is correct!");
            count = Integer.parseInt(countLbl.getText());
            countLbl.setText(Integer.toString(count + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, That is incorrect!");
        }

        //next question
        ans2RBtn.setVisible(true);
        ans1RBtn.setVisible(true);
        ans3RBtn.setVisible(true);
        answerTF.setVisible(false);
        buttonGroup1.clearSelection();

        String question, option1, option2, option3;
        MultipleQ m;
        question = "What team won the 2006 Fifa World Cup?";
        quizTF.setText(question);
        answer = "Italy";
        option1 = "Germany";
        ans2RBtn.setText(option1);
        option2 = answer;
        ans1RBtn.setText(option2);
        option3 = "Spain";
        ans3RBtn.setText(option3);
        m = new MultipleQ(question, answer, option1, option2, option3);

        submitBtn.setVisible(false);
        submitBtn2.setVisible(true);
    }//GEN-LAST:event_submitBtnActionPerformed

    private void submitBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn2ActionPerformed
        // TODO add your handling code here:


        if (ans1RBtn.isSelected()) {
            JOptionPane.showMessageDialog(null, "Correct, " + ans1RBtn.getText() + " won the 2006 Final");
            count = Integer.parseInt(countLbl.getText());
            countLbl.setText(Integer.toString(count + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, That is wrong");
        }

        //next question
        ans1RBtn.setVisible(false);
        ans2RBtn.setVisible(false);
        ans3RBtn.setVisible(false);
        answerTF.setVisible(true);
        answerTF.setText("");

        String question, answer, option1, option2, option3;
        BasicQ b2;
        question = "What year did England last win the World Cup?";
        quizTF.setText(question);
        answer = answerTF.getText();
        b2 = new BasicQ(question, answer);

        submitBtn2.setVisible(false);
        submitBtn3.setVisible(true);
    }//GEN-LAST:event_submitBtn2ActionPerformed

    private void submitBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn3ActionPerformed
        // TODO add your handling code here:
        String answer;
        answer = answerTF.getText();

        if (answer.equalsIgnoreCase("1966")) {
            JOptionPane.showMessageDialog(null, "That is correct, England last won the World Cup in 1966");
            count = Integer.parseInt(countLbl.getText());
            countLbl.setText(Integer.toString(count + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, That is incorrect!");
        }

        //next question
        ans2RBtn.setVisible(true);
        ans1RBtn.setVisible(true);
        ans3RBtn.setVisible(true);
        answerTF.setVisible(false);
        buttonGroup1.clearSelection();

        String question, option1, option2, option3;
        MultipleQ m2;
        question = "Who is the current captain of Portugal?";
        quizTF.setText(question);
        answer = "Cristiano Ronaldo";
        option1 = answer;
        ans2RBtn.setText(option1);
        option2 = "Pepe";
        ans1RBtn.setText(option2);
        option3 = "Joao Moutinho";
        ans3RBtn.setText(option3);
        m2 = new MultipleQ(question, answer, option1, option2, option3);

        submitBtn3.setVisible(false);
        submitBtn4.setVisible(true);
    }//GEN-LAST:event_submitBtn3ActionPerformed

    private void submitBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn4ActionPerformed
        // TODO add your handling code here:
        if (ans2RBtn.isSelected()) {
            JOptionPane.showMessageDialog(null, "Correct, " + ans2RBtn.getText() + " is the captain of Portugal");
            count = Integer.parseInt(countLbl.getText());
            countLbl.setText(Integer.toString(count + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, That is wrong");
        }

        //next question
        ans1RBtn.setVisible(false);
        ans2RBtn.setVisible(false);
        ans3RBtn.setVisible(false);
        answerTF.setVisible(true);
        answerTF.setText("");

        String question, answer, option1, option2, option3;
        BasicQ b3;
        question = "What team has won the World Cup the most times?";
        quizTF.setText(question);
        answer = answerTF.getText();
        b3 = new BasicQ(question, answer);

        submitBtn4.setVisible(false);
        submitBtn5.setVisible(true);

    }//GEN-LAST:event_submitBtn4ActionPerformed

    private void submitBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn5ActionPerformed
        // TODO add your handling code here:
        String answer;
        answer = answerTF.getText();

        if (answer.equalsIgnoreCase("Brazil")) {
            JOptionPane.showMessageDialog(null, "That is correct, Brazil have won the most World Cups with five titles and is the only team to have played in every World Cup");
            count = Integer.parseInt(countLbl.getText());
            countLbl.setText(Integer.toString(count + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, That is incorrect!");
        }

        //end of quiz
        JOptionPane.showMessageDialog(null, "End of quiz, Your score is " + countLbl.getText() + "/5. \nPlease enter your name and save your result");

        quizTF.setVisible(false);
        answerTF.setVisible(false);
        submitBtn.setVisible(false);
        submitBtn2.setVisible(false);
        submitBtn3.setVisible(false);
        submitBtn4.setVisible(false);
        submitBtn5.setVisible(false);


    }//GEN-LAST:event_submitBtn5ActionPerformed

    private void answerTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTFActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        WorldCup myHome = new WorldCup();
        myHome.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        Teams myTeams = new Teams();
        myTeams.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        //declare File, FileWriter and BufferedWriter
        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        //declare string variable name and assign the text from name TextField to the variable
        String name = nameTF.getText();
        String score = countLbl.getText();

        try {
            outFile = new File("Scores.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);
            
            
            bw.write(name+" "+score);
            bw.newLine();

            bw.close();
            JOptionPane.showMessageDialog(null, "Thank you for taking the quiz!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file: " + e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
          
        jPanel1.removeAll();        //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        jPanel1.repaint();          //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        jPanel1.revalidate();       //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        
        jPanel1.add(jPanel2);       //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        jPanel2.add(jTextArea1);
        jTextArea1.add(teamsBtn);
        jPanel1.repaint();          //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1
        jPanel1.revalidate();       //https://www.youtube.com/watch?v=nm5ULDfbKD0&noredirect=1

        String name;
        
        File inFile;
        FileReader fr;
        BufferedReader br;

        try {
            inFile = new File("Scores.txt");
            fr = new FileReader(inFile);
            br = new BufferedReader(fr);
            
            br = new BufferedReader(new FileReader("Scores.txt"));

            name = br.readLine();
            while (name != null) {
                jTextArea1.append(name+" \n");
                //JOptionPane.showMessageDialog(null, "Name: "+name);
                name = br.readLine();
                
            }
                
            br.close();
            
        
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file: " + e);
        }
    
    }//GEN-LAST:event_viewBtnActionPerformed

    private void teamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamsBtnActionPerformed
        // TODO add your handling code here:
        Teams myTeams = new Teams();
        myTeams.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_teamsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ans1RBtn;
    private javax.swing.JRadioButton ans2RBtn;
    private javax.swing.JRadioButton ans3RBtn;
    private javax.swing.JTextField answerTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel countLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField quizTF;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel scoreLbl;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton submitBtn2;
    private javax.swing.JButton submitBtn3;
    private javax.swing.JButton submitBtn4;
    private javax.swing.JButton submitBtn5;
    private javax.swing.JButton teamsBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}