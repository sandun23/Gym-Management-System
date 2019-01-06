/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller;

import com.sun.javafx.scene.control.skin.CustomColorDialog;
import com.sun.security.ntlm.Client;
import lk.ijse.gymmanagement.controller.custom.ClientController;
import lk.ijse.gymmanagement.controller.custom.InstructorController;
import lk.ijse.gymmanagement.controller.custom.RegistrationController;
import lk.ijse.gymmanagement.controller.custom.impl.AttendanceControllerImpl;
import lk.ijse.gymmanagement.controller.custom.impl.ClientControllerImpl;
import lk.ijse.gymmanagement.controller.custom.impl.ExerciseControllerImpl;
import lk.ijse.gymmanagement.controller.custom.impl.InstructorControllerImpl;
import lk.ijse.gymmanagement.controller.custom.impl.MeasurementControllerImpl;
import lk.ijse.gymmanagement.controller.custom.impl.PaymetControllerImpl;
import lk.ijse.gymmanagement.controller.custom.impl.RegistrationControllerImpl;
import lk.ijse.gymmanagement.controller.custom.impl.ScheduleControllerImpl;

/**
 *
 * @author Dilanka Virajith
 */
public class ControllerFactory {
    public enum ControllerTypes{
        Attendance,Client,Exercise,Instructor,Measurement,Payment,Registration,Schedule,Scheduledetails;
    }
    
    private static ControllerFactory ctrlFactory;
    
    private ControllerFactory(){
        
    }
    
    public static ControllerFactory getInstance(){
        if (ctrlFactory == null) {
            ctrlFactory = new ControllerFactory();
        }
        return ctrlFactory;
    }
    public SuperController getController(ControllerTypes controllerTypes){
        switch (controllerTypes){
            case Client:
                return (SuperController) new ClientControllerImpl();
            case Registration:
                return (SuperController) new RegistrationControllerImpl();
            case Instructor:
                return (SuperController) new InstructorControllerImpl();
            case Exercise:
                return (SuperController) new ExerciseControllerImpl();
            case Attendance:
                return (SuperController) new AttendanceControllerImpl();
            case Schedule:
                return (SuperController) new ScheduleControllerImpl();
            case Scheduledetails:
                return (SuperController) new ScheduleControllerImpl();
            case Measurement:
                return (SuperController) new MeasurementControllerImpl();
            case Payment:
                return (SuperController) new PaymetControllerImpl();
            default:
                return null;
        }
    }
}
