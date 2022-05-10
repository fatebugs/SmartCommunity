package com.sc.ssm.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Health implements Serializable {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date healthId;

    private String healthIds;

    private String healthName;

    private String healthTemperature;

    private String healthStatus;

    private String healthOtherstatus;

    private String healthIstouch;

    private String healthPhone;

    private String healthAdree;

    private String healthDetails;

    private String healthMatter;

    private static final long serialVersionUID = 1L;

    public Date getHealthId() {
        return healthId;
    }

    public void setHealthId(Date healthId) {
        this.healthId = healthId;
    }

    public String getHealthIds() {
        return healthIds;
    }

    public void setHealthIds(String healthIds) {
        this.healthIds = healthIds;
    }

    public String getHealthName() {
        return healthName;
    }

    public void setHealthName(String healthName) {
        this.healthName = healthName;
    }

    public String getHealthTemperature() {
        return healthTemperature;
    }

    public void setHealthTemperature(String healthTemperature) {
        this.healthTemperature = healthTemperature;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getHealthOtherstatus() {
        return healthOtherstatus;
    }

    public void setHealthOtherstatus(String healthOtherstatus) {
        this.healthOtherstatus = healthOtherstatus;
    }

    public String getHealthIstouch() {
        return healthIstouch;
    }

    public void setHealthIstouch(String healthIstouch) {
        this.healthIstouch = healthIstouch;
    }

    public String getHealthPhone() {
        return healthPhone;
    }

    public void setHealthPhone(String healthPhone) {
        this.healthPhone = healthPhone;
    }

    public String getHealthAdree() {
        return healthAdree;
    }

    public void setHealthAdree(String healthAdree) {
        this.healthAdree = healthAdree;
    }

    public String getHealthDetails() {
        return healthDetails;
    }

    public void setHealthDetails(String healthDetails) {
        this.healthDetails = healthDetails;
    }

    public String getHealthMatter() {
        return healthMatter;
    }

    public void setHealthMatter(String healthMatter) {
        this.healthMatter = healthMatter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", healthId=").append(healthId);
        sb.append(", healthIds=").append(healthIds);
        sb.append(", healthName=").append(healthName);
        sb.append(", healthTemperature=").append(healthTemperature);
        sb.append(", healthStatus=").append(healthStatus);
        sb.append(", healthOtherstatus=").append(healthOtherstatus);
        sb.append(", healthIstouch=").append(healthIstouch);
        sb.append(", healthPhone=").append(healthPhone);
        sb.append(", healthAdree=").append(healthAdree);
        sb.append(", healthDetails=").append(healthDetails);
        sb.append(", healthMatter=").append(healthMatter);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}