/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.view;


import com.sun.security.ntlm.Client;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.gymmanagement.controller.ControllerFactory;
import lk.ijse.gymmanagement.controller.custom.ClientController;
import lk.ijse.gymmanagement.controller.custom.RegistrationController;
import lk.ijse.gymmanagement.dto.ClientDTO;
import lk.ijse.gymmanagement.dto.RegistrationDTO;
import lk.ijse.gymmanagement.idgenerator.IdGenerator;
/**
 *
 * @author Dilanka Virajith
 */
public class SubRegisterClient extends javax.swing.JPanel {

    /**
     * Creates new form SubRegisterClient
     */
    private ClientController clientController;
    private RegistrationController registrationController;
    String gender;
    
    
    public SubRegisterClient() {
        
        initComponents();
        clientController = (ClientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Client);
        registrationController = (RegistrationController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Registration);
        ClientID();
        setDate();
       
    }
    private void ClientID() {
       
    }
    private void setDate() {
        Date now = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        DateTf.setText(sf.format(now));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SaveBtn1 = new javax.swing.JButton();
        DateTf = new javax.swing.JTextField();
        NicLbl2 = new javax.swing.JLabel();
        TelNoTf1 = new javax.swing.JTextField();
        TelNoLbl = new javax.swing.JLabel();
        EmailTf1 = new javax.swing.JTextField();
        EmailLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTa1 = new javax.swing.JTextArea();
        AddressLbl = new javax.swing.JLabel();
        AgeTf1 = new javax.swing.JTextField();
        AgeLbl = new javax.swing.JLabel();
        CidTf1 = new javax.swing.JTextField();
        CidLbl = new javax.swing.JLabel();
        membershipTf = new javax.swing.JTextField();
        NicLbl = new javax.swing.JLabel();
        NicTf2 = new javax.swing.JTextField();
        NicLbl1 = new javax.swing.JLabel();
        FNameLbl = new javax.swing.JLabel();
        FNameTf1 = new javax.swing.JTextField();
        LNameLbl = new javax.swing.JLabel();
        LNameTf1 = new javax.swing.JTextField();
        GenderLbl = new javax.swing.JLabel();
        genderCombo1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        BorderLbl1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SaveBtn1.setText("SAVE");
        SaveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtn1ActionPerformed(evt);
            }
        });
        add(SaveBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 700, 150, 40));

        DateTf.setEditable(false);
        DateTf.setBackground(new java.awt.Color(255, 255, 255));
        DateTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        DateTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTfActionPerformed(evt);
            }
        });
        add(DateTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 440, 30));

        NicLbl2.setBackground(new java.awt.Color(0, 0, 0));
        NicLbl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NicLbl2.setText("Date              :");
        add(NicLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 170, 30));

        TelNoTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TelNoTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelNoTf1ActionPerformed(evt);
            }
        });
        add(TelNoTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 440, 30));

        TelNoLbl.setBackground(new java.awt.Color(0, 0, 0));
        TelNoLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TelNoLbl.setText("Tele No          :");
        add(TelNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, -1, -1));

        EmailTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(EmailTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 440, 30));

        EmailLbl.setBackground(new java.awt.Color(0, 0, 0));
        EmailLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailLbl.setText("Email              :");
        add(EmailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, -1, -1));

        AddressTa1.setColumns(20);
        AddressTa1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AddressTa1.setRows(5);
        jScrollPane1.setViewportView(AddressTa1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 440, 110));

        AddressLbl.setBackground(new java.awt.Color(0, 0, 0));
        AddressLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressLbl.setText("Address           :");
        add(AddressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, -1, -1));

        AgeTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AgeTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTf1ActionPerformed(evt);
            }
        });
        add(AgeTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 440, 30));

        AgeLbl.setBackground(new java.awt.Color(0, 0, 0));
        AgeLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeLbl.setText("Age                :");
        add(AgeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        CidTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CidTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidTf1ActionPerformed(evt);
            }
        });
        add(CidTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 440, 30));

        CidLbl.setBackground(new java.awt.Color(0, 0, 0));
        CidLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CidLbl.setText("Client ID           : ");
        add(CidLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, 40));

        membershipTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        membershipTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipTfActionPerformed(evt);
            }
        });
        add(membershipTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 440, 30));

        NicLbl.setBackground(new java.awt.Color(0, 0, 0));
        NicLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NicLbl.setText("Membership No  :");
        add(NicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 170, 30));

        NicTf2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NicTf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NicTf2ActionPerformed(evt);
            }
        });
        add(NicTf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 440, 30));

        NicLbl1.setBackground(new java.awt.Color(0, 0, 0));
        NicLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NicLbl1.setText("NIC                  :");
        add(NicLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 160, 20));

        FNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        FNameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FNameLbl.setText("First Name         :");
        add(FNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 160, 30));

        FNameTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FNameTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTf1ActionPerformed(evt);
            }
        });
        add(FNameTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 440, 30));

        LNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        LNameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LNameLbl.setText("Last Name         :");
        add(LNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, 30));

        LNameTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        LNameTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameTf1ActionPerformed(evt);
            }
        });
        add(LNameTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 440, 30));

        GenderLbl.setBackground(new java.awt.Color(0, 0, 0));
        GenderLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GenderLbl.setText("Gender             :");
        add(GenderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, 30));

        genderCombo1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        genderCombo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Male", "Female" }));
        add(genderCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 440, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Personal Information");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, -1, 30));

        btnNew.setFont(new java.awt.Font("Neuropol X Rg", 1, 13)); // NOI18N
        btnNew.setText("ADD NEW MEMBER");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(1219, 40, 250, 40));

        BorderLbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(BorderLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1470, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtn1ActionPerformed
        try {
            String id = CidTf1.getText();
            String nic = NicTf2.getText();
            String fName = FNameTf1.getText();
            String lName = LNameTf1.getText();
            String address = AddressTa1.getText();
            
            if (genderCombo1.getSelectedItem().equals("Male")) {
                gender = "Male";
            }
            if (genderCombo1.getSelectedItem().equals("Female")) {
                gender = "Female";
            } else {
                
            }
            int age = Integer.parseInt(AgeTf1.getText());
            String email = EmailTf1.getText();
            int tele = Integer.parseInt(TelNoTf1.getText());
            
            ClientDTO client = new ClientDTO(id, nic, fName, lName, gender, age, address, email, tele);
            
            boolean isAdded = clientController.add(client);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Registration Success");
            } else {
                JOptionPane.showMessageDialog(this, "Registration Failed");
            }
        } catch (Exception ex) {
            Logger.getLogger(SubRegisterClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String membershipno = membershipTf.getText();
        String date = DateTf.getText();
        
        RegistrationDTO registration = new RegistrationDTO(membershipno, date,CidTf1.getText() );
        try {
            boolean isAdded = registrationController.add(registration);
        } catch (Exception ex) {
            Logger.getLogger(SubRegisterClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SaveBtn1ActionPerformed

    private void DateTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTfActionPerformed

    private void TelNoTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelNoTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelNoTf1ActionPerformed

    private void AgeTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTf1ActionPerformed

    private void CidTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidTf1ActionPerformed

    private void membershipTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_membershipTfActionPerformed

    private void NicTf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NicTf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NicTf2ActionPerformed

    private void FNameTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameTf1ActionPerformed

    private void LNameTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameTf1ActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        
        try {
            String id = IdGenerator.getNewAttendanceId("Client", "ClientID", "C");
            CidTf1.setText(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SubRegisterClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SubRegisterClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnNewActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl;
    private javax.swing.JTextArea AddressTa1;
    private javax.swing.JLabel AgeLbl;
    private javax.swing.JTextField AgeTf1;
    private javax.swing.JLabel BorderLbl1;
    private javax.swing.JLabel CidLbl;
    private javax.swing.JTextField CidTf1;
    private javax.swing.JTextField DateTf;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField EmailTf1;
    private javax.swing.JLabel FNameLbl;
    private javax.swing.JTextField FNameTf1;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JLabel LNameLbl;
    private javax.swing.JTextField LNameTf1;
    private javax.swing.JLabel NicLbl;
    private javax.swing.JLabel NicLbl1;
    private javax.swing.JLabel NicLbl2;
    private javax.swing.JTextField NicTf2;
    private javax.swing.JButton SaveBtn1;
    private javax.swing.JLabel TelNoLbl;
    private javax.swing.JTextField TelNoTf1;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox genderCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField membershipTf;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
