/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.view;

import javax.swing.SwingUtilities;
import static lk.ijse.gymmanagement.view.DashbordPanel.CenterPanel2;

/**
 *
 * @author Dilanka Virajith
 */
public class SettingsPanel extends javax.swing.JPanel {

    /**
     * Creates new form SettingsPanel
     */
    public SettingsPanel() {
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

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CenterPanel3 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Manage Exersizes");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/ExerSize.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 260, 210));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("User Acount");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 220, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/SearchMember.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 260, 210));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Backup & Reset");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 220, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/Backup.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 260, 210));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/AboutIcon.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 260, 210));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("About");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 260, 220, 30));

        CenterPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        CenterPanel3.setLayout(new java.awt.CardLayout());
        add(CenterPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 940));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        CenterPanel3.removeAll();
        CenterPanel3.setVisible(false);
        ExersizePanel co2 = new ExersizePanel();
        co2.setSize(CenterPanel3.getSize());
        NewHomepage frmHomePage = (NewHomepage) SwingUtilities.getWindowAncestor(this);
        NewHomepage.CenterPanel.removeAll();
        NewHomepage.CenterPanel.add(co2);
        NewHomepage.CenterPanel.updateUI();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPanel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
