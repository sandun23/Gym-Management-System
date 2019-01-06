/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.dto;

import java.io.Serializable;

/**
 *
 * @author Dilanka Virajith
 */

public class ExerciseDTO extends SuperDTO implements Serializable {
    
    private String id;
    
    private String Name;

    public ExerciseDTO() {
    }

    public ExerciseDTO(String id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    
}
