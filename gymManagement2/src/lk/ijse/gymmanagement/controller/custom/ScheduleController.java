/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller.custom;

import lk.ijse.gymmanagement.controller.SuperController;
import lk.ijse.gymmanagement.dto.ScheduleDTO;
import lk.ijse.gymmanagement.dto.ScheduledetailsDTO;

/**
 *
 * @author Dilanka Virajith
 */
public interface ScheduleController extends SuperController<ScheduleDTO>{
    public boolean addSchedule(ScheduleDTO dTO, ScheduledetailsDTO detailDTO)throws Exception;
}
