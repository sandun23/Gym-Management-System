/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gymmanagement.controller.ControllerFactory;
import lk.ijse.gymmanagement.controller.custom.AttendanceController;
import lk.ijse.gymmanagement.controller.custom.ClientController;
import lk.ijse.gymmanagement.controller.custom.RegistrationController;
import lk.ijse.gymmanagement.dto.AttendanceDTO;
import lk.ijse.gymmanagement.dto.ClientDTO;
import lk.ijse.gymmanagement.dto.QueryAttendenceDTO;
import lk.ijse.gymmanagement.dto.RegistrationDTO;
import lk.ijse.gymmanagement.idgenerator.IdGenerator;

/**
 *
 * @author Dilanka Virajith
 */
public class AttendencePanel extends javax.swing.JPanel {

    /**
     * Creates new form AttendencePanel
     */
    private ClientController ctrlclient;
    private AttendanceController attendanceController;
    private DefaultTableModel dtmAttendence;
    private AttendanceController ctrlAttendance;
    private RegistrationController ctrlRegistration;
    
    public AttendencePanel() {
        initComponents();
        classLoad();
//        loadCombomembershipNos();
        setDate();
        setTime();
       // loadData();
        //loadData();
        loadMembershipNo();
        loadData();
    }
    public void classLoad(){
        ctrlclient = (ClientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Client);
        attendanceController = (AttendanceController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Attendance);
        dtmAttendence = (DefaultTableModel) TableAttendence.getModel();
        ctrlAttendance = (AttendanceController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Attendance);
        ctrlRegistration = (RegistrationController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Registration);
    }
    
//    private void loadData(){
//        
//        try {
//            dtmAttendence.setRowCount(0);
//            ArrayList<QueryAttendenceDTO> getAll =ctrlAttendance.queryAttendenceDTOs();
//            for (QueryAttendenceDTO all : getAll) {
//                Object  [] rowdata ={all.getAID(),all.getMembership_No(),all.getName(),all.getA_Date(),all.getIn_Time(),all.getOut_Time()};
//                //System.out.println(rowdata);
//                dtmAttendence.addRow(rowdata);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(AttendencePanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    private void loadCombomembershipNos(){
//        try {
//            ArrayList<ClientDTO> all = ctrlclient.getAll(); 
//            MembershipNOCombo.removeAllItems();
//            for (ClientDTO all2 : all) {
//            MembershipNOCombo.addItem(all2.getClientID());
//                
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(SubAddSchedule.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            
//    }
    private void loadMembershipNo(){
        try {
            ArrayList<RegistrationDTO> all = ctrlRegistration.getAll();
            MembershipNOCombo.removeAllItems();
            for(RegistrationDTO all2 : all){
                MembershipNOCombo.addItem(all2.getMembership_No());
            }
        } catch (Exception ex) {
            Logger.getLogger(AttendencePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void setTime() {
        new Thread(() -> {
            while (true) {
                Date date = new Date();
                String currentdate = new SimpleDateFormat("hh:mm:ss aa").format(date);
                
                Timetf.setText(currentdate);
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
        dateTf.setText(sf.format(now));
    }
//    private void loadData(){
//        dtmAttendence.setRowCount(0);
//        try {
//            ArrayList<AttendanceDTO> allAttendanceDTOs = ctrlAttendance.getAll();
//            
//            if (allAttendanceDTOs == null) {
//                return;
//            }
//            for(AttendanceDTO attendance : allAttendanceDTOs){
//                Object[] rowData = {
//                    attendance.getAID(),
//                    attendance.getMembership_No(),
//                    attendance.getA_Date(),
//                    attendance.getIn_Time(),
//                    attendance.getOut_Time()
//                };
//                dtmAttendence.addRow(rowData);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(AttendencePanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    private void loadData(){
        try {
            dtmAttendence.setRowCount(0);
            ArrayList<QueryAttendenceDTO> queryAttendenceDTOs = ctrlAttendance.queryAttendenceDTOs();
            
           
            
            for (QueryAttendenceDTO queryAttendenceDTO : queryAttendenceDTOs){
                Object[] rowData = {
                    queryAttendenceDTO.getAID(),
                    queryAttendenceDTO.getMembership_No(),
                    queryAttendenceDTO.getfName(),
                    queryAttendenceDTO.getA_Date(),
                    queryAttendenceDTO.getOut_Time(),
                    queryAttendenceDTO.getIn_Time()
                };
                dtmAttendence.addRow(rowData);
                
            }
        } catch (Exception ex) {
            Logger.getLogger(AttendencePanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        MembershipNOCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        NameTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        otimeTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Timetf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AidTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAttendence = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("MemberShip No  :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        MembershipNOCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        MembershipNOCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MembershipNOComboItemStateChanged(evt);
            }
        });
        MembershipNOCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembershipNOComboActionPerformed(evt);
            }
        });
        add(MembershipNOCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 270, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name               :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        NameTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(NameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 270, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Date            :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, 30));

        dateTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(dateTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 270, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Out Time      :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, 30));

        jButton1.setFont(new java.awt.Font("Neuropol X Rg", 1, 13)); // NOI18N
        jButton1.setText("MARK NEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 80, 280, 40));

        otimeTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(otimeTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 270, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("In Time        :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        Timetf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(Timetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 270, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("AID                  :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        AidTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(AidTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, 30));

        TableAttendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AID", "Membership No", "Name", "Date", "In Time", "Out Time"
            }
        ));
        jScrollPane1.setViewportView(TableAttendence);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 1460, 520));

