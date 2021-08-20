/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminResources;

import dailycompetitiveprogramming.WelcomeFrame;
import dailycompetitiveprogramming.SolvingProgress;

/**
 *
 * @author HP
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminPanel = new javax.swing.JPanel();
        ProgressCheck = new javax.swing.JPanel();
        Check = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CheckArea = new javax.swing.JTextArea();
        FeedbackCheck = new javax.swing.JPanel();
        Check1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CheckArea1 = new javax.swing.JTextArea();
        UserCheck = new javax.swing.JPanel();
        Check2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        CheckArea2 = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daily Competitive Programming - Admin Panel");

        AdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        AdminPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        AdminPanel.setForeground(new java.awt.Color(255, 255, 255));

        ProgressCheck.setBackground(new java.awt.Color(102, 102, 102));
        ProgressCheck.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Progress History", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Check.setBackground(new java.awt.Color(0, 0, 0));
        Check.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Check.setForeground(new java.awt.Color(255, 255, 255));
        Check.setText("CHECK");
        Check.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        CheckArea.setEditable(false);
        CheckArea.setBackground(new java.awt.Color(0, 0, 0));
        CheckArea.setColumns(20);
        CheckArea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CheckArea.setForeground(new java.awt.Color(255, 255, 255));
        CheckArea.setRows(5);
        jScrollPane1.setViewportView(CheckArea);

        javax.swing.GroupLayout ProgressCheckLayout = new javax.swing.GroupLayout(ProgressCheck);
        ProgressCheck.setLayout(ProgressCheckLayout);
        ProgressCheckLayout.setHorizontalGroup(
            ProgressCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProgressCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(ProgressCheckLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProgressCheckLayout.setVerticalGroup(
            ProgressCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProgressCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        FeedbackCheck.setBackground(new java.awt.Color(102, 102, 102));
        FeedbackCheck.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Feedbacks of System", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Check1.setBackground(new java.awt.Color(0, 0, 0));
        Check1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Check1.setForeground(new java.awt.Color(255, 255, 255));
        Check1.setText("CHECK");
        Check1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Check1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check1ActionPerformed(evt);
            }
        });

        CheckArea1.setEditable(false);
        CheckArea1.setBackground(new java.awt.Color(0, 0, 0));
        CheckArea1.setColumns(20);
        CheckArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CheckArea1.setForeground(new java.awt.Color(255, 255, 255));
        CheckArea1.setRows(5);
        jScrollPane2.setViewportView(CheckArea1);

        javax.swing.GroupLayout FeedbackCheckLayout = new javax.swing.GroupLayout(FeedbackCheck);
        FeedbackCheck.setLayout(FeedbackCheckLayout);
        FeedbackCheckLayout.setHorizontalGroup(
            FeedbackCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FeedbackCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FeedbackCheckLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Check1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        FeedbackCheckLayout.setVerticalGroup(
            FeedbackCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Check1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        UserCheck.setBackground(new java.awt.Color(102, 102, 102));
        UserCheck.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "System User List", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Check2.setBackground(new java.awt.Color(0, 0, 0));
        Check2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Check2.setForeground(new java.awt.Color(255, 255, 255));
        Check2.setText("CHECK");
        Check2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Check2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check2ActionPerformed(evt);
            }
        });

        CheckArea2.setEditable(false);
        CheckArea2.setBackground(new java.awt.Color(0, 0, 0));
        CheckArea2.setColumns(20);
        CheckArea2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CheckArea2.setForeground(new java.awt.Color(255, 255, 255));
        CheckArea2.setRows(5);
        jScrollPane3.setViewportView(CheckArea2);

        javax.swing.GroupLayout UserCheckLayout = new javax.swing.GroupLayout(UserCheck);
        UserCheck.setLayout(UserCheckLayout);
        UserCheckLayout.setHorizontalGroup(
            UserCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserCheckLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(Check2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        UserCheckLayout.setVerticalGroup(
            UserCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Check2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        back.setBackground(new java.awt.Color(102, 102, 102));
        back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(102, 102, 102));
        exit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(ProgressCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FeedbackCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UserCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProgressCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(FeedbackCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        WelcomeFrame welcome = new WelcomeFrame();
        welcome.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        Admin admin = new Admin();
        String history = admin.readAllProgressHistory();
        CheckArea.setText(history);
        admin.checked();
    }//GEN-LAST:event_CheckActionPerformed

    private void Check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check1ActionPerformed
        Admin admin = new Admin();
        String feedback = admin.readFeedbacks();
        CheckArea1.setText(feedback);
        admin.checked();
    }//GEN-LAST:event_Check1ActionPerformed

    private void Check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check2ActionPerformed
        Admin admin = new Admin();
        String userList = admin.readUserList();
        CheckArea2.setText(userList);
        admin.checked();
    }//GEN-LAST:event_Check2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JButton Check;
    private javax.swing.JButton Check1;
    private javax.swing.JButton Check2;
    private javax.swing.JTextArea CheckArea;
    private javax.swing.JTextArea CheckArea1;
    private javax.swing.JTextArea CheckArea2;
    private javax.swing.JPanel FeedbackCheck;
    private javax.swing.JPanel ProgressCheck;
    private javax.swing.JPanel UserCheck;
    private javax.swing.JButton back;
    private javax.swing.JButton exit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
