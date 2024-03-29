/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.view;

/**
 *
 * @author Dilanka Virajith
 */
public class ReportPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportPanel
     */
    public ReportPanel() {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CenterPanel3 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Attendence");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/ViewAll.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 260, 210));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Member Details");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 220, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/SearchMember.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 260, 210));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("$");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 30, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Payments");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 220, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/Payment_1.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 260, 210));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Shedules");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 220, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/Schedule.png"))); // NOI18N
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 260, 210));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Exersizes");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 260, 220, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gymmanagement/images/ExerSize.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 90, 260, 210));

        CenterPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        CenterPanel3.setLayout(new java.awt.CardLayout());
        add(CenterPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 940));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPanel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
