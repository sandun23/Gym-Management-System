/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.dao.custom;

import java.util.ArrayList;
import lk.ijse.gymmanagement.dao.SuperDAO;
import lk.ijse.gymmanagement.dto.ClientDTO;
import lk.ijse.gymmanagement.dto.SuperDTO;

/**
 *
 * @author Dilanka Virajith
 */
public interface ClientDAO extends SuperDAO<ClientDTO> {

    public ClientDTO searchClient(String key) throws Exception;
    
    public ArrayList<String> getAllIds()throws Exception;
}
