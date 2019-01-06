/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gymmanagement.controller.custom.PaymentController;
import lk.ijse.gymmanagement.dao.DAOFactory;
import lk.ijse.gymmanagement.dao.custom.PaymentDAO;
import lk.ijse.gymmanagement.dto.PaymentDTO;
import lk.ijse.gymmanagement.dto.QueryPaymentDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class PaymetControllerImpl implements PaymentController{
    private PaymentDAO PaymentDAO;
    
    public PaymetControllerImpl(){
        PaymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Payment);
    }
    
    @Override
    public boolean add(PaymentDTO dto) throws Exception {
        return PaymentDAO.add(dto);
    }

    @Override
    public boolean update(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<QueryPaymentDTO> queryPaymentDTOs() throws Exception {
        return PaymentDAO.queryPaymentDTOs();
    }
    
}
