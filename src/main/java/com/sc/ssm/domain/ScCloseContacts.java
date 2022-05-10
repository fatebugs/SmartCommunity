package com.sc.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 密切接触者
 * @TableName sc_close_contacts
 */
@TableName(value ="sc_close_contacts")
@Data
public class ScCloseContacts implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 密接人姓名
     */
    private String ccName;

    /**
     * 性别
     */
    private Integer ccSex;

    /**
     * 联系电话
     */
    private String ccPhone;

    /**
     * 隔离地址
     */
    private String ccAdress;

    /**
     * 接触的人
     */
    private String ccUsername;

    /**
     * 需要隔离时间
     */
    private String ccIsolationTime;

    /**
     * 隔离方式
     */
    private String ccIsolationWay;

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
        ScCloseContacts other = (ScCloseContacts) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCcName() == null ? other.getCcName() == null : this.getCcName().equals(other.getCcName()))
            && (this.getCcSex() == null ? other.getCcSex() == null : this.getCcSex().equals(other.getCcSex()))
            && (this.getCcPhone() == null ? other.getCcPhone() == null : this.getCcPhone().equals(other.getCcPhone()))
            && (this.getCcAdress() == null ? other.getCcAdress() == null : this.getCcAdress().equals(other.getCcAdress()))
            && (this.getCcUsername() == null ? other.getCcUsername() == null : this.getCcUsername().equals(other.getCcUsername()))
            && (this.getCcIsolationTime() == null ? other.getCcIsolationTime() == null : this.getCcIsolationTime().equals(other.getCcIsolationTime()))
            && (this.getCcIsolationWay() == null ? other.getCcIsolationWay() == null : this.getCcIsolationWay().equals(other.getCcIsolationWay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCcName() == null) ? 0 : getCcName().hashCode());
        result = prime * result + ((getCcSex() == null) ? 0 : getCcSex().hashCode());
        result = prime * result + ((getCcPhone() == null) ? 0 : getCcPhone().hashCode());
        result = prime * result + ((getCcAdress() == null) ? 0 : getCcAdress().hashCode());
        result = prime * result + ((getCcUsername() == null) ? 0 : getCcUsername().hashCode());
        result = prime * result + ((getCcIsolationTime() == null) ? 0 : getCcIsolationTime().hashCode());
        result = prime * result + ((getCcIsolationWay() == null) ? 0 : getCcIsolationWay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ccName=").append(ccName);
        sb.append(", ccSex=").append(ccSex);
        sb.append(", ccPhone=").append(ccPhone);
        sb.append(", ccAdress=").append(ccAdress);
        sb.append(", ccUsername=").append(ccUsername);
        sb.append(", ccIsolationTime=").append(ccIsolationTime);
        sb.append(", ccIsolationWay=").append(ccIsolationWay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}