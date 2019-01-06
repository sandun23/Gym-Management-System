/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.dto;

/**
 *
 * @author Dilanka Virajith
 */
public class RegistrationDTO extends SuperDTO{
    private String Membership_No;
    private String Date;
    private String ClientID;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String Membership_No, String Date, String ClientID) {
        this.Membership_No = Membership_No;
        this.Date = Date;
        this.ClientID = ClientID;
    }

    /**
     * @return the Membership_No
     */
    public String getMembership_No() {
        return Membership_No;
    }

    /**
     * @param Membership_No the Membership_No to set
     */
    public void setMembership_No(String Membership_No) {
        this.Membership_No = Membership_No;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the ClientID
     */
    public String getClientID() {
        return ClientID;
    }

    /**
     * @param ClientID the ClientID to set
     */
    public void setClientID(String ClientID) {
        this.ClientID = ClientID;
    }
    
    
}
