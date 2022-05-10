package com.sc.ssm.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Resident implements Serializable {
    private Integer residentsId;

    private String residentsName;

    private String residentsPassword;

    private String residentsSex;

    private String residentsAdress;

    private String residentsPhone;

    private String residentsIdentity;

    private String residentsSecurity;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date residentsTime;

    private static final long serialVersionUID = 1L;

    public Integer getResidentsId() {
        return residentsId;
    }

    public void setResidentsId(Integer residentsId) {
        this.residentsId = residentsId;
    }

    public String getResidentsName() {
        return residentsName;
    }

    public void setResidentsName(String residentsName) {
        this.residentsName = residentsName;
    }

    public String getResidentsPassword() {
        return residentsPassword;
    }

    public void setResidentsPassword(String residentsPassword) {
        this.residentsPassword = residentsPassword;
    }

    public String getResidentsSex() {
        return residentsSex;
    }

    public void setResidentsSex(String residentsSex) {
        this.residentsSex = residentsSex;
    }

    public String getResidentsAdress() {
        return residentsAdress;
    }

    public void setResidentsAdress(String residentsAdress) {
        this.residentsAdress = residentsAdress;
    }

    public String getResidentsPhone() {
        return residentsPhone;
    }

    public void setResidentsPhone(String residentsPhone) {
        this.residentsPhone = residentsPhone;
    }

    public String getResidentsIdentity() {
        return residentsIdentity;
    }

    public void setResidentsIdentity(String residentsIdentity) {
        this.residentsIdentity = residentsIdentity;
    }

    public String getResidentsSecurity() {
        return residentsSecurity;
    }

    public void setResidentsSecurity(String residentsSecurity) {
        this.residentsSecurity = residentsSecurity;
    }

    public Date getResidentsTime() {
        return residentsTime;
    }

    public void setResidentsTime(Date residentsTime) {
        this.residentsTime = residentsTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", residentsId=").append(residentsId);
        sb.append(", residentsName=").append(residentsName);
        sb.append(", residentsPassword=").append(residentsPassword);
        sb.append(", residentsSex=").append(residentsSex);
        sb.append(", residentsAdress=").append(residentsAdress);
        sb.append(", residentsPhone=").append(residentsPhone);
        sb.append(", residentsIdentity=").append(residentsIdentity);
        sb.append(", residentsSecurity=").append(residentsSecurity);
        sb.append(", residentsTime=").append(residentsTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}