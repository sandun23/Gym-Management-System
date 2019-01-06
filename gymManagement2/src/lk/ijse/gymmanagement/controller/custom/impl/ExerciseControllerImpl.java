/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gymmanagement.controller.custom.ExerciseController;
import lk.ijse.gymmanagement.dao.DAOFactory;
import lk.ijse.gymmanagement.dao.custom.ExerciseDAO;
import lk.ijse.gymmanagement.dto.ExerciseDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class ExerciseControllerImpl implements ExerciseController{
    private ExerciseDAO exerciseDAO;
    
    public ExerciseControllerImpl(){
        exerciseDAO = (ExerciseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Exercise);
    }
    @Override
    public boolean add(ExerciseDTO dto) throws Exception {
        return exerciseDAO.add(dto);
    }

    @Override
    public boolean update(ExerciseDTO dto) throws Exception {
        return exerciseDAO.update(dto);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return exerciseDAO.delete(key);
    }

    @Override
    public ExerciseDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExerciseDTO> getAll() throws Exception {
        return  exerciseDAO.getAll();
    }
    
}
