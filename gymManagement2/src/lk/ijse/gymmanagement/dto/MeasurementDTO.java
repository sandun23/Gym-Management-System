/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagement.dto;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 *
 * @author Dilanka Virajith
 */

public class MeasurementDTO extends SuperDTO implements Serializable {
    
    private String mid;
    
    private BigDecimal neck;
    
    private BigDecimal chest;
    
    private BigDecimal abdomen;
    
    private BigDecimal waist;
    
    private BigDecimal weight;
    
    private BigDecimal height;
    
    private BigDecimal lThight;
    
    private BigDecimal rThight;
    
    private BigDecimal lArm;
    
    private BigDecimal rArm;
    
    private BigDecimal lForearm;
    
    private BigDecimal rForearm;
    
    private BigDecimal lCalf;
    
    private BigDecimal rCalf;
    
    private String scheduleNo;

    public MeasurementDTO() {
    }

    public MeasurementDTO(String mid, BigDecimal neck, BigDecimal chest, BigDecimal abdomen, BigDecimal waist, BigDecimal weight, BigDecimal height, BigDecimal lThight, BigDecimal rThight, BigDecimal lArm, BigDecimal rArm, BigDecimal lForearm, BigDecimal rForearm, BigDecimal lCalf, BigDecimal rCalf, String scheduleNo) {
        this.mid = mid;
        this.neck = neck;
        this.chest = chest;
        this.abdomen = abdomen;
        this.waist = waist;
        this.weight = weight;
        this.height = height;
        this.lThight = lThight;
        this.rThight = rThight;
        this.lArm = lArm;
        this.rArm = rArm;
        this.lForearm = lForearm;
        this.rForearm = rForearm;
        this.lCalf = lCalf;
        this.rCalf = rCalf;
        this.scheduleNo = scheduleNo;
    }

    /**
     * @return the mid
     */
    public String getMid() {
        return mid;
    }

    /**
     * @param mid the mid to set
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * @return the neck
     */
    public BigDecimal getNeck() {
        return neck;
    }

    /**
     * @param neck the neck to set
     */
    public void setNeck(BigDecimal neck) {
        this.neck = neck;
    }

    /**
     * @return the chest
     */
    public BigDecimal getChest() {
        return chest;
    }

    /**
     * @param chest the chest to set
     */
    public void setChest(BigDecimal chest) {
        this.chest = chest;
    }

    /**
     * @return the abdomen
     */
    public BigDecimal getAbdomen() {
        return abdomen;
    }

    /**
     * @param abdomen the abdomen to set
     */
    public void setAbdomen(BigDecimal abdomen) {
        this.abdomen = abdomen;
    }

    /**
     * @return the waist
     */
    public BigDecimal getWaist() {
        return waist;
    }

    /**
     * @param waist the waist to set
     */
    public void setWaist(BigDecimal waist) {
        this.waist = waist;
    }

    /**
     * @return the weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * @return the lThight
     */
    public BigDecimal getlThight() {
        return lThight;
    }

    /**
     * @param lThight the lThight to set
     */
    public void setlThight(BigDecimal lThight) {
        this.lThight = lThight;
    }

    /**
     * @return the rThight
     */
    public BigDecimal getrThight() {
        return rThight;
    }

    /**
     * @param rThight the rThight to set
     */
    public void setrThight(BigDecimal rThight) {
        this.rThight = rThight;
    }

    /**
     * @return the lArm
     */
    public BigDecimal getlArm() {
        return lArm;
    }

    /**
     * @param lArm the lArm to set
     */
    public void setlArm(BigDecimal lArm) {
        this.lArm = lArm;
    }

    /**
     * @return the rArm
     */
    public BigDecimal getrArm() {
        return rArm;
    }

    /**
     * @param rArm the rArm to set
     */
    public void setrArm(BigDecimal rArm) {
        this.rArm = rArm;
    }

    /**
     * @return the lForearm
     */
    public BigDecimal getlForearm() {
        return lForearm;
    }

    /**
     * @param lForearm the lForearm to set
     */
    public void setlForearm(BigDecimal lForearm) {
        this.lForearm = lForearm;
    }

    /**
     * @return the rForearm
     */
    public BigDecimal getrForearm() {
        return rForearm;
    }

    /**
     * @param rForearm the rForearm to set
     */
    public void setrForearm(BigDecimal rForearm) {
        this.rForearm = rForearm;
    }

    /**
     * @return the lCalf
     */
    public BigDecimal getlCalf() {
        return lCalf;
    }

    /**
     * @param lCalf the lCalf to set
     */
    public void setlCalf(BigDecimal lCalf) {
        this.lCalf = lCalf;
    }

    /**
     * @return the rCalf
     */
    public BigDecimal getrCalf() {
        return rCalf;
    }

    /**
     * @param rCalf the rCalf to set
     */
    public void setrCalf(BigDecimal rCalf) {
        this.rCalf = rCalf;
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
