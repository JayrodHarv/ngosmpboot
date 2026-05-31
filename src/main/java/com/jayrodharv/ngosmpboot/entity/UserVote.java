package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "UserVote")
@IdClass(UserVoteId.class)
public class UserVote {

    @Id
    private String userID;

    @Id
    private String voteID;

    private Integer optionID;

    private LocalDateTime voteTime;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getVoteID() {
        return voteID;
    }

    public void setVoteID(String voteID) {
        this.voteID = voteID;
    }

    public Integer getOptionID() {
        return optionID;
    }

    public void setOptionID(Integer optionID) {
        this.optionID = optionID;
    }

    public LocalDateTime getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(LocalDateTime voteTime) {
        this.voteTime = voteTime;
    }
}
