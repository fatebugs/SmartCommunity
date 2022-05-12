package com.sc.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 居民健康表
 * @TableName sc_health
 */
@TableName(value ="sc_health")
@Data
public class ScHealth implements Serializable {
    /**
     *
     */

    private Date healthId;

    /**
     *
     */
    @TableId
    private String healthIds;

    /**
     *
     */
    private String healthName;

    /**
     *
     */
    private String healthTemperature;

    /**
     *
     */
    private String healthStatus;

    /**
     *
     */
    private String healthOtherstatus;

    /**
     *
     */
    private String healthIstouch;

    /**
     *
     */
    private String healthPhone;

    /**
     *
     */
    private String healthAdree;

    /**
     *
     */
    private String healthDetails;

    /**
     *
     */
    private String healthMatter;

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
        ScHealth other = (ScHealth) that;
        return (this.getHealthId() == null ? other.getHealthId() == null : this.getHealthId().equals(other.getHealthId()))
            && (this.getHealthIds() == null ? other.getHealthIds() == null : this.getHealthIds().equals(other.getHealthIds()))
            && (this.getHealthName() == null ? other.getHealthName() == null : this.getHealthName().equals(other.getHealthName()))
            && (this.getHealthTemperature() == null ? other.getHealthTemperature() == null : this.getHealthTemperature().equals(other.getHealthTemperature()))
            && (this.getHealthStatus() == null ? other.getHealthStatus() == null : this.getHealthStatus().equals(other.getHealthStatus()))
            && (this.getHealthOtherstatus() == null ? other.getHealthOtherstatus() == null : this.getHealthOtherstatus().equals(other.getHealthOtherstatus()))
            && (this.getHealthIstouch() == null ? other.getHealthIstouch() == null : this.getHealthIstouch().equals(other.getHealthIstouch()))
            && (this.getHealthPhone() == null ? other.getHealthPhone() == null : this.getHealthPhone().equals(other.getHealthPhone()))
            && (this.getHealthAdree() == null ? other.getHealthAdree() == null : this.getHealthAdree().equals(other.getHealthAdree()))
            && (this.getHealthDetails() == null ? other.getHealthDetails() == null : this.getHealthDetails().equals(other.getHealthDetails()))
            && (this.getHealthMatter() == null ? other.getHealthMatter() == null : this.getHealthMatter().equals(other.getHealthMatter()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHealthId() == null) ? 0 : getHealthId().hashCode());
        result = prime * result + ((getHealthIds() == null) ? 0 : getHealthIds().hashCode());
        result = prime * result + ((getHealthName() == null) ? 0 : getHealthName().hashCode());
        result = prime * result + ((getHealthTemperature() == null) ? 0 : getHealthTemperature().hashCode());
        result = prime * result + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        result = prime * result + ((getHealthOtherstatus() == null) ? 0 : getHealthOtherstatus().hashCode());
        result = prime * result + ((getHealthIstouch() == null) ? 0 : getHealthIstouch().hashCode());
        result = prime * result + ((getHealthPhone() == null) ? 0 : getHealthPhone().hashCode());
        result = prime * result + ((getHealthAdree() == null) ? 0 : getHealthAdree().hashCode());
        result = prime * result + ((getHealthDetails() == null) ? 0 : getHealthDetails().hashCode());
        result = prime * result + ((getHealthMatter() == null) ? 0 : getHealthMatter().hashCode());
        return result;
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
