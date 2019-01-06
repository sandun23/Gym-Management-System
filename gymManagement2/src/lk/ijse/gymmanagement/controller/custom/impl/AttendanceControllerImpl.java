/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller.custom.impl;

import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.gymmanagement.controller.custom.AttendanceController;
import lk.ijse.gymmanagement.dao.DAOFactory;
import lk.ijse.gymmanagement.dao.custom.AttendanceDAO;
import lk.ijse.gymmanagement.dto.AttendanceDTO;
import lk.ijse.gymmanagement.dto.QueryAttendenceDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class AttendanceControllerImpl implements AttendanceController {

    private AttendanceDAO attendanceDAO;

    public AttendanceControllerImpl() {
        attendanceDAO = (AttendanceDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Attendance);
    }

    @Override
    public boolean add(AttendanceDTO dto) throws Exception {
        return attendanceDAO.add(dto);
    }

    @Override
    public boolean update(AttendanceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AttendanceDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AttendanceDTO> getAll() throws Exception {
        return attendanceDAO.getAll();
    }

    @Override
    public ArrayList<QueryAttendenceDTO> queryAttendenceDTOs() throws Exception {
        return attendanceDAO.queryAttendenceDTOs();
    }

}
