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
public class AttendanceDTO extends SuperDTO implements Serializable {
    private String AID;
    private String A_Date;
    private String In_Time;
    private String Out_Time;
    private String Membership_No;

    public AttendanceDTO() {
    }

    public AttendanceDTO(String AID, String A_Date, String In_Time, String Out_Time, String Membership_No) {
        this.AID = AID;
        this.A_Date = A_Date;
        this.In_Time = In_Time;
        this.Out_Time = Out_Time;
        this.Membership_No = Membership_No;
    }

    /**
     * @return the AID
     */
    public String getAID() {
        return AID;
    }

    /**
     * @param AID the AID to set
     */
    public void setAID(String AID) {
        this.AID = AID;
    }

    /**
     * @return the A_Date
     */
    public String getA_Date() {
        return A_Date;
    }

    /**
     * @param A_Date the A_Date to set
     */
    public void setA_Date(String A_Date) {
        this.A_Date = A_Date;
    }

    /**
     * @return the In_Time
     */
    public String getIn_Time() {
        return In_Time;
    }

    /**
     * @param In_Time the In_Time to set
     */
    public void setIn_Time(String In_Time) {
        this.In_Time = In_Time;
    }

    /**
     * @return the Out_Time
     */
    public String getOut_Time() {
        return Out_Time;
    }

    /**
     * @param Out_Time the Out_Time to set
     */
    public void setOut_Time(String Out_Time) {
        this.Out_Time = Out_Time;
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
    
    
}
