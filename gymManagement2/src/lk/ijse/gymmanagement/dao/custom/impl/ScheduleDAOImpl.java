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
import lk.ijse.gymmanagement.controller.ControllerFactory;
import lk.ijse.gymmanagement.controller.custom.ScheduledetailsController;

import lk.ijse.gymmanagement.dao.custom.ScheduleDAO;
import lk.ijse.gymmanagement.db.ConnectionFactory;
import lk.ijse.gymmanagement.dto.ScheduleDTO;
import lk.ijse.gymmanagement.dto.ScheduledetailsDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class ScheduleDAOImpl implements ScheduleDAO {

    private Connection connection;
    private ScheduledetailsController sdc;

    public ScheduleDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
        sdc = (ScheduledetailsController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Scheduledetails);
    }

    @Override
    public boolean add(ScheduleDTO dto) throws Exception {
        String sql = "INSERT INTO Schedule VALUES (?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, dto.getScheduleNo());
        pstm.setString(2, dto.getStartDate());
        pstm.setString(3, dto.getEndDate());
        pstm.setString(4, dto.getMembership_No());
        pstm.setString(2, dto.getInstructorID());

        int result = pstm.executeUpdate();
        return (result > 0);

    }

    @Override
    public boolean update(ScheduleDTO scheduleDTO) throws Exception {
        String sql = "UPDATE Schedule SET Start_Date=?, End_Date=?, Membership_No=?,InstructorID=? WHERE Schedule_No=?";

        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, scheduleDTO.getScheduleNo());
        pstm.setString(2, scheduleDTO.getStartDate());
        pstm.setString(3, scheduleDTO.getEndDate());
        pstm.setString(4, scheduleDTO.getMembership_No());
        pstm.setString(5, scheduleDTO.getInstructorID());

        int result = pstm.executeUpdate();
        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FORM Schedule WHERE Schedule_No = '" + key + "'";

        Statement stm = connection.createStatement();
        int result = stm.executeUpdate(sql);
        return (result > 0);
    }

    @Override
    public ScheduleDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Schedule WHERE Schedule_No = '" + key + "'";

        ScheduleDTO schedule = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            schedule = new ScheduleDTO(rst.getString("Schedule_No"),
                    rst.getString("Start_Date"),
                    rst.getString("End_Date"),
                    rst.getString("Membership_No"),
                    rst.getString("InstructorID"));

        }
        return schedule;
    }

    @Override
    public ArrayList<ScheduleDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Schedule";
        ArrayList<ScheduleDTO> allSchedule = null;

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            if (allSchedule == null) {
                allSchedule = new ArrayList<>();
            }
            ScheduleDTO dto = new ScheduleDTO(
                    rst.getString("Schedule_No"),
                    rst.getString("Start_Date"),
                    rst.getString("End_Date"),
                    rst.getString("Membership_No"),
                    rst.getString("InstructorID"));

        }
        return allSchedule;
    }

    @Override
    public boolean addSchedule(ScheduleDTO dTO, ScheduledetailsDTO detailDTO) throws Exception {
        String sql = "INSERT INTO Schedule VALUES(?,?,?,?)";
        boolean add = false;
        try {
            connection.setAutoCommit(false);

            PreparedStatement pstm = connection.prepareCall(sql);
            pstm.setString(1, dTO.getScheduleNo());
            pstm.setString(2, dTO.getMembership_No());
            pstm.setString(3, dTO.getInstructorID());
            pstm.setString(4, dTO.getStartDate());
            pstm.setString(5, dTO.getEndDate());

            int Result = pstm.executeUpdate();

            if (Result > 0) {
                add = sdc.add(detailDTO);
                if (add) {
                    connection.commit();
                } else {
                    connection.rollback();
                }
            }
        } finally {
            connection.setAutoCommit(true);
        }
        return add;
    }

}
