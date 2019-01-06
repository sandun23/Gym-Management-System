/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.view;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gymmanagement.controller.ControllerFactory;
import lk.ijse.gymmanagement.controller.custom.ClientController;
import lk.ijse.gymmanagement.dto.ClientDTO;
import lk.ijse.gymmanagement.dto.RegistrationDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class ManageClients extends javax.swing.JPanel {

    private ClientController ctrlClient;
    private DefaultTableModel dtmClient;
    private ClientController clientController;
    
    /**
     * Creates new form SubRegPayment
     */

    String gender;

    public ManageClients() {
        initComponents();
        ctrlClient = (ClientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Client);
        dtmClient = (DefaultTableModel) ClientTbl.getModel();
        clientController = (ClientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Client);
        loadData();
    }

    private void loadData() {
        dtmClient.setRowCount(0);
        try {
            ArrayList<ClientDTO> allClientDTOs = ctrlClient.getAll();

            if (allClientDTOs == null) {
                return;
            }
            for (ClientDTO client : allClientDTOs) {
                Object[] rowData = {
                    client.getClientID(),
                    client.getNic(),
                    client.getfName(),
                    client.getlName(),
                    client.getGender(),
                    client.getAge(),
                    client.getAddress(),
                    client.getEmail(),
                    client.getTelNo()
                };
                dtmClient.addRow(rowData);
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

        UpdateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BorderLbl1 = new javax.swing.JLabel();
        CidLbl2 = new javax.swing.JLabel();
        SearchIdTf2 = new javax.swing.JTextField();
        SearchNameTf2 = new javax.swing.JTextField();
        CidLbl1 = new javax.swing.JLabel();
        GenderTf = new javax.swing.JTextField();
        GenderLbl = new javax.swing.JLabel();
        LNameLbl = new javax.swing.JLabel();
        FNameTf = new javax.swing.JTextField();
        FNameLbl = new javax.swing.JLabel();
        NicTf = new javax.swing.JTextField();
        NicLbl1 = new javax.swing.JLabel();
        CidTf = new javax.swing.JTextField();
        CidLbl = new javax.swing.JLabel();
        AgeLbl = new javax.swing.JLabel();
        AgeTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTa = new javax.swing.JTextArea();
        AddressLbl = new javax.swing.JLabel();
        EmailTf = new javax.swing.JTextField();
        EmailLbl = new javax.swing.JLabel();
        TelNoLbl = new javax.swing.JLabel();
        TelNoTf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClientTbl = new javax.swing.JTable();
        BorderLbl3 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        LNameTf = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdateBtn.setText("UPDATE");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 700, 150, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Search by");
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Personal Information");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 190, 40));

        BorderLbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(BorderLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 1220, 660));

        CidLbl2.setBackground(new java.awt.Color(0, 0, 0));
        CidLbl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CidLbl2.setText("Client ID : ");
        add(CidLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 40));

        SearchIdTf2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SearchIdTf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIdTf2ActionPerformed(evt);
            }
        });
        add(SearchIdTf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, 30));

        SearchNameTf2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SearchNameTf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNameTf2ActionPerformed(evt);
            }
        });
        add(SearchNameTf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, 30));

        CidLbl1.setBackground(new java.awt.Color(0, 0, 0));
        CidLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CidLbl1.setText("Name              : ");
        add(CidLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 40));

        GenderTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        GenderTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderTfActionPerformed(evt);
            }
        });
        add(GenderTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 440, 30));

        GenderLbl.setBackground(new java.awt.Color(0, 0, 0));
        GenderLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GenderLbl.setText("Gender           :");
        add(GenderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, 30));

        LNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        LNameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LNameLbl.setText("Last Name       :");
        add(LNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, 30));

        FNameTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTfActionPerformed(evt);
            }
        });
        add(FNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 440, 30));

        FNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        FNameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FNameLbl.setText("First Name       :");
        add(FNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 140, 30));

        NicTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NicTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NicTfActionPerformed(evt);
            }
        });
        add(NicTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 440, 30));

        NicLbl1.setBackground(new java.awt.Color(0, 0, 0));
        NicLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NicLbl1.setText("NIC                :");
        add(NicLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 140, 20));

        CidTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CidTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidTfActionPerformed(evt);
            }
        });
        add(CidTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 440, 30));

        CidLbl.setBackground(new java.awt.Color(0, 0, 0));
        CidLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CidLbl.setText("Client ID         : ");
        add(CidLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, 40));

        AgeLbl.setBackground(new java.awt.Color(0, 0, 0));
        AgeLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeLbl.setText("Age              :");
        add(AgeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, -1, -1));

        AgeTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AgeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTfActionPerformed(evt);
            }
        });
        add(AgeTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 110, 440, 30));

        AddressTa.setColumns(20);
        AddressTa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AddressTa.setRows(5);
        jScrollPane1.setViewportView(AddressTa);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 160, 440, 80));

        AddressLbl.setBackground(new java.awt.Color(0, 0, 0));
        AddressLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressLbl.setText("Address         :");
        add(AddressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, -1, -1));

        EmailTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(EmailTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 440, 30));

        EmailLbl.setBackground(new java.awt.Color(0, 0, 0));
        EmailLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailLbl.setText("Email            :");
        add(EmailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, -1, -1));

        TelNoLbl.setBackground(new java.awt.Color(0, 0, 0));
        TelNoLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TelNoLbl.setText("Tele No        :");
        add(TelNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, -1, -1));

        TelNoTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TelNoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelNoTfActionPerformed(evt);
            }
        });
        add(TelNoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 310, 440, 30));

        ClientTbl.setBackground(new java.awt.Color(240, 240, 240));
        ClientTbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ClientTbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ClientTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client ID", "NIC", "FirstName", "LastName", "Gender", "Age", "Address", "Email", "Tele No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClientTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ClientTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 1200, 320));

        BorderLbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(BorderLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 660));

        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 700, 150, 40));

        LNameTf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        LNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameTfActionPerformed(evt);
            }
        });
        add(LNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 440, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
            dtmClient.setRowCount(0);
            String id = CidTf.getText();
            String nic = NicTf.getText();
            String fName = FNameTf.getText();
            String lName = LNameTf.getText();
            String address = AddressTa.getText();
            String gender = GenderTf.getText();
            int age = Integer.parseInt(AgeTf.getText());
            String email = EmailTf.getText();
            int tele = Integer.parseInt(TelNoTf.getText());
            
            ClientDTO client = new ClientDTO(id, nic, fName, lName, gender, age, address, email, tele);
            
        try {
            boolean isUpdate = clientController.update(client);
            if (isUpdate){
             dtmClient.setRowCount(0);
             
             ArrayList<ClientDTO> allClientDTOs = ctrlClient.getAll();

            if (allClientDTOs == null) {
                return;
            }
                for (ClientDTO clientDTO : allClientDTOs) {
                 Object[] rowData = {
                    clientDTO.getClientID(),
                    clientDTO.getNic(),
                    clientDTO.getfName(),
                    clientDTO.getlName(),
                    clientDTO.getGender(),
                    clientDTO.getAge(),
                    clientDTO.getAddress(),
                    clientDTO.getEmail(),
                    clientDTO.getTelNo()
                };
                dtmClient.addRow(rowData);
                    
                }
               
                JOptionPane.showMessageDialog(this, "Update Success");
            }else{
                JOptionPane.showMessageDialog(this, "Update Faild");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void GenderTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderTfActionPerformed

    private void FNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameTfActionPerformed

    private void NicTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NicTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NicTfActionPerformed

    private void CidTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidTfActionPerformed

    private void AgeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTfActionPerformed

    private void TelNoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelNoTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelNoTfActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        String ClientID = dtmClient.getValueAt(ClientTbl.getSelectedRow(),0).toString();
        
        try {
        String TelNo = dtmClient.getValueAt(ClientTbl.getSelectedRow(),0).toString();
            boolean deleted = ctrlClient.delete(ClientID);
            //int index = ClientTbl.getSelectedRow();
           // dtmClient.removeRow(index);
            if (deleted) {
                JOptionPane.showMessageDialog(this, "Success");
                
                int index = ClientTbl.getSelectedRow();
                dtmClient.removeRow(index);
            }else{
                JOptionPane.showMessageDialog(this, "Faild");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SearchNameTf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNameTf2ActionPerformed
        String fName = SearchNameTf2.getText();

        try {
            ClientDTO clientDTO = ctrlClient.searchClient(fName);
            if (clientDTO == null) {
                JOptionPane.showMessageDialog(this, "No Member Found");
            } else {
                CidTf.setText(clientDTO.getClientID());
                NicTf.setText(clientDTO.getNic());
                FNameTf.setText(clientDTO.getfName());
                LNameTf.setText(clientDTO.getlName());
                GenderTf.setText(clientDTO.getGender());
                AgeTf.setText("" + clientDTO.getAge());
                AddressTa.setText(clientDTO.getAddress());
                EmailTf.setText(clientDTO.getEmail());
                TelNoTf.setText("" + clientDTO.getTelNo());
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchNameTf2ActionPerformed

    private void LNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameTfActionPerformed

    private void ClientTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientTblMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) ClientTbl.getModel();
        CidTf.setText(ClientTbl.getValueAt(ClientTbl.getSelectedRow(),0).toString());
        NicTf.setText(ClientTbl.getValueAt(ClientTbl.getSelectedRow(),1).toString());
        FNameTf.setText(ClientTbl.getValueAt(ClientTbl.getSelectedRow(),2).toString());
        LNameTf.setText(ClientTbl.getValueAt(ClientTbl.getSelectedRow(),3).toString());
        GenderTf.setText(ClientTbl.getValueAt(ClientTbl.getSelectedRow(),4).toString());
        AgeTf.setText(ClientTbl.getValueAt(ClientTbl.getSelectedRow(),5).toString());
        AddressTa.setText(ClientTbl.getValueAt(ClientTbl.getSelectedRow(),6).toString());
        EmailTf.setText(ClientTbl.getValueAt(ClientTbl.getSelectedRow(),7).toString());
        TelNoTf.setText(ClientTbl.getValueAt(ClientTbl.getSelectedRow(),8).toString());
    }//GEN-LAST:event_ClientTblMouseClicked

    private void SearchIdTf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchIdTf2ActionPerformed
        String id = SearchIdTf2.getText();

        try {
            ClientDTO clientDTO = ctrlClient.search(id);
            if (clientDTO == null) {
                JOptionPane.showMessageDialog(this, "No Member Found");
            } else {
                CidTf.setText(clientDTO.getClientID());
                NicTf.setText(clientDTO.getNic());
                FNameTf.setText(clientDTO.getfName());
                LNameTf.setText(clientDTO.getlName());
                GenderTf.setText(clientDTO.getGender());
                AgeTf.setText("" + clientDTO.getAge());
                AddressTa.setText(clientDTO.getAddress());
                EmailTf.setText(clientDTO.getEmail());
                TelNoTf.setText("" + clientDTO.getTelNo());
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageClients.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchIdTf2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl;
    private javax.swing.JTextArea AddressTa;
    private javax.swing.JLabel AgeLbl;
    private javax.swing.JTextField AgeTf;
    private javax.swing.JLabel BorderLbl1;
    private javax.swing.JLabel BorderLbl3;
    private javax.swing.JLabel CidLbl;
    private javax.swing.JLabel CidLbl1;
    private javax.swing.JLabel CidLbl2;
    private javax.swing.JTextField CidTf;
    private javax.swing.JTable ClientTbl;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField EmailTf;
    private javax.swing.JLabel FNameLbl;
    private javax.swing.JTextField FNameTf;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JTextField GenderTf;
    private javax.swing.JLabel LNameLbl;
    private javax.swing.JTextField LNameTf;
    private javax.swing.JLabel NicLbl1;
    private javax.swing.JTextField NicTf;
    private javax.swing.JTextField SearchIdTf2;
    private javax.swing.JTextField SearchNameTf2;
    private javax.swing.JLabel TelNoLbl;
    private javax.swing.JTextField TelNoTf;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
