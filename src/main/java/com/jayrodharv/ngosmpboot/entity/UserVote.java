package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "UserVote")
@IdClass(UserVoteId.class)
public class UserVote {

    @Id
    private String UserID;

    @Id
    private String VoteID;

    private Integer OptionID;

    private LocalDateTime VoteTime;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getVoteID() {
        return VoteID;
    }

    public void setVoteID(String VoteID) {
        this.VoteID = VoteID;
    }

    public Integer getOptionID() {
        return OptionID;
    }

    public void setOptionID(Integer OptionID) {
        this.OptionID = OptionID;
    }

    public LocalDateTime getVoteTime() {
        return VoteTime;
    }

    public void setVoteTime(LocalDateTime VoteTime) {
        this.VoteTime = VoteTime;
    }
}
