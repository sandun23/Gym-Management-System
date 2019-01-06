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
import lk.ijse.gymmanagement.dao.custom.PaymentDAO;
import lk.ijse.gymmanagement.db.ConnectionFactory;
import lk.ijse.gymmanagement.dto.PaymentDTO;
import lk.ijse.gymmanagement.dto.QueryPaymentDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class PaymentDAOImpl implements PaymentDAO{
    private Connection connection;
    
    public PaymentDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }
    @Override
    public boolean add(PaymentDTO dto) throws Exception {
        String sql = "INSERT INTO Payment VALUES (?,?,?,?,?) ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, dto.getPID());
        pstm.setString(2, dto.getP_Date());
        pstm.setString(3, dto.getTypes());
        pstm.setDouble(4, dto.getAmount());
        pstm.setString(5, dto.getMembership_No());
        
        int result = pstm.executeUpdate();
        return (result > 0);
    }

    @Override
    public boolean update(PaymentDTO dto) throws Exception {
        String Sql = "UPDATE Payment SET P_Date=?, types=?, Amount=? WHERE  PID=? ";
        
        PreparedStatement pstm = connection.prepareStatement(Sql);
        pstm.setString(1, dto.getPID());
        pstm.setString(2, dto.getP_Date());
        pstm.setString(3, dto.getTypes());
        pstm.setDouble(4, dto.getAmount());
        pstm.setString(7, dto.getMembership_No());
        
        int result = pstm.executeUpdate();
        return (result > 0);
        
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FORM Payment WHERE PID = '" + key +"'";
        
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);
        return (result > 0);
    }

    @Override
    public PaymentDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Payment WHERE PID = '" + key +"'";
        PaymentDTO payment = null;
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            payment = new PaymentDTO(rst.getString("PID"),
                    rst.getString("P_Date"),
                    rst.getString("types"),
                    rst.getDouble("Amount"),
                    rst.getString("Membership_No"));
        }
        return payment;
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Payment ";
        ArrayList<PaymentDTO> allPayment = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            if (allPayment == null) {
                allPayment = new ArrayList<>();  
            }
           PaymentDTO dto = new PaymentDTO(
           rst.getString("PID"),
            rst.getString("P_Date"),
            rst.getString("types"),
            rst.getDouble("Amount"),
            rst.getString("Amount_Status"));
            
        }
    return allPayment;
    }

    @Override
    public ArrayList<QueryPaymentDTO> queryPaymentDTOs() throws Exception {
        String sql;
        sql = "Select  r.Membership_No,c.F_Name,p.P_Date,p.PID,p.types,p.Amount\n" +
                "from payment p, Registration r ,client c\n" +
                "where p.Membership_No = r.Membership_No and c.ClientID=r.ClientID";
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<QueryPaymentDTO> queryPaymentDTOs = new ArrayList<>();
        while(rst.next()){
            QueryPaymentDTO queryPaymentDTO = new QueryPaymentDTO();
            queryPaymentDTO.setMembership_No(rst.getString(1));
            queryPaymentDTO.setfName(rst.getString(2));
            queryPaymentDTO.setP_Date(rst.getString(3));
            queryPaymentDTO.setPID(rst.getString(4));
            queryPaymentDTO.setTypes(rst.getString(5));
            queryPaymentDTO.setAmount(rst.getDouble(6));
            queryPaymentDTOs.add(queryPaymentDTO);
        }
        return queryPaymentDTOs;
    }
    
}
