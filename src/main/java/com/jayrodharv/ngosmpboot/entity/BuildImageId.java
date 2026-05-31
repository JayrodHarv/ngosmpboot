package com.jayrodharv.ngosmpboot.entity;

import java.io.Serializable;
import java.util.Objects;

public class BuildImageId implements Serializable {

    private String BuildID;
    private Integer ImageID;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BuildImageId)) return false;
        BuildImageId that = (BuildImageId) o;
        return Objects.equals(BuildID, that.BuildID) &&
               Objects.equals(ImageID, that.ImageID);
    }

    public int hashCode() {
        return Objects.hash(BuildID, ImageID);
    }
}
