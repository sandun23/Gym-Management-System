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
import lk.ijse.gymmanagement.dao.custom.AttendanceDAO;
import lk.ijse.gymmanagement.db.ConnectionFactory;
import lk.ijse.gymmanagement.dto.AttendanceDTO;
import lk.ijse.gymmanagement.dto.QueryAttendenceDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class AttendanceDAOImpl implements AttendanceDAO {

    private Connection connection;

    public AttendanceDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(AttendanceDTO dto) throws Exception {
        String sql = "INSERT INTO Attendance VALUES(?,?,?,?,?)";

        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, dto.getAID());
        pstm.setString(2, dto.getA_Date());
        pstm.setString(3, dto.getIn_Time());
        pstm.setString(4, dto.getOut_Time());
        pstm.setString(5, dto.getMembership_No());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean update(AttendanceDTO dto) throws Exception {
        String Sql = "UPDATE Attendance SET A_Date=?, In_Time=?, Out_Time=?, Membership_No=? WHERE AID=?";

        PreparedStatement pstm = connection.prepareStatement(Sql);
        pstm.setString(1, dto.getAID());
        pstm.setString(2, dto.getA_Date());
        pstm.setString(3, dto.getIn_Time());
        pstm.setString(4, dto.getOut_Time());
        pstm.setString(5, dto.getMembership_No());

        int result = pstm.executeUpdate();

        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Attendance WHERE AID ='" + key + "'";

        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);
        return (result > 0);
    }

    @Override
    public AttendanceDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Attendance WHERE AID = '" + key + "'";
        AttendanceDTO attendance = null;
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            attendance = new AttendanceDTO(
                    rst.getString("AID"),
                    rst.getString("A_Date"),
                    rst.getString("In_Time"),
                    rst.getString("Out_Time"),
                    rst.getString("Membership_No"));
        }
        return attendance;
    }

    @Override
    public ArrayList<AttendanceDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Attendance ";
        ArrayList<AttendanceDTO> allattendance = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            if (allattendance == null) {
                allattendance = new ArrayList<>();

            }
            AttendanceDTO dto = new AttendanceDTO(
                    rst.getString("AID"),
                    rst.getString("A_Date"),
                    rst.getString("In_Time"),
                    rst.getString("Out_Time"),
                    rst.getString("Membership_No"));
            allattendance.add(dto);

        }
        return allattendance;

    }

    @Override
    public ArrayList<QueryAttendenceDTO> queryAttendenceDTOs() throws Exception {
        String sql = "Select a.aid,r.Membership_No,c.F_Name,a.A_Date,a.In_Time,a.Out_Time\n"
                + "from attendance a, Registration r ,client c\n"
                + "where a.Membership_No = r.Membership_No and c.ClientID=r.ClientID";

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<QueryAttendenceDTO> queryAttendenceDTOs = new ArrayList<>();
        while (rst.next()) {
            QueryAttendenceDTO queryAttendenceDTO = new QueryAttendenceDTO();
            queryAttendenceDTO.setAID(rst.getString(1));
            queryAttendenceDTO.setMembership_No(rst.getString(2));
            queryAttendenceDTO.setfName(rst.getString(3));
            queryAttendenceDTO.setA_Date(rst.getString(4));
            queryAttendenceDTO.setIn_Time(rst.getString(5));
            queryAttendenceDTO.setOut_Time(rst.getString(6));
            queryAttendenceDTOs.add(queryAttendenceDTO);
        }
        return queryAttendenceDTOs;

    }

}
