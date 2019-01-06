/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gymmanagement.controller.custom.InstructorController;
import lk.ijse.gymmanagement.dao.DAOFactory;
import lk.ijse.gymmanagement.dao.custom.InstructorDAO;
import lk.ijse.gymmanagement.dto.InstructorDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class InstructorControllerImpl implements InstructorController{
    
    private InstructorDAO instructorDAO;
    
    public InstructorControllerImpl(){
        instructorDAO = (InstructorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Instructor);
    }

    @Override
    public boolean add(InstructorDTO dto) throws Exception {
        return instructorDAO.add(dto);
    }

    @Override
    public boolean update(InstructorDTO dto) throws Exception {
        return instructorDAO.update(dto);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return instructorDAO.delete(key);
    }

    @Override
    public InstructorDTO search(String key) throws Exception {
        return instructorDAO.search(key);
    }

    @Override
    public ArrayList<InstructorDTO> getAll() throws Exception {
        return instructorDAO.getAll();
    }
    
}
