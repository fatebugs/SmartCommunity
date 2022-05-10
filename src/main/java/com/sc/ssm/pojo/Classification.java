package com.sc.ssm.pojo;

import java.io.Serializable;

public class Classification implements Serializable {
    private Integer classificationId;

    private String classificationName;

    private String classificationInstructions;

    private String classificationDispose;

    private String classificationDetails;

    private static final long serialVersionUID = 1L;

    public Integer getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Integer classificationId) {
        this.classificationId = classificationId;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public String getClassificationInstructions() {
        return classificationInstructions;
    }

    public void setClassificationInstructions(String classificationInstructions) {
        this.classificationInstructions = classificationInstructions;
    }

    public String getClassificationDispose() {
        return classificationDispose;
    }

    public void setClassificationDispose(String classificationDispose) {
        this.classificationDispose = classificationDispose;
    }

    public String getClassificationDetails() {
        return classificationDetails;
    }

    public void setClassificationDetails(String classificationDetails) {
        this.classificationDetails = classificationDetails;
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