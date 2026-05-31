package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "BuildImage")
@IdClass(BuildImageId.class)
public class BuildImage {

    @Id
    private String BuildID;

    @Id
    private Integer ImageID;

    private boolean IsPrimary;
    private int SortOrder;
    
    public String getBuildID() {
        return BuildID;
    }
    public void setBuildID(String BuildID) {
        this.BuildID = BuildID;
    }
    public Integer getImageID() {
        return ImageID;
    }
    public void setImageID(Integer ImageID) {
        this.ImageID = ImageID;
    }
    public boolean isIsPrimary() {
        return IsPrimary;
    }
    public void setIsPrimary(boolean IsPrimary) {
        this.IsPrimary = IsPrimary;
    }
    public int getSortOrder() {
        return SortOrder;
    }
    public void setSortOrder(int SortOrder) {
        this.SortOrder = SortOrder;
    }
}
