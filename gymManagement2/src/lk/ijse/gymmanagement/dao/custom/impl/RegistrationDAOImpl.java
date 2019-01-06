/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.gymmanagement.dao.custom.RegistrationDAO;
import lk.ijse.gymmanagement.db.ConnectionFactory;
import lk.ijse.gymmanagement.dto.AttendanceDTO;
import lk.ijse.gymmanagement.dto.RegistrationDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class RegistrationDAOImpl implements RegistrationDAO{
    private Connection connection;
    
    public RegistrationDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(RegistrationDTO dto) throws Exception {
        String sql = "INSERT INTO REGISTRATION VALUES (?,?,?)";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, dto.getMembership_No());
        pstm.setObject(2, dto.getDate());
        pstm.setString(3, dto.getClientID());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(RegistrationDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrationDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Registration WHERE  Membership_No= '" + key +"'";
        RegistrationDTO registration = null;
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()) {
            registration = new RegistrationDTO(rst.getString("Membership_No"),
                    rst.getString("R_Date"),
                    rst.getString("ClientID"));
        }
        return registration;
    }

    @Override
    public ArrayList<RegistrationDTO> getAll() throws Exception {
       String sql = "SELECT * FROM REGISTRATION "; 
       ArrayList<RegistrationDTO> allRegistration = null;
       
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            if (allRegistration == null) {
                allRegistration = new ArrayList<>();
                
            }
            RegistrationDTO dto = new RegistrationDTO(
                rst.getString("Membership_No"),
                rst.getString("R_Date"),
                rst.getString("ClientID")
            );
            allRegistration.add(dto);
        }
        return allRegistration;
    }
}
