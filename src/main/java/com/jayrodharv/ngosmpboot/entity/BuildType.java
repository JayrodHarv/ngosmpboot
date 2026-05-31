package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "BuildType")
public class BuildType {

    @Id
    private String BuildTypeID;

    @Column(columnDefinition = "TEXT")
    private String Description;

    public String getBuildTypeID() {
        return BuildTypeID;
    }

    public void setBuildTypeID(String BuildTypeID) {
        this.BuildTypeID = BuildTypeID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
