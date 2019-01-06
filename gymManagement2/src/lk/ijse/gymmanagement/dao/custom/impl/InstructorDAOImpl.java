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
import lk.ijse.gymmanagement.dao.custom.InstructorDAO;
import lk.ijse.gymmanagement.db.ConnectionFactory;
import lk.ijse.gymmanagement.dto.InstructorDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class InstructorDAOImpl implements InstructorDAO{
   private Connection connection;
   
   public InstructorDAOImpl(){
       connection = ConnectionFactory.getInstance().getConnection();
   }

    @Override
    public boolean add(InstructorDTO dto) throws Exception {
        String sql = "INSERT INTO Instructor VALUES (?,?,?,?,?,?,?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, dto.getInstructorID());
        pstm.setString(2, dto.getNic());
        pstm.setString(3, dto.getfName());
        pstm.setString(4, dto.getlName());
        pstm.setString(5, dto.getGender());
        pstm.setInt(6, dto.getAge());
        pstm.setString(7, dto.getAddress());
        pstm.setString(8, dto.getEmail());
        pstm.setInt(9, dto.getTelNo());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(InstructorDTO dto) throws Exception {
        String SQL = "Update Instructor SET nic ='"+dto.getNic()+"',f_Name ='"+dto.getfName()+"',l_Name ='"+dto.getlName()+"',Gender ='"+dto.getGender()+"',Age ='"+dto.getAge()+"',Address ='"+dto.getAddress()+"',Email ='"+dto.getEmail()+"',TelNo ='"+dto.getTelNo()+"' WHERE  Instructor='"+dto.getInstructorID()+"' ";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL)>0;
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Instructor WHERE InstructorID ='" + key + "'";

        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public InstructorDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Instructor WHERE InstructorID = '" + key +"'";
        InstructorDTO instructor = null;
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            instructor = new InstructorDTO(
                    rst.getString("InstructorID"),
                    rst.getString("NIC"),
                    rst.getString("F_Name"),
                    rst.getString("L_Name"),
                    rst.getString("Gender"),
                    rst.getInt("Age"),
                    rst.getString("Address"),
                    rst.getString("Email"),
                    rst.getInt("TelNo"));
           
        }
        return instructor;
    }

    @Override
    public ArrayList<InstructorDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Instructor";

        ArrayList<InstructorDTO> allInstructor = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {
            if (allInstructor == null) {
                allInstructor = new ArrayList<>();
            }
            InstructorDTO dto = new InstructorDTO(
                    rst.getString("InstructorID"),
                    rst.getString("NIC"),
                    rst.getString("F_Name"),
                    rst.getString("L_Name"),
                    rst.getString("Gender"),
                    rst.getInt("Age"),
                    rst.getString("Address"),
                    rst.getString("Email"),
                    rst.getInt("TelNo"));
            allInstructor.add(dto);
        }
        return allInstructor;
    }
}
