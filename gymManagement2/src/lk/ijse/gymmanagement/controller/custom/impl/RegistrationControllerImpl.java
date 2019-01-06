/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gymmanagement.controller.custom.RegistrationController;
import lk.ijse.gymmanagement.dao.DAOFactory;
import lk.ijse.gymmanagement.dao.custom.RegistrationDAO;
import lk.ijse.gymmanagement.dto.RegistrationDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class RegistrationControllerImpl implements RegistrationController{
    private RegistrationDAO registrationDAO;
   
    public RegistrationControllerImpl(){
       registrationDAO = (RegistrationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Registration);
    }

    
    @Override
    public boolean add(RegistrationDTO dto) throws Exception {
        return registrationDAO.add(dto);
    }

    @Override
    public boolean update(RegistrationDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrationDTO search(String key) throws Exception {
       return registrationDAO.search(key);
    }

    @Override
    public ArrayList<RegistrationDTO> getAll() throws Exception {
        return registrationDAO.getAll();
    }
    
    
}
