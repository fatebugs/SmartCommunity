package com.sc.ssm.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Vaccination implements Serializable {
    private Integer vaccinationId;

    private String vaccinationName;

    private String vaccinationSex;

    private String vaccinationPhone;

    private String vaccinationAdress;

    private String vaccinationFirst;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date vaccinationFirsttime;

    private String vaccinationSecond;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date vaccinationSecondtime;

    private String vaccinationThird;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date vaccinationThirdtime;

    private static final long serialVersionUID = 1L;

    public Integer getVaccinationId() {
        return vaccinationId;
    }

    public void setVaccinationId(Integer vaccinationId) {
        this.vaccinationId = vaccinationId;
    }

    public String getVaccinationName() {
        return vaccinationName;
    }

    public void setVaccinationName(String vaccinationName) {
        this.vaccinationName = vaccinationName;
    }

    public String getVaccinationSex() {
        return vaccinationSex;
    }

    public void setVaccinationSex(String vaccinationSex) {
        this.vaccinationSex = vaccinationSex;
    }

    public String getVaccinationPhone() {
        return vaccinationPhone;
    }

    public void setVaccinationPhone(String vaccinationPhone) {
        this.vaccinationPhone = vaccinationPhone;
    }

    public String getVaccinationAdress() {
        return vaccinationAdress;
    }

    public void setVaccinationAdress(String vaccinationAdress) {
        this.vaccinationAdress = vaccinationAdress;
    }

    public String getVaccinationFirst() {
        return vaccinationFirst;
    }

    public void setVaccinationFirst(String vaccinationFirst) {
        this.vaccinationFirst = vaccinationFirst;
    }

    public Date getVaccinationFirsttime() {
        return vaccinationFirsttime;
    }

    public void setVaccinationFirsttime(Date vaccinationFirsttime) {
        this.vaccinationFirsttime = vaccinationFirsttime;
    }

    public String getVaccinationSecond() {
        return vaccinationSecond;
    }

    public void setVaccinationSecond(String vaccinationSecond) {
        this.vaccinationSecond = vaccinationSecond;
    }

    public Date getVaccinationSecondtime() {
        return vaccinationSecondtime;
    }

    public void setVaccinationSecondtime(Date vaccinationSecondtime) {
        this.vaccinationSecondtime = vaccinationSecondtime;
    }

    public String getVaccinationThird() {
        return vaccinationThird;
    }

    public void setVaccinationThird(String vaccinationThird) {
        this.vaccinationThird = vaccinationThird;
    }

    public Date getVaccinationThirdtime() {
        return vaccinationThirdtime;
    }

    public void setVaccinationThirdtime(Date vaccinationThirdtime) {
        this.vaccinationThirdtime = vaccinationThirdtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vaccinationId=").append(vaccinationId);
        sb.append(", vaccinationName=").append(vaccinationName);
        sb.append(", vaccinationSex=").append(vaccinationSex);
        sb.append(", vaccinationPhone=").append(vaccinationPhone);
        sb.append(", vaccinationAdress=").append(vaccinationAdress);
        sb.append(", vaccinationFirst=").append(vaccinationFirst);
        sb.append(", vaccinationFirsttime=").append(vaccinationFirsttime);
        sb.append(", vaccinationSecond=").append(vaccinationSecond);
        sb.append(", vaccinationSecondtime=").append(vaccinationSecondtime);
        sb.append(", vaccinationThird=").append(vaccinationThird);
        sb.append(", vaccinationThirdtime=").append(vaccinationThirdtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}