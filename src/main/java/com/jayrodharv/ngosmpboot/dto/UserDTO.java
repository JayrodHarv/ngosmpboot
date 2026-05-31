package com.jayrodharv.ngosmpboot.dto;

import com.jayrodharv.ngosmpboot.entity.Role;

public class UserDTO {
    private String id;
    private String displayName;
    private Role role;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDisplayName() { return displayName; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}
