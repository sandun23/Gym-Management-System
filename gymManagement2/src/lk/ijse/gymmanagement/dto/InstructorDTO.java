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

public class InstructorDTO extends SuperDTO implements Serializable {
   
    private String instructorID;
    
    private String nic;
    
    private String fName;
    
    private String lName;
    
    private String gender;
    
    private int age;
    
    private String address;
    
    private String email;
    
    private int telNo;

    public InstructorDTO() {
    }

    public InstructorDTO(String instructorID, String nic, String fName, String lName, String gender, int age, String address, String email, int telNo) {
        this.instructorID = instructorID;
        this.nic = nic;
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.email = email;
        this.telNo = telNo;
    }

    /**
     * @return the instructorID
     */
    public String getInstructorID() {
        return instructorID;
    }

    /**
     * @param instructorID the instructorID to set
     */
    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telNo
     */
    public int getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(int telNo) {
        this.telNo = telNo;
    }
    
     
}
