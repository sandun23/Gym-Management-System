/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.controller;

import java.util.ArrayList;
import lk.ijse.gymmanagement.dto.SuperDTO;

/**
 *
 * @author Dilanka Virajith
 */
public interface SuperController<T extends SuperDTO> {
    public boolean add(T dto)throws Exception;
    
    public boolean update(T dto)throws Exception;
    
    public boolean delete(String key)throws Exception;
    
    public T search(String key)throws Exception;
    
    public ArrayList<T> getAll()throws Exception;
}
