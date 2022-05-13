package com.sc.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单表
 * @TableName sc_order
 */
@TableName(value ="sc_order")
@Data
public class ScOrder implements Serializable {
    /**
     * 
     */
    @TableId
    private String orderUuid;

    /**
     * 
     */
    private String orderName;

    /**
     * 
     */
    private String orderPhone;

    /**
     * 
     */
    private String orderAdress;

    /**
     * 
     */
    private Date orderTime;

    /**
     * 
     */
    private String orderRemark;

    /**
     * 
     */
    private String orderState;

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
        ScOrder other = (ScOrder) that;
        return (this.getOrderUuid() == null ? other.getOrderUuid() == null : this.getOrderUuid().equals(other.getOrderUuid()))
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getOrderPhone() == null ? other.getOrderPhone() == null : this.getOrderPhone().equals(other.getOrderPhone()))
            && (this.getOrderAdress() == null ? other.getOrderAdress() == null : this.getOrderAdress().equals(other.getOrderAdress()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getOrderRemark() == null ? other.getOrderRemark() == null : this.getOrderRemark().equals(other.getOrderRemark()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderUuid() == null) ? 0 : getOrderUuid().hashCode());
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getOrderPhone() == null) ? 0 : getOrderPhone().hashCode());
        result = prime * result + ((getOrderAdress() == null) ? 0 : getOrderAdress().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getOrderRemark() == null) ? 0 : getOrderRemark().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderUuid=").append(orderUuid);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderPhone=").append(orderPhone);
        sb.append(", orderAdress=").append(orderAdress);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", orderRemark=").append(orderRemark);
        sb.append(", orderState=").append(orderState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
