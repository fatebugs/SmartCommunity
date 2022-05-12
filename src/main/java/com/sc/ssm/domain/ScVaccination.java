package com.sc.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 疫苗接种表
 * @TableName sc_vaccination
 */
@TableName(value ="sc_vaccination")
@Data
public class ScVaccination implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer vaccinationId;

    /**
     * 
     */
    private String vaccinationName;

    /**
     * 
     */
    private String vaccinationSex;

    /**
     * 
     */
    private String vaccinationPhone;

    /**
     * 
     */
    private String vaccinationAdress;

    /**
     * 
     */
    private String vaccinationFirst;

    /**
     * 
     */
    private Date vaccinationFirsttime;

    /**
     * 
     */
    private String vaccinationSecond;

    /**
     * 
     */
    private Date vaccinationSecondtime;

    /**
     * 
     */
    private String vaccinationThird;

    /**
     * 
     */
    private Date vaccinationThirdtime;

    /**
     * 
     */
    private Integer vaccinationCheck;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ScVaccination other = (ScVaccination) that;
        return (this.getVaccinationId() == null ? other.getVaccinationId() == null : this.getVaccinationId().equals(other.getVaccinationId()))
            && (this.getVaccinationName() == null ? other.getVaccinationName() == null : this.getVaccinationName().equals(other.getVaccinationName()))
            && (this.getVaccinationSex() == null ? other.getVaccinationSex() == null : this.getVaccinationSex().equals(other.getVaccinationSex()))
            && (this.getVaccinationPhone() == null ? other.getVaccinationPhone() == null : this.getVaccinationPhone().equals(other.getVaccinationPhone()))
            && (this.getVaccinationAdress() == null ? other.getVaccinationAdress() == null : this.getVaccinationAdress().equals(other.getVaccinationAdress()))
            && (this.getVaccinationFirst() == null ? other.getVaccinationFirst() == null : this.getVaccinationFirst().equals(other.getVaccinationFirst()))
            && (this.getVaccinationFirsttime() == null ? other.getVaccinationFirsttime() == null : this.getVaccinationFirsttime().equals(other.getVaccinationFirsttime()))
            && (this.getVaccinationSecond() == null ? other.getVaccinationSecond() == null : this.getVaccinationSecond().equals(other.getVaccinationSecond()))
            && (this.getVaccinationSecondtime() == null ? other.getVaccinationSecondtime() == null : this.getVaccinationSecondtime().equals(other.getVaccinationSecondtime()))
            && (this.getVaccinationThird() == null ? other.getVaccinationThird() == null : this.getVaccinationThird().equals(other.getVaccinationThird()))
            && (this.getVaccinationThirdtime() == null ? other.getVaccinationThirdtime() == null : this.getVaccinationThirdtime().equals(other.getVaccinationThirdtime()))
            && (this.getVaccinationCheck() == null ? other.getVaccinationCheck() == null : this.getVaccinationCheck().equals(other.getVaccinationCheck()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVaccinationId() == null) ? 0 : getVaccinationId().hashCode());
        result = prime * result + ((getVaccinationName() == null) ? 0 : getVaccinationName().hashCode());
        result = prime * result + ((getVaccinationSex() == null) ? 0 : getVaccinationSex().hashCode());
        result = prime * result + ((getVaccinationPhone() == null) ? 0 : getVaccinationPhone().hashCode());
        result = prime * result + ((getVaccinationAdress() == null) ? 0 : getVaccinationAdress().hashCode());
        result = prime * result + ((getVaccinationFirst() == null) ? 0 : getVaccinationFirst().hashCode());
        result = prime * result + ((getVaccinationFirsttime() == null) ? 0 : getVaccinationFirsttime().hashCode());
        result = prime * result + ((getVaccinationSecond() == null) ? 0 : getVaccinationSecond().hashCode());
        result = prime * result + ((getVaccinationSecondtime() == null) ? 0 : getVaccinationSecondtime().hashCode());
        result = prime * result + ((getVaccinationThird() == null) ? 0 : getVaccinationThird().hashCode());
        result = prime * result + ((getVaccinationThirdtime() == null) ? 0 : getVaccinationThirdtime().hashCode());
        result = prime * result + ((getVaccinationCheck() == null) ? 0 : getVaccinationCheck().hashCode());
        return result;
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
        sb.append(", vaccinationCheck=").append(vaccinationCheck);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
