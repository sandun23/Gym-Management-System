/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.dao.custom.impl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.gymmanagement.dao.custom.MeasurementDAO;
import lk.ijse.gymmanagement.db.ConnectionFactory;
import lk.ijse.gymmanagement.dto.MeasurementDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class MeasurementDAOImpl implements MeasurementDAO{
    private Connection connection;
    
    public MeasurementDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(MeasurementDTO dto) throws Exception {
        String sql = "INSERT INTO Measurement (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, dto.getMid());
        pstm.setBigDecimal(2, dto.getNeck());
        pstm.setBigDecimal(3, dto.getChest());
        pstm.setBigDecimal(4, dto.getAbdomen());
        pstm.setBigDecimal(5, dto.getWaist());
        pstm.setBigDecimal(6, dto.getWeight());
        pstm.setBigDecimal(7, dto.getHeight());
        pstm.setBigDecimal(8, dto.getlThight());
        pstm.setBigDecimal(9, dto.getrThight());
        pstm.setBigDecimal(10, dto.getlArm());
        pstm.setBigDecimal(11, dto.getrArm());
        pstm.setBigDecimal(12, dto.getlForearm());
        pstm.setBigDecimal(13, dto.getrForearm());
        pstm.setBigDecimal(14, dto.getlCalf());
        pstm.setBigDecimal(15, dto.getrCalf());
        pstm.setString(16, dto.getScheduleNo());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(MeasurementDTO dto) throws Exception {
        String sql = "UPDATE Measurement SET Neck=?, Chest=?, Abdomen=?, Waist=?, Weight=?, Height=?, LThight=?, RThight=?, LArm=?, RArm=?, LForearm=?, RForearm=?, LCalf=?, RCalf=?, Schedule_No=? WHERE MID=? ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, dto.getMid());
        pstm.setBigDecimal(2, dto.getNeck());
        pstm.setBigDecimal(3, dto.getChest());
        pstm.setBigDecimal(4, dto.getAbdomen());
        pstm.setBigDecimal(5, dto.getWaist());
        pstm.setBigDecimal(6, dto.getWeight());
        pstm.setBigDecimal(7, dto.getHeight());
        pstm.setBigDecimal(8, dto.getlThight());
        pstm.setBigDecimal(9, dto.getrThight());
        pstm.setBigDecimal(10, dto.getlArm());
        pstm.setBigDecimal(11, dto.getrArm());
        pstm.setBigDecimal(12, dto.getlForearm());
        pstm.setBigDecimal(13, dto.getrForearm());
        pstm.setBigDecimal(14, dto.getlCalf());
        pstm.setBigDecimal(15, dto.getrCalf());
        pstm.setString(16, dto.getScheduleNo());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Measurement WHERE MID ='" + key + "'";

        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public MeasurementDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Measurement WHERE MID ='" + key + "'";
        
        MeasurementDTO measurement = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            measurement = new MeasurementDTO(
                        rst.getString("MID "),
                        rst.getBigDecimal("Neck"),
                        rst.getBigDecimal("Chest"),
                        rst.getBigDecimal("Abdomen"),
                        rst.getBigDecimal("Waist"),
                        rst.getBigDecimal("Weight"),
                        rst.getBigDecimal("Height"),
                        rst.getBigDecimal("LThight"),
                        rst.getBigDecimal("RThight"),
                        rst.getBigDecimal("LArm"),
                        rst.getBigDecimal("RArm"),
                        rst.getBigDecimal("LForearm"),
                        rst.getBigDecimal("RForearm"),
                        rst.getBigDecimal("LCalf"),
                        rst.getBigDecimal("RCalf"),
                        rst.getString("Schedule_No"));
        }
        return measurement;
    }

    @Override
    public ArrayList<MeasurementDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Measurement";
        
        ArrayList<MeasurementDTO> allMeasurement = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
        while(rst.next()){
            if (allMeasurement == null) {
                allMeasurement = new ArrayList<>();
            }
            MeasurementDTO dto = new MeasurementDTO(
                        rst.getString("MID "),
                        rst.getBigDecimal("Neck"),
                        rst.getBigDecimal("Chest"),
                        rst.getBigDecimal("Abdomen"),
                        rst.getBigDecimal("Waist"),
                        rst.getBigDecimal("Weight"),
                        rst.getBigDecimal("Height"),
                        rst.getBigDecimal("LThight"),
                        rst.getBigDecimal("RThight"),
                        rst.getBigDecimal("LArm"),
                        rst.getBigDecimal("RArm"),
                        rst.getBigDecimal("LForearm"),
                        rst.getBigDecimal("RForearm"),
                        rst.getBigDecimal("LCalf"),
                        rst.getBigDecimal("RCalf"),
                        rst.getString("Schedule_No"));  
            allMeasurement.add(dto);
        }
        return allMeasurement;
    }
    
}
