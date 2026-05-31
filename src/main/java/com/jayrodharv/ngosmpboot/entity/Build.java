package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Build")
public class Build {

    @Id
    private String BuildID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private User User;

    @ManyToOne
    @JoinColumn(name = "WorldID")
    private World World;

    @ManyToOne
    @JoinColumn(name = "BuildTypeID")
    private BuildType BuildType;

    private LocalDate DateBuilt;

    private String Coordinates;

    private LocalDateTime CreatedAt;

    @Column(columnDefinition = "TEXT")
    private String Description;

    public String getBuildID() {
        return BuildID;
    }

    public void setBuildID(String BuildID) {
        this.BuildID = BuildID;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User User) {
        this.User = User;
    }

    public World getWorld() {
        return World;
    }

    public void setWorld(World World) {
        this.World = World;
    }

    public BuildType getBuildType() {
        return BuildType;
    }

    public void setBuildType(BuildType BuildType) {
        this.BuildType = BuildType;
    }

    public LocalDate getDateBuilt() {
        return DateBuilt;
    }

    public void setDateBuilt(LocalDate DateBuilt) {
        this.DateBuilt = DateBuilt;
    }

    public String getCoordinates() {
        return Coordinates;
    }

    public void setCoordinates(String Coordinates) {
        this.Coordinates = Coordinates;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
