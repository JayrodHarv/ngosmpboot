package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "BuildType")
public class BuildType {

    @Id
    private String buildTypeID;

    @Column(columnDefinition = "TEXT")
    private String description;

    public String getBuildTypeID() {
        return buildTypeID;
    }

    public void setBuildTypeID(String buildTypeID) {
        this.buildTypeID = buildTypeID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
