/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gymManagement.db;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dilanka Virajith
 */
public class DBConnection {
    private static DBConnection dbConnection;
        private Connection conn;
        private DBConnection()throws  SQLException,ClassNotFoundException{
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/GymManagement","root","dilanka");
        }
        public static DBConnection getDBConnection()throws ClassNotFoundException,SQLException{
            if (dbConnection==null) {
                    dbConnection=new DBConnection();
            }
            return dbConnection;
        }
        public Connection getConnection(){
            return conn;
            
        }  
}
