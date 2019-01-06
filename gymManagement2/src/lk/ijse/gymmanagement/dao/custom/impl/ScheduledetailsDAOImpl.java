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
import lk.ijse.gymmanagement.dao.custom.ScheduledetailsDAO;
import lk.ijse.gymmanagement.dto.ScheduledetailsDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class ScheduledetailsDAOImpl implements ScheduledetailsDAO{
    private Connection connection;
    
    public ScheduledetailsDAOImpl(){
        
    }
    @Override
    public boolean add(ScheduledetailsDTO dto) throws Exception {
       String sql="INSERT INTO Scheduledetails VALUES(?,?,?,?)" ;
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, dto.getSdid());
        pstm.setString(2, dto.getEset());
        pstm.setString(3, dto.getEid());
        pstm.setString(4, dto.getScheduleNo());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(ScheduledetailsDTO dto) throws Exception {
        String sql = "UPDATE Scheduledetails SET Eset=?, EID=?, Schedule_No=? WHERE SDID=?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, dto.getSdid());
        pstm.setString(2, dto.getEset());
        pstm.setString(3, dto.getEid());
        pstm.setString(4, dto.getScheduleNo());
        
        int result = pstm.executeUpdate();
        return (result > 0);
        
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FORM Scheduledetails WHERE SDID = '" + key +"'";
        
        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);
        return (result > 0);
    }

    @Override
    public ScheduledetailsDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Scheduledetails WHERE SDID = '" + key +"'";
        
        ScheduledetailsDTO scheduledetails = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
          scheduledetails = new ScheduledetailsDTO(rst.getString("SDID"),
                            rst.getString("Eset"),
                            rst.getString("EID"),
                            rst.getString("Schedule_No"));
   
        }
        return scheduledetails;
    }

    @Override
    public ArrayList<ScheduledetailsDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Scheduledetails";
        ArrayList<ScheduledetailsDTO> allScheduledetails = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
        while(rst.next()){
            if (allScheduledetails == null) {
                allScheduledetails = new ArrayList<>();
            }
            ScheduledetailsDTO dto = new ScheduledetailsDTO(
                rst.getString("SDID"),
                rst.getString("Eset"),
                rst.getString("EID"),
                rst.getString("Schedule_No"));
        }
        return allScheduledetails;
    }
    
}
