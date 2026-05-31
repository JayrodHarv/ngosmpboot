package com.jayrodharv.ngosmpboot.entity;

import java.io.Serializable;
import java.util.Objects;

public class UserVoteId implements Serializable {

    private String userID;
    private String voteID;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserVoteId)) return false;
        UserVoteId that = (UserVoteId) o;
        return Objects.equals(userID, that.userID) &&
               Objects.equals(voteID, that.voteID);
    }

    public int hashCode() {
        return Objects.hash(userID, voteID);
    }
}