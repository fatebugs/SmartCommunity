package com.sc.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 消杀管理
 * @TableName sc_disinfecting
 */
@TableName(value ="sc_disinfecting")
@Data
public class ScDisinfecting implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 小区
     */
    private String community;

    /**
     * 楼号
     */
    private String floor;

    /**
     * 消杀时间
     */
    private Date disinfectTime;

    /**
     * 是否消杀
     */
    private Integer disinfectResult;

    /**
     * 负责人
     */
    private String disinfectStaff;

    /**
     * 消杀方法
     */
    private String disinfectWay;

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
        ScDisinfecting other = (ScDisinfecting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCommunity() == null ? other.getCommunity() == null : this.getCommunity().equals(other.getCommunity()))
            && (this.getFloor() == null ? other.getFloor() == null : this.getFloor().equals(other.getFloor()))
            && (this.getDisinfectTime() == null ? other.getDisinfectTime() == null : this.getDisinfectTime().equals(other.getDisinfectTime()))
            && (this.getDisinfectResult() == null ? other.getDisinfectResult() == null : this.getDisinfectResult().equals(other.getDisinfectResult()))
            && (this.getDisinfectStaff() == null ? other.getDisinfectStaff() == null : this.getDisinfectStaff().equals(other.getDisinfectStaff()))
            && (this.getDisinfectWay() == null ? other.getDisinfectWay() == null : this.getDisinfectWay().equals(other.getDisinfectWay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCommunity() == null) ? 0 : getCommunity().hashCode());
        result = prime * result + ((getFloor() == null) ? 0 : getFloor().hashCode());
        result = prime * result + ((getDisinfectTime() == null) ? 0 : getDisinfectTime().hashCode());
        result = prime * result + ((getDisinfectResult() == null) ? 0 : getDisinfectResult().hashCode());
        result = prime * result + ((getDisinfectStaff() == null) ? 0 : getDisinfectStaff().hashCode());
        result = prime * result + ((getDisinfectWay() == null) ? 0 : getDisinfectWay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", community=").append(community);
        sb.append(", floor=").append(floor);
        sb.append(", disinfectTime=").append(disinfectTime);
        sb.append(", disinfectResult=").append(disinfectResult);
        sb.append(", disinfectStaff=").append(disinfectStaff);
        sb.append(", disinfectWay=").append(disinfectWay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}