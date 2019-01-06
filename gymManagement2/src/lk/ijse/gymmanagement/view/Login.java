/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.view;


import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Dilanka Virajith
 */
public class Login extends javax.swing.JFrame {
    String title = "Awoross Fitness Center";
    String subString = "";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        LabelElementHolder.setBackground(new Color(0,102,102,150));
        setTime();
        setDate();
        CapsLockLbl1.setVisible(false);
        boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        if (isOn == true) {
            CapsLockLbl1.setVisible(true);
        }
        
new Thread() {
            public void run() {
                for (int i = 0; i < title.length() + 1; i++) {
                    try {
                        if (i == title.length()) {
                            i = 0;
                            subString = "";
                        }
                        subString += title.substring(i, i + 1);
                        lblAnimation.setText(subString);
                        sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
        
    }
    
    private void setTime() {
        new Thread(() -> {
            while (true) {
                Date date = new Date();
                String currentdate = new SimpleDateFormat("hh:mm:ss aa").format(date);
                
                TimeLbl.setText(currentdate);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    
                }
            }
        }).start();
    }

    private void setDate() {
        Date now = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        DateLbl.setText(sf.format(now));
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
        DateLbl = new javax.swing.JLabel();
        TimeLbl = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        UserNameTf = new javax.swing.JTextField();
        UserNameLbl = new javax.swing.JLabel();
        CapsLockLbl1 = new javax.swing.JLabel();
        PasswordPf = new javax.swing.JPasswordField();
        PasswordLbl = new javax.swing.JLabel();
        FrogetPasswordLbl1 = new javax.swing.JLabel();
        FrogetPasswordLbl = new javax.swing.JLabel();
        LabelElementHolder = new javax.swing.JLabel();
        lblAnimation = new javax.swing.JLabel();
        SubLblAnimation = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1468, 994));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1468, 994));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1468, 994));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DateLbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DateLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(DateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 150, 40));

        TimeLbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TimeLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TimeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, 170, 40));

        LoginBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LoginBtn.setText("LOGIN");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 650, 310, 50));

        UserNameTf.setBackground(new java.awt.Color(51, 51, 51));
        UserNameTf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UserNameTf.setForeground(new java.awt.Color(255, 255, 255));
        UserNameTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        UserNameTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserNameTfKeyPressed(evt);
            }
        });
        jPanel1.add(UserNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 460, 40));

        UserNameLbl.setBackground(new java.awt.Color(255, 255, 255));
        UserNameLbl.setFont(new java.awt.Font("Neuropol X Rg", 1, 24)); // NOI18N
        UserNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        UserNameLbl.setText("User Name  :");
        jPanel1.add(UserNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 250, 40));

        CapsLockLbl1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CapsLockLbl1.setForeground(new java.awt.Color(0, 204, 0));
        CapsLockLbl1.setText("Caps Lock Is On");
        jPanel1.add(CapsLockLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 120, 30));

        PasswordPf.setBackground(new java.awt.Color(51, 51, 51));
        PasswordPf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PasswordPf.setForeground(new java.awt.Color(255, 255, 255));
        PasswordPf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PasswordPf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordPfKeyPressed(evt);
            }
        });
        jPanel1.add(PasswordPf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 460, 40));

        PasswordLbl.setBackground(new java.awt.Color(255, 255, 255));
        PasswordLbl.setFont(new java.awt.Font("Neuropol X Rg", 1, 24)); // NOI18N
        PasswordLbl.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLbl.setText("Password   :");
        jPanel1.add(PasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 250, 70));

        FrogetPasswordLbl1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        FrogetPasswordLbl1.setForeground(new java.awt.Color(0, 204, 0));
        FrogetPasswordLbl1.setText("Froget Your Password ?");
        jPanel1.add(FrogetPasswordLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 160, 30));

        FrogetPasswordLbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        FrogetPasswordLbl.setForeground(new java.awt.Color(0, 204, 0));
        FrogetPasswordLbl.setText("Learn More");
        jPanel1.add(FrogetPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 90, 30));

        LabelElementHolder.setBackground(new java.awt.Color(0, 102, 102));
        LabelElementHolder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LabelElementHolder.setOpaque(true);
        jPanel1.add(LabelElementHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 620, 730));

        lblAnimation.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAnimation.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblAnimation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 30));

        SubLblAnimation.setBackground(new java.awt.Color(102, 102, 102));
        SubLblAnimation.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SubLblAnimation.setForeground(new java.awt.Color(102, 102, 102));
        SubLblAnimation.setText("Awoross Fitness Center");
        jPanel1.add(SubLblAnimation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 430, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/Loading image.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 990));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1468, 994));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        String Username=UserNameTf.getText();
        String Password=PasswordPf.getText();
        if (Username.equals("dilanka")&&Password.equals("dilanka")) {
            new NewHomepage().setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Username or Password is incorrect");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void PasswordPfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordPfKeyPressed
        boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        if (isOn == true) {
            CapsLockLbl1.setVisible(true);
        } else {
            CapsLockLbl1.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(PasswordPf.getText())) {
                JOptionPane.showMessageDialog(Login.this, "Please enter password");
            } else {
                LoginBtn.doClick();
            }

        }// TODO add your handling code here:
    }//GEN-LAST:event_PasswordPfKeyPressed

    private void UserNameTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameTfKeyPressed
        boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        if (isOn == true) {
            CapsLockLbl1.setVisible(true);
        } else {
            CapsLockLbl1.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(UserNameTf.getText())) {
                JOptionPane.showMessageDialog(Login.this, "Please enter username");
            } else {
                PasswordPf.requestFocus();
            }

        }// TODO add your handling code here:
    }//GEN-LAST:event_UserNameTfKeyPressed

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
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CapsLockLbl1;
    private javax.swing.JLabel DateLbl;
    private javax.swing.JLabel FrogetPasswordLbl;
    private javax.swing.JLabel FrogetPasswordLbl1;
    private javax.swing.JLabel LabelElementHolder;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel PasswordLbl;
    private javax.swing.JPasswordField PasswordPf;
    private javax.swing.JLabel SubLblAnimation;
    private javax.swing.JLabel TimeLbl;
    private javax.swing.JLabel UserNameLbl;
    private javax.swing.JTextField UserNameTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnimation;
    // End of variables declaration//GEN-END:variables
}
