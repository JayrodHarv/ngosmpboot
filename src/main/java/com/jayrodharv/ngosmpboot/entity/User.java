package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "User")
public class User {

    @Id
    private String UserID; // email

    @Column(unique = true)
    private String DisplayName;

    @NotNull
    private String Password;

    @NotNull
    private String Language;

    @Enumerated(EnumType.STRING)
    private Status Status;

    @ManyToOne
    @JoinColumn(name = "RoleID")
    private Role Role;

    @NotNull
    private LocalDateTime CreatedAt;

    private LocalDateTime LastLoggedIn;
    private LocalDateTime UpdatedAt;

    @ManyToOne
    @JoinColumn(name = "PfpImageID")
    private Image PfpImage;

    public enum Status {
        active, inactive, locked
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }

    public Role getRole() {
        return Role;
    }

    public void setRole(Role Role) {
        this.Role = Role;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public LocalDateTime getLastLoggedIn() {
        return LastLoggedIn;
    }

    public void setLastLoggedIn(LocalDateTime LastLoggedIn) {
        this.LastLoggedIn = LastLoggedIn;
    }

    public LocalDateTime getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalDateTime UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public Image getPfpImage() {
        return PfpImage;
    }

    public void setPfpImage(Image PfpImage) {
        this.PfpImage = PfpImage;
    }

    
}
