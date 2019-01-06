/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.idgenerator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lk.ijse.gymmanagement.db.ConnectionFactory;

/**
 *
 * @author Vihanga
 */
public class IdController {

    private static Connection connection;

    public IdController() {
//        connection = ConnectionFactory.getInstance().getConnection();
//        //System.out.println(IdController.connection);
    }

    public static String getLastId(String tableName, String columnName) throws ClassNotFoundException, SQLException {
        String query = "select " + columnName + " from " + tableName + " order by 1 desc limit 1";

        //  System.out.println(connection);
        connection = ConnectionFactory.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

}
