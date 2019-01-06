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
import lk.ijse.gymmanagement.dao.custom.ExerciseDAO;
import lk.ijse.gymmanagement.db.ConnectionFactory;
import lk.ijse.gymmanagement.dto.ClientDTO;
import lk.ijse.gymmanagement.dto.ExerciseDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class ExerciseDAOImpl implements ExerciseDAO{
    private Connection connection;
    
    public ExerciseDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean add(ExerciseDTO dto) throws Exception {
        String sql = "INSERT INTO Exercise VALUES (?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, dto.getId());
        pstm.setString(2, dto.getName());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
        
    }

    @Override
    public boolean update(ExerciseDTO dto) throws Exception {
        String Sql = "UPDATE Exercise SET E_Name = '"+dto.getName()+"' WHERE EID='"+dto.getId()+"'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(Sql)>0;
        
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Exercise WHERE EID ='"+ key +"'";
        
        Statement stm =connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);
        
        return (affectedRows > 0);
    }

    @Override
    public ExerciseDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Exercise WHERE Eid = '" + key + "'";
        ExerciseDTO exercise = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            exercise = new ExerciseDTO(rst.getString("Eid"),
                    rst.getString("EName"));
        }
        return exercise;
    }

    @Override
    public ArrayList<ExerciseDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Exercise";
        
        ArrayList<ExerciseDTO> allExercise = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
        while (rst.next()) {
            if (allExercise == null) {
                allExercise = new ArrayList<>();
            }
            ExerciseDTO dto = new ExerciseDTO(
                rst.getString("EID"),
                rst.getString("E_Name"));
            
            allExercise.add(dto);
            }
            return allExercise;
     }
//    public ArrayList<ExerciseDTO> getName() throws Exception {
//        String sql = "SELECT E_Name FROM Exercise";
//        
//        ArrayList<ExerciseDTO> allExercise = null;
//        
//        Statement stm = connection.createStatement();
//        ResultSet rst = stm.executeQuery(sql);
//        
//        while (rst.next()) {
//            if (allExercise == null) {
//                allExercise = new ArrayList<>();
//            }
//            ExerciseDTO dto = new ExerciseDTO(
//                rst.getString("EID"),
//                rst.getString("E_Name"));
//            
//            allExercise.add(dto);
//            }
//            return allExercise;
//     }
}
    

