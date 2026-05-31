package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "World")
public class World {

    @Id
    private String WorldID;

    private LocalDate DateStarted;

    @Column(columnDefinition = "TEXT")
    private String Description;

    public String getWorldID() {
        return WorldID;
    }

    public void setWorldID(String WorldID) {
        this.WorldID = WorldID;
    }

    public LocalDate getDateStarted() {
        return DateStarted;
    }

    public void setDateStarted(LocalDate DateStarted) {
        this.DateStarted = DateStarted;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
