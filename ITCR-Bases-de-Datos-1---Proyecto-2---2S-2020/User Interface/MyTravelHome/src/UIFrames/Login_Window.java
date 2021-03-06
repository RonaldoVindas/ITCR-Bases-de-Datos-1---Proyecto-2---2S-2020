/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIFrames;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo
 */
public class Login_Window extends javax.swing.JFrame {

    /**
     * Creates new form Logiin_Window
     */
    public Login_Window() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Log_In_Label = new javax.swing.JLabel();
        Line_label = new javax.swing.JLabel();
        Username_Label = new javax.swing.JLabel();
        Exit_Button = new javax.swing.JButton();
        Password_label = new javax.swing.JLabel();
        Username_TextField = new javax.swing.JTextField();
        Wallpaper_Label = new javax.swing.JLabel();
        LoginButton_Panel = new javax.swing.JPanel();
        Login_Button = new javax.swing.JButton();
        Password_TextField = new javax.swing.JPasswordField();
        LoginButton_Panel1 = new javax.swing.JPanel();
        Login_Button1 = new javax.swing.JButton();
        External_Frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Log_In_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        Log_In_Label.setForeground(new java.awt.Color(129, 52, 175));
        Log_In_Label.setText("Log In");
        getContentPane().add(Log_In_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 120, 50));

        Line_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line.PNG"))); // NOI18N
        Line_label.setText("jLabel3");
        getContentPane().add(Line_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 10, 500));

        Username_Label.setBackground(new java.awt.Color(81, 91, 212));
        Username_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        Username_Label.setForeground(new java.awt.Color(81, 91, 212));
        Username_Label.setText("Username or Email:");
        getContentPane().add(Username_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 250, 30));

        Exit_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit Button.png"))); // NOI18N
        Exit_Button.setToolTipText("");
        Exit_Button.setBorder(null);
        Exit_Button.setContentAreaFilled(false);
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 30, 30));

        Password_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        Password_label.setForeground(new java.awt.Color(81, 91, 212));
        Password_label.setText("Password:");
        getContentPane().add(Password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 140, 30));

        Username_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Username_TextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Username_TextField.setForeground(new java.awt.Color(32, 21, 14));
        Username_TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Username_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 91, 212)));
        Username_TextField.setCaretColor(new java.awt.Color(0, 102, 204));
        Username_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Username_TextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Username_TextFieldMouseExited(evt);
            }
        });
        Username_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(Username_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 370, 40));

        Wallpaper_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wallpaper4.jpg"))); // NOI18N
        getContentPane().add(Wallpaper_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 700));

        LoginButton_Panel.setBackground(new java.awt.Color(221, 42, 123));
        LoginButton_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_Button.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Login_Button.setForeground(new java.awt.Color(255, 255, 255));
        Login_Button.setText("Login");
        Login_Button.setBorderPainted(false);
        Login_Button.setContentAreaFilled(false);
        Login_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login_ButtonMouseExited(evt);
            }
        });
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });
        LoginButton_Panel.add(Login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        getContentPane().add(LoginButton_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 230, 30));

        Password_TextField.setBackground(new java.awt.Color(255, 255, 255));
        Password_TextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Password_TextField.setForeground(new java.awt.Color(32, 21, 14));
        Password_TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 91, 212)));
        Password_TextField.setCaretColor(new java.awt.Color(0, 102, 204));
        getContentPane().add(Password_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 370, 40));

        LoginButton_Panel1.setBackground(new java.awt.Color(245, 133, 41));
        LoginButton_Panel1.setToolTipText("");
        LoginButton_Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_Button1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Login_Button1.setForeground(new java.awt.Color(255, 255, 255));
        Login_Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eye Icon.png"))); // NOI18N
        Login_Button1.setBorderPainted(false);
        Login_Button1.setContentAreaFilled(false);
        Login_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login_Button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login_Button1MouseExited(evt);
            }
        });
        Login_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_Button1ActionPerformed(evt);
            }
        });
        LoginButton_Panel1.add(Login_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        getContentPane().add(LoginButton_Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 420, 40, -1));

        External_Frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_Wallpaper.jpg"))); // NOI18N
        getContentPane().add(External_Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed

        //Split_Second.Split_Second.username = Username_TextField.getText();

        String pUsername = Username_TextField.getText();
        String pPassword = Password_TextField.getText();

        //Admin_Main_Menu result = new Admin_Main_Menu();
        //result.setVisible(true);
        //this.setVisible(false);
        /*
        try {
            /* int identification = Connection.DBConnection.get_person_identification(pUsername);*/
            /*Split_Second.Split_Second.identification = identification;*/
            /*
        } catch (SQLException ex) {
            Logger.getLogger(Login_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*

        int res = 0;

        try {
            res = Connection.DBConnection.get_Login(pUsername, pPassword);

        } catch (SQLException ex) {
            Logger.getLogger(Login_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (res == 1){ //Si es Admin
            Admin_Main_Menu result = new Admin_Main_Menu();
            result.setVisible(true);
            this.setVisible(false);

        }
        else if (res == 2){ // Si es User
            User_Main_Menu result = new User_Main_Menu();
            result.setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);

        }

        */

    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void Login_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_ButtonMouseExited
        LoginButton_Panel.setBackground(new java.awt.Color(92,79,46));
    }//GEN-LAST:event_Login_ButtonMouseExited

    private void Login_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_ButtonMouseEntered
        LoginButton_Panel.setBackground(new java.awt.Color(68,58,34));
    }//GEN-LAST:event_Login_ButtonMouseEntered

    private void Login_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_Button1ActionPerformed

    private void Login_Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_Button1MouseExited
        Password_TextField.setEchoChar('*');
    }//GEN-LAST:event_Login_Button1MouseExited

    private void Login_Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_Button1MouseEntered
        Password_TextField.setEchoChar((char)0);
    }//GEN-LAST:event_Login_Button1MouseEntered

    private void Username_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_TextFieldActionPerformed
        Username_TextField.setText("");
    }//GEN-LAST:event_Username_TextFieldActionPerformed

    private void Username_TextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Username_TextFieldMouseExited
        Username_TextField.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Username_TextFieldMouseExited

    private void Username_TextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Username_TextFieldMouseEntered
        Username_TextField.setBackground(new java.awt.Color(216,216,216));
    }//GEN-LAST:event_Username_TextFieldMouseEntered

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
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_Button;
    private javax.swing.JLabel External_Frame;
    private javax.swing.JLabel Line_label;
    private javax.swing.JLabel Log_In_Label;
    private javax.swing.JPanel LoginButton_Panel;
    private javax.swing.JPanel LoginButton_Panel1;
    private javax.swing.JButton Login_Button;
    private javax.swing.JButton Login_Button1;
    private javax.swing.JPasswordField Password_TextField;
    private javax.swing.JLabel Password_label;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JTextField Username_TextField;
    private javax.swing.JLabel Wallpaper_Label;
    // End of variables declaration//GEN-END:variables
}
