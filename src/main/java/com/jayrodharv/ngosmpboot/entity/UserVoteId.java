package com.jayrodharv.ngosmpboot.entity;

import java.io.Serializable;
import java.util.Objects;

public class UserVoteId implements Serializable {

    private String UserID;
    private String VoteID;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserVoteId)) return false;
        UserVoteId that = (UserVoteId) o;
        return Objects.equals(UserID, that.UserID) &&
               Objects.equals(VoteID, that.VoteID);
    }

    public int hashCode() {
        return Objects.hash(UserID, VoteID);
    }
}