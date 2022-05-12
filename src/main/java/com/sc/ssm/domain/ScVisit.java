package com.sc.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 出入申请表
 * @TableName sc_visit
 */
@TableName(value ="sc_visit")
@Data
public class ScVisit implements Serializable {
    /**
     *
     */
    private Date visitId;

    /**
     *  id
     */
    @TableId
    private String visitIds;

    /**
     *  姓名
     */
    private String visitName;

    /**
     *  手机号
     */
    private String visitPhone;

    /**
     *  住址
     */
    private String visitAdress;

    /**
     *  备注详情
     */
    private String visitDetails;

    /**
     * 出入时间
     */
    private String visitTime;

    /**
     * 审核状态
     */
    private String visitState;

    /**
     * 0为用户1为外部人员
     */
    private Integer visitExternal;

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
        ScVisit other = (ScVisit) that;
        return (this.getVisitId() == null ? other.getVisitId() == null : this.getVisitId().equals(other.getVisitId()))
            && (this.getVisitIds() == null ? other.getVisitIds() == null : this.getVisitIds().equals(other.getVisitIds()))
            && (this.getVisitName() == null ? other.getVisitName() == null : this.getVisitName().equals(other.getVisitName()))
            && (this.getVisitPhone() == null ? other.getVisitPhone() == null : this.getVisitPhone().equals(other.getVisitPhone()))
            && (this.getVisitAdress() == null ? other.getVisitAdress() == null : this.getVisitAdress().equals(other.getVisitAdress()))
            && (this.getVisitDetails() == null ? other.getVisitDetails() == null : this.getVisitDetails().equals(other.getVisitDetails()))
            && (this.getVisitTime() == null ? other.getVisitTime() == null : this.getVisitTime().equals(other.getVisitTime()))
            && (this.getVisitState() == null ? other.getVisitState() == null : this.getVisitState().equals(other.getVisitState()))
            && (this.getVisitExternal() == null ? other.getVisitExternal() == null : this.getVisitExternal().equals(other.getVisitExternal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVisitId() == null) ? 0 : getVisitId().hashCode());
        result = prime * result + ((getVisitIds() == null) ? 0 : getVisitIds().hashCode());
        result = prime * result + ((getVisitName() == null) ? 0 : getVisitName().hashCode());
        result = prime * result + ((getVisitPhone() == null) ? 0 : getVisitPhone().hashCode());
        result = prime * result + ((getVisitAdress() == null) ? 0 : getVisitAdress().hashCode());
        result = prime * result + ((getVisitDetails() == null) ? 0 : getVisitDetails().hashCode());
        result = prime * result + ((getVisitTime() == null) ? 0 : getVisitTime().hashCode());
        result = prime * result + ((getVisitState() == null) ? 0 : getVisitState().hashCode());
        result = prime * result + ((getVisitExternal() == null) ? 0 : getVisitExternal().hashCode());
        return result;
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
        sb.append(", visitExternal=").append(visitExternal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
