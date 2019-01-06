/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.idgenerator;

import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author Vihanga
 */
public class IdGenerator {

    public static String getNewAttendanceId(String tableName, String column, String prefix) throws ClassNotFoundException, SQLException {
        String lastId = IdController.getLastId(tableName, column);
        if (lastId != null) {
            int id = Integer.parseInt(lastId.split(prefix)[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMaximumIntegerDigits(3);
            numberFormat.setMinimumIntegerDigits(2);
            numberFormat.setGroupingUsed(false);
            String newId = numberFormat.format(id);
            return prefix + newId;
        } else {
            return prefix + "001";
        }
    }

//    public static String getNewBankId(String tableName, String colomnName, String prefix) throws ClassNotFoundException, SQLException {
//        String lastId = IdController.getLastId(tableName, colomnName);
//        if (lastId != null) {
//            int id = Integer.parseInt(lastId.split(prefix)[1]);
//            id++;
//            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
//            numberFormat.setMaximumIntegerDigits(3);
//            numberFormat.setMinimumIntegerDigits(2);
//            numberFormat.setGroupingUsed(false);
//            String newId = numberFormat.format(id);
//            return prefix + newId;
//        } else {
//            return prefix + "01";
//        }
//    }
//
//    public static String getNewRouteId(String tableName, String colomnName, String prefix) throws ClassNotFoundException, SQLException {
//        String lastId = IdController.getLastId(tableName, colomnName);
//        if (lastId != null) {
//            int id = Integer.parseInt(lastId.split(prefix)[1]);
//            id++;
//            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
//            numberFormat.setMaximumIntegerDigits(3);
//            numberFormat.setMinimumIntegerDigits(2);
//            numberFormat.setGroupingUsed(false);
//            String newId = numberFormat.format(id);
//            return prefix + newId;
//        } else {
//            return prefix + "01";
//        }
//    }
//
//    public static String getNewSupId(String tableName, String colomnName, String prefix) throws ClassNotFoundException, SQLException {
//        String lastId = IdController.getLastId(tableName, colomnName);
//        if (lastId != null) {
//            int id = Integer.parseInt(lastId.split(prefix)[1]);
//            id++;
//            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
//            numberFormat.setMaximumIntegerDigits(10);
//            numberFormat.setMinimumIntegerDigits(4);
//            numberFormat.setGroupingUsed(false);
//            String newId = numberFormat.format(id);
//            return prefix + newId;
//        } else {
//            return prefix + "0001";
//        }
//    }
//
//    public static String getNewColId(String tableName, String colomnName, String prefix) throws ClassNotFoundException, SQLException {
//        String lastId = IdController.getLastId(tableName, colomnName);
//        if (lastId != null) {
//            int id = Integer.parseInt(lastId.split(prefix)[1]);
//            id++;
//            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
//            numberFormat.setMaximumIntegerDigits(5);
//            numberFormat.setMinimumIntegerDigits(2);
//            numberFormat.setGroupingUsed(false);
//            String newId = numberFormat.format(id);
//            return prefix + newId;
//        } else {
//            return prefix + "01";
//        }
//    }
//
//    public static String getNewStockId(String tableName, String colomnName, String prefix) throws ClassNotFoundException, SQLException {
//        String lastId = IdController.getLastId(tableName, colomnName);
//        if (lastId != null) {
//            int id = Integer.parseInt(lastId.split(prefix)[1]);
//            id++;
//            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
//            numberFormat.setMaximumIntegerDigits(10);
//            numberFormat.setMinimumIntegerDigits(7);
//            numberFormat.setGroupingUsed(false);
//            String newId = numberFormat.format(id);
//            return prefix + newId;
//        } else {
//            return prefix + "0000001";
//        }
//    }
//
//    public static String getFertGIN(String tableName, String colomnName, String prefix) throws ClassNotFoundException, SQLException {
//        String lastId = IdController.getLastId(tableName, colomnName);
//        if (lastId != null) {
//            int id = Integer.parseInt(lastId.split(prefix)[1]);
//            id++;
//            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
//            numberFormat.setMaximumIntegerDigits(11);
//            numberFormat.setMinimumIntegerDigits(7);
//            numberFormat.setGroupingUsed(false);
//            String newId = numberFormat.format(id);
//            return prefix + newId;
//        } else {
//            return prefix + "0000001";
//        }
//    }
//    
//    public static String getTeaGIN(String tableName, String colomnName, String prefix) throws ClassNotFoundException, SQLException {
//        String lastId = IdController.getLastId(tableName, colomnName);
//        if (lastId != null) {
//            int id = Integer.parseInt(lastId.split(prefix)[1]);
//            id++;
//            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
//            numberFormat.setMaximumIntegerDigits(11);
//            numberFormat.setMinimumIntegerDigits(7);
//            numberFormat.setGroupingUsed(false);
//            String newId = numberFormat.format(id);
//            return prefix + newId;
//        } else {
//            return prefix + "0000001";
//        }
//    }
}
