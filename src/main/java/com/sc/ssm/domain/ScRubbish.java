package com.sc.ssm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 垃圾分类表
 * @TableName sc_rubbish
 */
@TableName(value ="sc_rubbish")
@Data
public class ScRubbish implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer rubbishId;

    /**
     * 
     */
    private String rubbishName;

    /**
     * 
     */
    private Integer rubbishFyid;

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
        ScRubbish other = (ScRubbish) that;
        return (this.getRubbishId() == null ? other.getRubbishId() == null : this.getRubbishId().equals(other.getRubbishId()))
            && (this.getRubbishName() == null ? other.getRubbishName() == null : this.getRubbishName().equals(other.getRubbishName()))
            && (this.getRubbishFyid() == null ? other.getRubbishFyid() == null : this.getRubbishFyid().equals(other.getRubbishFyid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRubbishId() == null) ? 0 : getRubbishId().hashCode());
        result = prime * result + ((getRubbishName() == null) ? 0 : getRubbishName().hashCode());
        result = prime * result + ((getRubbishFyid() == null) ? 0 : getRubbishFyid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rubbishId=").append(rubbishId);
        sb.append(", rubbishName=").append(rubbishName);
        sb.append(", rubbishFyid=").append(rubbishFyid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
