package com.jayrodharv.ngosmpboot.entity;

import java.io.Serializable;
import java.util.Objects;

public class BuildImageId implements Serializable {

    private String buildID;
    private Integer imageID;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BuildImageId)) return false;
        BuildImageId that = (BuildImageId) o;
        return Objects.equals(buildID, that.buildID) &&
               Objects.equals(imageID, that.imageID);
    }

    public int hashCode() {
        return Objects.hash(buildID, imageID);
    }
}
