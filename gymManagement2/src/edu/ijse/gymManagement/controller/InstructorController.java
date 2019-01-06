/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gymManagement.controller;

import edu.ijse.gymManagement.db.DBConnection;
import edu.ijse.gymManagement.model.InstructorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Dilanka Virajith
 */
public class InstructorController {
    public  static boolean addInstructor(InstructorDTO instructor)throws SQLException,ClassNotFoundException{
        String sql = "INSERT INTO CLIENT VALUES(?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, instructor.getInstructorID());
        stm.setObject(2, instructor.getNIC());
        stm.setObject(3, instructor.getFirstName());
        stm.setObject(4, instructor.getLastName());
        stm.setObject(5, instructor.getGender());
        stm.setObject(6, instructor.getAge());
        stm.setObject(7, instructor.getAddress());
        stm.setObject(8, instructor.getEmail());
        stm.setObject(9, instructor.getTelNo());
        
        int res = stm.executeUpdate();
        return res>0;
    }
    
    public static InstructorDTO searchInstructor(String InstructorID)throws SQLException,ClassNotFoundException{
        String sql = "Select * from Client Where InstructorID='"+InstructorID+"' ";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        InstructorDTO instructor = null;
        if (rst.next()){
            instructor = new InstructorDTO(rst.getString("InstructorID"),rst.getString("NIC"),rst.getString("FirstName"),rst.getString("LastName"),rst.getString("Gendre"),rst.getInt("Age"),rst.getString("Address"),rst.getString("Email"),rst.getInt("TeleNo"));
        }
        return instructor;
    }   
    
    public static boolean deleteInstructor(String InstructorID)throws SQLException,ClassNotFoundException{
        String sql = "Delete from Client where InstructorID='" + InstructorID + "'";
       Connection conn=DBConnection.getDBConnection().getConnection();
       Statement stm = conn.createStatement();
       
       int res = stm.executeUpdate(sql);
       return res>0;
    }
    
    public static boolean updateIstructor(InstructorDTO instructor)throws SQLException,ClassNotFoundException{
       String sql = "Update Client set InstructorID=?, NIC=?, FirstName=?, LastName=?, Gender=?, Age=?, Address=?, Email=?, TelNo=?, where CID=?";
       Connection conn = DBConnection.getDBConnection().getConnection();
       PreparedStatement stm = conn.prepareStatement(sql);
       
       stm.setObject(1, instructor.getNIC());
       stm.setObject(2, instructor.getFirstName());
       stm.setObject(3, instructor.getLastName());
       stm.setObject(4, instructor.getAge());
       stm.setObject(5, instructor.getAddress());
       stm.setObject(6, instructor.getEmail());
       stm.setObject(7, instructor.getTelNo());
       int res = stm.executeUpdate();
       
       return res > 0;
    }
   public static ArrayList<InstructorDTO> getAllInstructor()throws SQLException,ClassNotFoundException{
      String sql = "Select * from instructor";
      Connection conn = DBConnection.getDBConnection().getConnection();
      Statement stm = conn.createStatement();
      ResultSet rst = stm.executeQuery(sql);
      
      ArrayList<InstructorDTO> instructorsList = new ArrayList<InstructorDTO>();
       while (rst.next()) {
           InstructorDTO instructor = new InstructorDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getInt(6), rst.getString(7), rst.getString(8), rst.getInt(9));
           instructorsList.add(instructor);
       }
       return instructorsList;
   }
   
}
