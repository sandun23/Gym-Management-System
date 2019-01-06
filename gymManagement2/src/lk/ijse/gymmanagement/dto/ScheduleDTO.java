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

public class ScheduleDTO extends SuperDTO implements Serializable {
    
    private String scheduleNo;
    
    private String startDate;
    
    private String endDate;
    
    private String Membership_No;
    
    private String instructorID;

    public ScheduleDTO() {
    }

    public ScheduleDTO(String scheduleNo, String startDate, String endDate, String Membership_No, String instructorID) {
        this.scheduleNo = scheduleNo;
        this.startDate = startDate;
        this.endDate = endDate;
        this.Membership_No = Membership_No;
        this.instructorID = instructorID;
    }

    /**
     * @return the scheduleNo
     */
    public String getScheduleNo() {
        return scheduleNo;
    }

    /**
     * @param scheduleNo the scheduleNo to set
     */
    public void setScheduleNo(String scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
    
   

    
}
