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
public class QueryPaymentDTO {
    private String PID;
    private String P_Date;
    private String types;
    private double Amount; 
    private String Membership_No;
    private String fName;

    public QueryPaymentDTO() {
    }

    public QueryPaymentDTO(String PID, String P_Date, String types, double Amount, String Membership_No, String fName) {
        this.PID = PID;
        this.P_Date = P_Date;
        this.types = types;
        this.Amount = Amount;
        this.Membership_No = Membership_No;
        this.fName = fName;
    }

    /**
     * @return the PID
     */
    public String getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(String PID) {
        this.PID = PID;
    }

    /**
     * @return the P_Date
     */
    public String getP_Date() {
        return P_Date;
    }

    /**
     * @param P_Date the P_Date to set
     */
    public void setP_Date(String P_Date) {
        this.P_Date = P_Date;
    }

    /**
     * @return the types
     */
    public String getTypes() {
        return types;
    }

    /**
     * @param types the types to set
     */
    public void setTypes(String types) {
        this.types = types;
    }

    /**
     * @return the Amount
     */
    public double getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(double Amount) {
        this.Amount = Amount;
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
   
}
