/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.dao;

import lk.ijse.gymmanagement.controller.custom.PaymentController;
import lk.ijse.gymmanagement.controller.custom.impl.ExerciseControllerImpl;
import lk.ijse.gymmanagement.dao.custom.InstructorDAO;
import lk.ijse.gymmanagement.dao.custom.RegistrationDAO;
import lk.ijse.gymmanagement.dao.custom.impl.AttendanceDAOImpl;
import lk.ijse.gymmanagement.dao.custom.impl.ClientDAOImpl;
import lk.ijse.gymmanagement.dao.custom.impl.ExerciseDAOImpl;
import lk.ijse.gymmanagement.dao.custom.impl.InstructorDAOImpl;
import lk.ijse.gymmanagement.dao.custom.impl.MeasurementDAOImpl;
import lk.ijse.gymmanagement.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.gymmanagement.dao.custom.impl.RegistrationDAOImpl;
import lk.ijse.gymmanagement.dao.custom.impl.ScheduleDAOImpl;
import lk.ijse.gymmanagement.dao.custom.impl.ScheduledetailsDAOImpl;

import lk.ijse.gymmanagement.dto.ExerciseDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class DAOFactory {
    public enum DAOTypes{
        Attendance,Client,Exercise,Instructor,Measurement,Payment,Registration,Schedule,Scheduledetails;
    }
    private  static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    public static DAOFactory getInstance(){
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    public SuperDAO getDAO(DAOTypes daoTypes){
        switch(daoTypes){
            case Client:
                return (SuperDAO) new ClientDAOImpl();
            case Registration:
                return (SuperDAO) new RegistrationDAOImpl();
            case Instructor:
                return (SuperDAO) new InstructorDAOImpl();
            case Exercise:
                return (SuperDAO) new ExerciseDAOImpl();
            case Attendance:
                return (SuperDAO) new AttendanceDAOImpl();
            case Schedule:
                return (SuperDAO) new ScheduleDAOImpl();
            case Scheduledetails:
                return (SuperDAO) new ScheduledetailsDAOImpl();
            case Measurement:
                return (SuperDAO) new MeasurementDAOImpl();
            case Payment:
                return (SuperDAO) new PaymentDAOImpl();
            default:
                return null;
        }
    }
}
