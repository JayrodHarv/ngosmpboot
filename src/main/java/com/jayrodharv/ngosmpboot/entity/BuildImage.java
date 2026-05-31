package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "BuildImage")
@IdClass(BuildImageId.class)
public class BuildImage {

    @Id
    private String buildID;

    @Id
    private Integer imageID;

    private boolean isPrimary;
    private int sortOrder;
    
    public String getBuildID() {
        return buildID;
    }
    public void setBuildID(String buildID) {
        this.buildID = buildID;
    }
    public Integer getImageID() {
        return imageID;
    }
    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }
    public boolean isPrimary() {
        return isPrimary;
    }
    public void setPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }
    public int getSortOrder() {
        return sortOrder;
    }
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
}
