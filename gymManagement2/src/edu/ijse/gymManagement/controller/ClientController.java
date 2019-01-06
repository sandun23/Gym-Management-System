/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gymManagement.controller;

import edu.ijse.gymManagement.db.DBConnection;
import edu.ijse.gymManagement.model.ClientDTO;
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
public class ClientController {
   public static boolean addClient(ClientDTO client)throws SQLException, ClassNotFoundException{
       String sql="INSERT INTO CLIENT VALUES(?,?,?,?,?,?,?,?,?)";
       Connection conn= DBConnection.getDBConnection().getConnection();
       PreparedStatement stm = conn.prepareStatement(sql);
       
        stm.setObject(1, client.getClientID());
        stm.setObject(2, client.getNIC());
        stm.setObject(3, client.getFirstName());
        stm.setObject(4, client.getLastName());
        stm.setObject(5, client.getGender());
        stm.setObject(6, client.getAge());
        stm.setObject(7, client.getAddress());
        stm.setObject(8, client.getEmail());
        stm.setObject(9, client.getTelNo());
        
        int res = stm.executeUpdate();
        return res>0;
    }
   
   public static ClientDTO serchClient(String ClientID)throws SQLException,ClassNotFoundException{
       String sql = "Select * from Client Where ClientID='"+ClientID+"' ";
       Connection conn = DBConnection.getDBConnection().getConnection();
       PreparedStatement stm = conn.prepareStatement(sql);
       ResultSet rst = stm.executeQuery();
       
       ClientDTO client = null;
       if (rst.next()) {
           client = new ClientDTO(rst.getString("ClientID"),rst.getString("NIC"),rst.getString("FirstName"),rst.getString("LastName"),rst.getString("Gender"),rst.getInt("Age"),rst.getString("Address"),rst.getString("Email"),rst.getInt("TelNo"));
        }
       return client;
    }
   
   public static boolean deleteClient(String ClientID)throws SQLException,ClassNotFoundException{
       String sql = "Delete from Client where ClientID='" + ClientID + "'";
       Connection conn=DBConnection.getDBConnection().getConnection();
       Statement stm = conn.createStatement();
       
       int res = stm.executeUpdate(sql);
       return res>0;
    }
   
   public static boolean updateClient(ClientDTO client)throws SQLException,ClassNotFoundException{
       String sql = "Update Client set ClientID=?, NIC=?, FirstName=?, LastName=?, Gender=?, Age=?, Address=?, Email=?, TelNo=?, where CID=?";
       Connection conn = DBConnection.getDBConnection().getConnection();
       PreparedStatement stm = conn.prepareStatement(sql);
       
       stm.setObject(1, client.getNIC());
       stm.setObject(2, client.getFirstName());
       stm.setObject(3, client.getLastName());
       stm.setObject(4, client.getAge());
       stm.setObject(5, client.getAddress());
       stm.setObject(6, client.getEmail());
       stm.setObject(7, client.getTelNo());
       int res = stm.executeUpdate();
       
       return res > 0;
    }
   
   public static ArrayList<ClientDTO> getAllClient()throws SQLException, ClassNotFoundException {
       String sql = "Select * from Client";
       Connection conn = DBConnection.getDBConnection().getConnection();
       Statement stm = conn.createStatement();
       ResultSet rst = stm.executeQuery(sql);
       
       ArrayList<ClientDTO> clientList = new ArrayList<ClientDTO>();
       while (rst.next()) {
           ClientDTO client = new ClientDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getInt(6), rst.getString(7), rst.getString(8), rst.getInt(9));
           clientList.add(client);
       }
       return clientList;
   }

    public static ClientDTO searchClient(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
