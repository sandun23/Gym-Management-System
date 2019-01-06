/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gymmanagement.controller.custom.ScheduleController;
import lk.ijse.gymmanagement.dao.DAOFactory;
import lk.ijse.gymmanagement.dao.custom.ScheduleDAO;
import lk.ijse.gymmanagement.dto.ScheduleDTO;
import lk.ijse.gymmanagement.dto.ScheduledetailsDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class ScheduleControllerImpl implements ScheduleController{
    
    private ScheduleDAO ScheduleDAO;;
    
    public ScheduleControllerImpl(){
        ScheduleDAO = (ScheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Schedule);
    }
    
    @Override
    public boolean add(ScheduleDTO dto) throws Exception {
        return ScheduleDAO.add(dto);
    }

    @Override
    public boolean update(ScheduleDTO dto) throws Exception {
        return ScheduleDAO.update(dto);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return ScheduleDAO.delete(key);
    }

    @Override
    public ScheduleDTO search(String key) throws Exception {
        return ScheduleDAO.search(key);
    }

    @Override
    public ArrayList<ScheduleDTO> getAll() throws Exception {
        return ScheduleDAO.getAll();
    }

    @Override
    public boolean addSchedule(ScheduleDTO dTO, ScheduledetailsDTO detailDTO) throws Exception {
        return ScheduleDAO.addSchedule(dTO, detailDTO);
    }
    
}
