/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.dao.custom;


import java.util.ArrayList;
import lk.ijse.gymmanagement.dao.SuperDAO;
import lk.ijse.gymmanagement.dto.AttendanceDTO;
import lk.ijse.gymmanagement.dto.QueryAttendenceDTO;

/**
 *
 * @author Dilanka Virajith
 */
public interface AttendanceDAO extends SuperDAO<AttendanceDTO>{
    
    public ArrayList<QueryAttendenceDTO> queryAttendenceDTOs ()throws Exception;
    
}
