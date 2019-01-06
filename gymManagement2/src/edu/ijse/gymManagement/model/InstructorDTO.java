/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gymManagement.model;

/**
 *
 * @author Dilanka Virajith
 */
public class InstructorDTO {
    private String InstructorID;
    private String NIC;
    private String FirstName;
    private String LastName;
    private String Gender;
    private int Age;
    private String Address;
    private String Email;
    private int TelNo;

    public InstructorDTO() {
    }

    public InstructorDTO(String InstructorID, String NIC, String FirstName, String LastName, String Gender, int Age, String Address, String Email, int TelNo) {
        this.InstructorID = InstructorID;
        this.NIC = NIC;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.Age = Age;
        this.Address = Address;
        this.Email = Email;
        this.TelNo = TelNo;
    }

    /**
     * @return the InstructorID
     */
    public String getInstructorID() {
        return InstructorID;
    }

    /**
     * @param InstructorID the InstructorID to set
     */
    public void setInstructorID(String InstructorID) {
        this.InstructorID = InstructorID;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the TelNo
     */
    public int getTelNo() {
        return TelNo;
    }

    /**
     * @param TelNo the TelNo to set
     */
    public void setTelNo(int TelNo) {
        this.TelNo = TelNo;
    }
    
    
}
