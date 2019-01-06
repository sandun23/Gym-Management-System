/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.gymmanagement.controller.custom.ClientController;
import lk.ijse.gymmanagement.dao.DAOFactory;
import lk.ijse.gymmanagement.dao.custom.ClientDAO;
import lk.ijse.gymmanagement.dto.ClientDTO;

/**
 *
 * @author Dilanka Virajith
 */
public class ClientControllerImpl implements ClientController {

    private ClientDAO clientDAO;

    public ClientControllerImpl() {
        clientDAO = (ClientDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Client);
    }

    @Override
    public boolean add(ClientDTO dto) throws Exception {
        return clientDAO.add(dto);
    }

    @Override
    public boolean update(ClientDTO dto) throws Exception {
        return clientDAO.update(dto);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return clientDAO.delete(key);
    }

    @Override
    public ClientDTO search(String key) throws Exception {
        return clientDAO.search(key);
    }

    @Override
    public ArrayList<ClientDTO> getAll() throws Exception {
        return clientDAO.getAll();
    }

    @Override
    public ClientDTO searchClient(String key) throws Exception {
        return clientDAO.searchClient(key);
    }

    @Override
    public ArrayList<String> getAllIds() throws Exception {
        return clientDAO.getAllIds();
    }

}
