package com.sc.ssm.pojo;

import java.io.Serializable;

public class Rubbish implements Serializable {
    private Integer rubbishId;

    private String rubbishName;

    private Integer rubbishFyid;

    private static final long serialVersionUID = 1L;

    public Integer getRubbishId() {
        return rubbishId;
    }

    public void setRubbishId(Integer rubbishId) {
        this.rubbishId = rubbishId;
    }

    public String getRubbishName() {
        return rubbishName;
    }

    public void setRubbishName(String rubbishName) {
        this.rubbishName = rubbishName;
    }

    public Integer getRubbishFyid() {
        return rubbishFyid;
    }

    public void setRubbishFyid(Integer rubbishFyid) {
        this.rubbishFyid = rubbishFyid;
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