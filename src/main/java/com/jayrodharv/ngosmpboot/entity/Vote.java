package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Vote")
public class Vote {

    @Id
    private String VoteID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private User User;

    @Column(columnDefinition = "TEXT")
    private String Description;

    private LocalDateTime StartTime;
    private LocalDateTime EndTime;

    public String getVoteID() {
        return VoteID;
    }
    public void setVoteID(String VoteID) {
        this.VoteID = VoteID;
    }
    public User getUser() {
        return User;
    }
    public void setUser(User User) {
        this.User = User;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public LocalDateTime getStartTime() {
        return StartTime;
    }
    public void setStartTime(LocalDateTime StartTime) {
        this.StartTime = StartTime;
    }
    public LocalDateTime getEndTime() {
        return EndTime;
    }
    public void setEndTime(LocalDateTime EndTime) {
        this.EndTime = EndTime;
    }
}
