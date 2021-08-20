package dailycompetitiveprogramming;


import dailycompetitiveprogramming.Feedback;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class GuestFrame extends javax.swing.JFrame {
    String guest="";
    /**
     * Creates new form GuestFrame
     */
    public GuestFrame() {
        initComponents();
    }
    public void setGuestName(String guest){
        this.guest = guest;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Guide = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        Welcome1 = new javax.swing.JLabel();
        Welcome2 = new javax.swing.JLabel();
        Welcome3 = new javax.swing.JLabel();
        Welcome4 = new javax.swing.JLabel();
        Guidelines = new javax.swing.JButton();
        feedback = new javax.swing.JButton();
        mainMenu = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Guideline = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        feed = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daily Competitive Programming - Guest Mode");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 255), null, null));
        jPanel2.setAlignmentX(1.0F);

        Welcome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Welcome.setForeground(new java.awt.Color(0, 0, 153));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("Dear Guest,");

        Welcome1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Welcome1.setForeground(new java.awt.Color(0, 0, 153));
        Welcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome1.setText("We see, you are interested in knowing about Competitive");

        Welcome2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Welcome2.setForeground(new java.awt.Color(0, 0, 153));
        Welcome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome2.setText("Programming and this system. Please go through guidelines");

        Welcome3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Welcome3.setForeground(new java.awt.Color(0, 0, 153));
        Welcome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome3.setText("for more understanding. You can give a feedback also.");

        Welcome4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Welcome4.setForeground(new java.awt.Color(0, 0, 153));
        Welcome4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome4.setText("Thank You!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Welcome1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Welcome2)
                            .addComponent(Welcome3)
                            .addComponent(Welcome4))))
                .addGap(276, 276, 276))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Welcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Welcome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Welcome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Welcome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Welcome4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Guidelines.setBackground(new java.awt.Color(0, 204, 255));
        Guidelines.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Guidelines.setForeground(new java.awt.Color(0, 0, 102));
        Guidelines.setText("Guidelines");
        Guidelines.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Guidelines.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guidelines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuidelinesActionPerformed(evt);
            }
        });

        feedback.setBackground(new java.awt.Color(255, 51, 255));
        feedback.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        feedback.setForeground(new java.awt.Color(0, 0, 102));
        feedback.setText("Feedback");
        feedback.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        feedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });

        mainMenu.setBackground(new java.awt.Color(255, 0, 0));
        mainMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mainMenu.setForeground(new java.awt.Color(0, 0, 102));
        mainMenu.setText("Main Menu");
        mainMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 204, 0));
        exit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 102));
        exit.setText("Exit");
        exit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        Guideline.setEditable(false);
        Guideline.setColumns(20);
        Guideline.setRows(5);
        Guideline.setText("Click Guidelines Button to \nview Guidelines");
        jScrollPane1.setViewportView(Guideline);

        feed.setColumns(20);
        feed.setRows(5);
        feed.setText("Give us some Feedback");
        jScrollPane2.setViewportView(feed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(Guidelines, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guidelines, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuidelinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuidelinesActionPerformed
        try{
            File f = new File("Guidelines.txt");
            Scanner input = new Scanner(f);
            String guideLines = "";
            while(input.hasNext()){
                guideLines+=input.nextLine()+"\n";
            }
            Guideline.setText(guideLines);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "File not found");
        }
    }//GEN-LAST:event_GuidelinesActionPerformed

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
        WelcomeFrame welcome = new WelcomeFrame();
        welcome.setVisible(true);
        dispose();
    }//GEN-LAST:event_mainMenuActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackActionPerformed
        String feedback = null;
        feedback = feed.getText();
        Feedback newFeed = new Feedback(feedback,guest);
        newFeed.saveFeedbacks();
        feed.setText(null);
        JOptionPane.showMessageDialog(this, "Thank you for the feedback!");
    }//GEN-LAST:event_feedbackActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(GuestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Guide;
    private javax.swing.JTextArea Guideline;
    private javax.swing.JButton Guidelines;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel Welcome1;
    private javax.swing.JLabel Welcome2;
    private javax.swing.JLabel Welcome3;
    private javax.swing.JLabel Welcome4;
    private javax.swing.JButton exit;
    private javax.swing.JTextArea feed;
    private javax.swing.JButton feedback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainMenu;
    // End of variables declaration//GEN-END:variables
}
