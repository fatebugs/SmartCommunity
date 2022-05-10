package com.sc.ssm.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Visit implements Serializable {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date visitId;

    private String visitIds;

    private String visitName;

    private String visitPhone;

    private String visitAdress;

    private String visitDetails;

    private String visitTime;

    private String visitState;

    private static final long serialVersionUID = 1L;

    public Date getVisitId() {
        return visitId;
    }

    public void setVisitId(Date visitId) {
        this.visitId = visitId;
    }

    public String getVisitIds() {
        return visitIds;
    }

    public void setVisitIds(String visitIds) {
        this.visitIds = visitIds;
    }

    public String getVisitName() {
        return visitName;
    }

    public void setVisitName(String visitName) {
        this.visitName = visitName;
    }

    public String getVisitPhone() {
        return visitPhone;
    }

    public void setVisitPhone(String visitPhone) {
        this.visitPhone = visitPhone;
    }

    public String getVisitAdress() {
        return visitAdress;
    }

    public void setVisitAdress(String visitAdress) {
        this.visitAdress = visitAdress;
    }

    public String getVisitDetails() {
        return visitDetails;
    }

    public void setVisitDetails(String visitDetails) {
        this.visitDetails = visitDetails;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitState() {
        return visitState;
    }

    public void setVisitState(String visitState) {
        this.visitState = visitState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", visitId=").append(visitId);
        sb.append(", visitIds=").append(visitIds);
        sb.append(", visitName=").append(visitName);
        sb.append(", visitPhone=").append(visitPhone);
        sb.append(", visitAdress=").append(visitAdress);
        sb.append(", visitDetails=").append(visitDetails);
        sb.append(", visitTime=").append(visitTime);
        sb.append(", visitState=").append(visitState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}