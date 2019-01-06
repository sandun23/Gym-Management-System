/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.view;


import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gymmanagement.controller.ControllerFactory;
import lk.ijse.gymmanagement.controller.custom.InstructorController;
import lk.ijse.gymmanagement.dto.InstructorDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class InstructorPanel extends javax.swing.JPanel {

    /**
     * Creates new form SubTrainerAdd
     */
    private InstructorController instructorController;
    private DefaultTableModel dtm;
    private InstructorController ctrlInstructor;
    
    String igender;
    public InstructorPanel() {
        initComponents();
        instructorController = (InstructorController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Instructor);
        ctrlInstructor = (InstructorController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Instructor);
        dtm = (DefaultTableModel) InsInstructorTbl.getModel();
        loadData();
    }
    private void loadData() {
        dtm.setRowCount(0);
        try {
            ArrayList<InstructorDTO> allInstructorDTOs = ctrlInstructor.getAll();

            if (allInstructorDTOs == null) {
                return;
            }
            for (InstructorDTO instructor : allInstructorDTOs) {
                Object[] rowData = {
                    instructor.getInstructorID(),
                    instructor.getNic(),
                    instructor.getfName(),
                    instructor.getlName(),
                    instructor.getGender(),
                    instructor.getAge(),
                    instructor.getAddress(),
                    instructor.getEmail(),
                    instructor.getTelNo()
                };
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CidLbl = new javax.swing.JLabel();
        InstructerIdTf1 = new javax.swing.JTextField();
        NicTf1 = new javax.swing.JTextField();
        NicLbl = new javax.swing.JLabel();
        FNameLbl = new javax.swing.JLabel();
        FNameTf1 = new javax.swing.JTextField();
        LNameLbl = new javax.swing.JLabel();
        LNameTf1 = new javax.swing.JTextField();
        AgeTf1 = new javax.swing.JTextField();
        AgeLbl = new javax.swing.JLabel();
        AddressLbl = new javax.swing.JLabel();
        EmailTf1 = new javax.swing.JTextField();
        EmailLbl = new javax.swing.JLabel();
        TelNoTf1 = new javax.swing.JTextField();
        TelNoLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InsInstructorTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AddressTf1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        genderCombo11 = new javax.swing.JComboBox();
        GenderLbl = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CidLbl.setBackground(new java.awt.Color(0, 0, 0));
        CidLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CidLbl.setText("Instructor Id      :");
        add(CidLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        InstructerIdTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        InstructerIdTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructerIdTf1ActionPerformed(evt);
            }
        });
        add(InstructerIdTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 440, 30));

        NicTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NicTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NicTf1ActionPerformed(evt);
            }
        });
        add(NicTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 440, 30));

        NicLbl.setBackground(new java.awt.Color(0, 0, 0));
        NicLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NicLbl.setText("NIC                 :");
        add(NicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, -1));

        FNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        FNameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FNameLbl.setText("First Name        :");
        add(FNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 150, -1));

        FNameTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FNameTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTf1ActionPerformed(evt);
            }
        });
        add(FNameTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 440, 30));

        LNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        LNameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LNameLbl.setText("Last Name        :");
        add(LNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 160, 40));

        LNameTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        LNameTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameTf1ActionPerformed(evt);
            }
        });
        add(LNameTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 440, 30));

        AgeTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(AgeTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 440, 30));

        AgeLbl.setBackground(new java.awt.Color(0, 0, 0));
        AgeLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeLbl.setText("Age                :");
        add(AgeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        AddressLbl.setBackground(new java.awt.Color(0, 0, 0));
        AddressLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressLbl.setText("Address           :");
        add(AddressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        EmailTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(EmailTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 440, 30));

        EmailLbl.setBackground(new java.awt.Color(0, 0, 0));
        EmailLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailLbl.setText("Email               :");
        add(EmailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        TelNoTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TelNoTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelNoTf1ActionPerformed(evt);
            }
        });
        add(TelNoTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, 440, 30));

        TelNoLbl.setBackground(new java.awt.Color(0, 0, 0));
        TelNoLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TelNoLbl.setText("Tele No           :");
        add(TelNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, -1, -1));

        InsInstructorTbl.setBackground(new java.awt.Color(240, 240, 240));
        InsInstructorTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instructor ID", "NIC", "First Name", "Last Name", "Gender", "Age", "Address", "Email", "Tele No"
            }
        ));
        InsInstructorTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsInstructorTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(InsInstructorTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 800, 570));

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 640, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Personal Information");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 190, 40));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1490, 760));

        AddressTf1.setColumns(20);
        AddressTf1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AddressTf1.setRows(5);
        jScrollPane2.setViewportView(AddressTf1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 440, -1));

        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 840, 150, 40));

        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 840, 150, 40));

        jButton7.setText("UPDATE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 840, 150, 40));

        jLabel30.setFont(new java.awt.Font("Neuropol X Rg", 1, 18)); // NOI18N
        jLabel30.setText("Manage Instructors");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 40, -1, -1));

        genderCombo11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        genderCombo11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        add(genderCombo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 440, 30));

        GenderLbl.setBackground(new java.awt.Color(0, 0, 0));
        GenderLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GenderLbl.setText("Gender             :");
        add(GenderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void InstructerIdTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstructerIdTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstructerIdTf1ActionPerformed

    private void NicTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NicTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NicTf1ActionPerformed

    private void FNameTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameTf1ActionPerformed

    private void LNameTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameTf1ActionPerformed

    private void TelNoTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelNoTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelNoTf1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
            String id = InstructerIdTf1.getText();
            String nic = NicTf1.getText();
            String fName = FNameTf1.getText();
            String lName = LNameTf1.getText();
            String address = AddressTf1.getText();
            
            if (genderCombo11.getSelectedItem().equals("Male")) {
                igender = "Male";
            }
            if (genderCombo11.getSelectedItem().equals("Female")) {
                igender = "Female";
            } else {
            }
            int age = Integer.parseInt(AgeTf1.getText());
            String email = EmailTf1.getText();
            int tele = Integer.parseInt(TelNoTf1.getText());
            
            InstructorDTO instructor = new InstructorDTO(id, nic, fName, lName, igender, age, address, email, tele);
            
            try{
            boolean isAdded = instructorController.add(instructor);
            
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Registration Success");
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "Registration Failed");
            }
            } catch (Exception ex) {
            Logger.getLogger(InstructorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String InstructorID = dtm.getValueAt(InsInstructorTbl.getSelectedRow(),0).toString();
        
        try {
        String TelNo = dtm.getValueAt(InsInstructorTbl.getSelectedRow(),0).toString();
            boolean deleted = ctrlInstructor.delete(InstructorID);
            //int index = ClientTbl.getSelectedRow();
           // dtmClient.removeRow(index);
            if (deleted) {
                JOptionPane.showMessageDialog(this, "Success");
                
                int index = InsInstructorTbl.getSelectedRow();
                dtm.removeRow(index);
            }else{
                JOptionPane.showMessageDialog(this, "Faild");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dtm.setRowCount(0);
            String id = InstructerIdTf1.getText();
            String nic = NicTf1.getText();
            String fName = FNameTf1.getText();
            String lName = LNameTf1.getText();
            String address = AddressTf1.getText();
            String gender =(String) genderCombo11.getSelectedItem();
            int age = Integer.parseInt(AgeTf1.getText());
            String email = EmailTf1.getText();
            int tele = Integer.parseInt(TelNoTf1.getText());
            
            InstructorDTO instructor = new InstructorDTO(nic, nic, fName, lName, igender, age, address, email, tele);
            
        try {
            boolean isUpdate =instructorController.add(instructor);
            //boolean isUpdate = InstructorController.update(instructor);
            if (isUpdate){
             dtm.setRowCount(0);
             
             ArrayList<InstructorDTO> allInstructorDTOs = ctrlInstructor.getAll();

            if (allInstructorDTOs == null) {
                return;
            }
                for (InstructorDTO instructorDTO : allInstructorDTOs) {
                 Object[] rowData = {
                    instructorDTO.getInstructorID(),
                    instructorDTO.getNic(),
                    instructorDTO.getfName(),
                    instructorDTO.getlName(),
                    instructorDTO.getGender(),
                    instructorDTO.getAge(),
                    instructorDTO.getAddress(),
                    instructorDTO.getEmail(),
                    instructorDTO.getTelNo()
                };
                dtm.addRow(rowData);
                    
                }
               
                JOptionPane.showMessageDialog(this, "Update Success");
            }else{
                JOptionPane.showMessageDialog(this, "Update Faild");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void InsInstructorTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsInstructorTblMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) InsInstructorTbl.getModel();
        InstructerIdTf1.setText(InsInstructorTbl.getValueAt(InsInstructorTbl.getSelectedRow(),0).toString());
        NicTf1.setText(InsInstructorTbl.getValueAt(InsInstructorTbl.getSelectedRow(),1).toString());
        FNameTf1.setText(InsInstructorTbl.getValueAt(InsInstructorTbl.getSelectedRow(),2).toString());
        LNameTf1.setText(InsInstructorTbl.getValueAt(InsInstructorTbl.getSelectedRow(),3).toString());
        genderCombo11.addItem(InsInstructorTbl.getValueAt(InsInstructorTbl.getSelectedRow(),4).toString());
        AgeTf1.setText(InsInstructorTbl.getValueAt(InsInstructorTbl.getSelectedRow(),5).toString());
        AddressTf1.setText(InsInstructorTbl.getValueAt(InsInstructorTbl.getSelectedRow(),6).toString());
        EmailTf1.setText(InsInstructorTbl.getValueAt(InsInstructorTbl.getSelectedRow(),7).toString());
        TelNoTf1 .setText(InsInstructorTbl.getValueAt(InsInstructorTbl.getSelectedRow(),8).toString());
    }//GEN-LAST:event_InsInstructorTblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl;
    private javax.swing.JTextArea AddressTf1;
    private javax.swing.JLabel AgeLbl;
    private javax.swing.JTextField AgeTf1;
    private javax.swing.JLabel CidLbl;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField EmailTf1;
    private javax.swing.JLabel FNameLbl;
    private javax.swing.JTextField FNameTf1;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JTable InsInstructorTbl;
    private javax.swing.JTextField InstructerIdTf1;
    private javax.swing.JLabel LNameLbl;
    private javax.swing.JTextField LNameTf1;
    private javax.swing.JLabel NicLbl;
    private javax.swing.JTextField NicTf1;
    private javax.swing.JLabel TelNoLbl;
    private javax.swing.JTextField TelNoTf1;
    private javax.swing.JComboBox genderCombo11;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}