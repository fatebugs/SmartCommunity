package com.sc.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 垃圾类型表
 * @TableName sc_classification
 */
@TableName(value ="sc_classification")
@Data
public class ScClassification implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer classificationId;

    /**
     * 
     */
    private String classificationName;

    /**
     * 
     */
    private String classificationInstructions;

    /**
     * 
     */
    private String classificationDispose;

    /**
     * 
     */
    private String classificationDetails;

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
        ScClassification other = (ScClassification) that;
        return (this.getClassificationId() == null ? other.getClassificationId() == null : this.getClassificationId().equals(other.getClassificationId()))
            && (this.getClassificationName() == null ? other.getClassificationName() == null : this.getClassificationName().equals(other.getClassificationName()))
            && (this.getClassificationInstructions() == null ? other.getClassificationInstructions() == null : this.getClassificationInstructions().equals(other.getClassificationInstructions()))
            && (this.getClassificationDispose() == null ? other.getClassificationDispose() == null : this.getClassificationDispose().equals(other.getClassificationDispose()))
            && (this.getClassificationDetails() == null ? other.getClassificationDetails() == null : this.getClassificationDetails().equals(other.getClassificationDetails()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClassificationId() == null) ? 0 : getClassificationId().hashCode());
        result = prime * result + ((getClassificationName() == null) ? 0 : getClassificationName().hashCode());
        result = prime * result + ((getClassificationInstructions() == null) ? 0 : getClassificationInstructions().hashCode());
        result = prime * result + ((getClassificationDispose() == null) ? 0 : getClassificationDispose().hashCode());
        result = prime * result + ((getClassificationDetails() == null) ? 0 : getClassificationDetails().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classificationId=").append(classificationId);
        sb.append(", classificationName=").append(classificationName);
        sb.append(", classificationInstructions=").append(classificationInstructions);
        sb.append(", classificationDispose=").append(classificationDispose);
        sb.append(", classificationDetails=").append(classificationDetails);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}