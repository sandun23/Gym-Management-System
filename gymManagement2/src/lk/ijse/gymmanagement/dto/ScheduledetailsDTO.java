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

public class ScheduledetailsDTO extends SuperDTO implements Serializable {
    
    private String sdid;
    private String eset;
    private String eid;
    private String scheduleNo;

    public ScheduledetailsDTO() {
    }

    public ScheduledetailsDTO(String sdid, String eset, String eid, String scheduleNo) {
        this.sdid = sdid;
        this.eset = eset;
        this.eid = eid;
        this.scheduleNo = scheduleNo;
    }

    /**
     * @return the sdid
     */
    public String getSdid() {
        return sdid;
    }

    /**
     * @param sdid the sdid to set
     */
    public void setSdid(String sdid) {
        this.sdid = sdid;
    }

    /**
     * @return the eset
     */
    public String getEset() {
        return eset;
    }

    /**
     * @param eset the eset to set
     */
    public void setEset(String eset) {
        this.eset = eset;
    }

    /**
     * @return the eid
     */
    public String getEid() {
        return eid;
    }

    /**
     * @param eid the eid to set
     */
    public void setEid(String eid) {
        this.eid = eid;
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
    
}