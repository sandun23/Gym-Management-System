/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller.custom;

import java.util.ArrayList;
import lk.ijse.gymmanagement.controller.SuperController;
import lk.ijse.gymmanagement.dto.PaymentDTO;
import lk.ijse.gymmanagement.dto.QueryPaymentDTO;

/**
 *
 * @author Dilanka Virajith
 */
public interface PaymentController extends SuperController<PaymentDTO>{
    public ArrayList<QueryPaymentDTO> queryPaymentDTOs ()throws Exception;
}