        jLabel30.setFont(new java.awt.Font("Neuropol X Rg", 1, 18)); // NOI18N
        jLabel30.setText("Mark Attendance");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 30, -1, -1));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1500, 820));

        jButton6.setText("MARK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 830, 150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String id = AidTf.getText();
            String date = dateTf.getText();
            String memberno = (String) MembershipNOCombo.getSelectedItem();
            String inTime = Timetf.getText();
            String outTime = otimeTf.getText();
            
            AttendanceDTO attendance = new AttendanceDTO(id, date, inTime, outTime, memberno);
            boolean isAdded = attendanceController.add(attendance);
            if (isAdded) {
                loadData();
                JOptionPane.showMessageDialog(this, "Mark Succus");
            }else{
                JOptionPane.showMessageDialog(this, "UnMark");
            }
        } catch (Exception ex) {
            Logger.getLogger(AttendencePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void MembershipNOComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MembershipNOComboItemStateChanged
//        String ClientID = MembershipNOCombo.getSelectedItem().toString();
//        
//        try {
//            ClientDTO client = ctrlclient.search(ClientID);
//            if (client == null) {
//                JOptionPane.showMessageDialog(this , "client no found");
//            }else{
//                NameTf.setText(client.getfName());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(SubAddSchedule.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        String Membership_No = MembershipNOCombo.getSelectedItem().toString();
//        
//        try {
//            RegistrationDTO registration = ctrlRegistration.search(Membership_No);
//            if (registration == null) {
//                JOptionPane.showMessageDialog(this, "Client no found");
//            }else{
//                NameTf.setText(registration.getMembership_No());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(AttendencePanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_MembershipNOComboItemStateChanged

    private void MembershipNOComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembershipNOComboActionPerformed
       String Membership_No = MembershipNOCombo.getSelectedItem().toString();
        
        try {
            RegistrationDTO registration = ctrlRegistration.search(Membership_No);
            
                //NameTf.setText(registration.getMembership_No());
                ClientDTO client = ctrlclient.search(registration.getClientID());
                NameTf.setText(client.getfName());
            
        } catch (Exception ex) {
            Logger.getLogger(AttendencePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MembershipNOComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String id = IdGenerator.getNewAttendanceId("Attendance", "AID", "A");
            AidTf.setText(id);
            otimeTf.requestFocusInWindow();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AttendencePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AttendencePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AidTf;
    private javax.swing.JComboBox MembershipNOCombo;
    private javax.swing.JTextField NameTf;
    private javax.swing.JTable TableAttendence;
    private javax.swing.JTextField Timetf;
    private javax.swing.JTextField dateTf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField otimeTf;
    // End of variables declaration//GEN-END:variables
}
