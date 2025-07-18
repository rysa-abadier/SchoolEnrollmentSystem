/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.abadier.enrolmentsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author ron.g.abadier
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        headerTitle = new javax.swing.JLabel();
        headerUsername = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        headerPassword = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        buttonLogin = new javax.swing.JButton();
        buttonSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Enrolment System");
        setLocation(new java.awt.Point(300, 150));
        setResizable(false);

        headerTitle.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        headerTitle.setText("SCHOOL ENROLMENT SYSTEM");

        headerUsername.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        headerUsername.setText("ID Number");

        fieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsernameActionPerformed(evt);
            }
        });

        headerPassword.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        headerPassword.setText("Password");

        buttonLogin.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonSignUp.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        buttonSignUp.setText("Create new account?");
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(headerTitle)
                    .addComponent(headerUsername)
                    .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headerPassword)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLogin)
                    .addComponent(buttonSignUp))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(headerTitle)
                .addGap(18, 18, 18)
                .addComponent(headerUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(headerPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonLogin)
                .addGap(37, 37, 37)
                .addComponent(buttonSignUp)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        buttonLogin.getAccessibleContext().setAccessibleName("login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsernameActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        boolean userFound = false;
        boolean retry = true;
        
        String[] realUsername = new String[]{"admin", "student", "teacher", "registrar"};
        String realPassword = "1234";
                
        String username = fieldUsername.getText();        
        String password = new String(fieldPassword.getPassword());
        
        do {
            for (String testUsername : realUsername) {
                if (username.equals(testUsername) && password.equals(realPassword)){
                    userFound = true;
                    retry = false;

                    javax.swing.JFrame successfulLogin = new javax.swing.JFrame();
                    javax.swing.JOptionPane.showMessageDialog(successfulLogin, "You have successfully logged in!");
                    this.setVisible(false);

                    switch(username){
                        case "admin" -> {
                            AdminWindow aw = new AdminWindow();
                            aw.show();
                            aw.setLocationRelativeTo(null);
                            dispose();
                        }
                        case "student" -> {
                            StudentWindow sw = new StudentWindow();
                            sw.show();
                            sw.setLocationRelativeTo(null);
                            dispose();
                        }
                        case "teacher" -> {
                            TeacherWindow tw = new TeacherWindow();
                            tw.show();
                            tw.setLocationRelativeTo(null);
                            dispose();
                        }
                        case "registrar" -> {
                            RegistrarWindow rw = new RegistrarWindow();
                            rw.show();
                            rw.setLocationRelativeTo(null);
                            dispose();
                        }
                    }
                    break;
                }
                retry = true;
                userFound = false;
            } 
            if (retry) {
                if (username.equals("") && password.equals("")){
                    javax.swing.JFrame emptyFields = new javax.swing.JFrame();
                    javax.swing.JOptionPane.showMessageDialog(emptyFields, "Login failed! Username and password cannot be empty.");
                    break;
                } else if (username.equals("")){
                    javax.swing.JFrame emptyFieldUsername = new javax.swing.JFrame();
                    javax.swing.JOptionPane.showMessageDialog(emptyFieldUsername, "Login failed! Username cannot be empty.");
                    break;
                } else if (password.equals("")){
                    javax.swing.JFrame emptyFieldPassword = new javax.swing.JFrame();
                    javax.swing.JOptionPane.showMessageDialog(emptyFieldPassword, "Login failed! Password cannot be empty.");
                    break;
                } else {
                    javax.swing.JFrame failedLogin = new javax.swing.JFrame();
                    javax.swing.JOptionPane.showMessageDialog(failedLogin, "Login failed! Please check your credentials.");
                    break;
                }
            } 
        } while (!userFound);
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        boolean repeat = true;
        String userType;
        javax.swing.JFrame chooseUserType = new javax.swing.JFrame();
        do {
            repeat = false;
            userType = JOptionPane.showInputDialog(chooseUserType, "Are you a student [S], teacher [T], administrator [A], or registrar [R]?: ");
            userType.toLowerCase();

            switch (userType){
                case "s" -> {
                    this.setVisible(false);
                    StudentSignUp ssu = new StudentSignUp();
                    ssu.show();
                    ssu.setLocationRelativeTo(null);
                    dispose();
                }
                case "t" -> {
                    this.setVisible(false);
                    TeacherSignUp tsu = new TeacherSignUp();
                    tsu.show();
                    tsu.setLocationRelativeTo(null);
                    dispose();
                }
                case "a" -> {
                    this.setVisible(false);
                    AdminSignUp asu = new AdminSignUp();
                    asu.show();
                    asu.setLocationRelativeTo(null);
                    dispose();
                }
                case "r" -> {
                    this.setVisible(false);
                    RegistrarSignUp rsu = new RegistrarSignUp();
                    rsu.show();
                    rsu.setLocationRelativeTo(null);
                    dispose();
                }
                default -> {
                    repeat = true;
                    javax.swing.JFrame failedSignUp = new javax.swing.JFrame();
                    javax.swing.JOptionPane.showMessageDialog(failedSignUp, "Sign-up failed! Please try again.");
                }
            } 
        } while (repeat);
    }//GEN-LAST:event_buttonSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    public static String getUsername(String username){
        return username;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel headerPassword;
    private javax.swing.JLabel headerTitle;
    private javax.swing.JLabel headerUsername;
    // End of variables declaration//GEN-END:variables
}
