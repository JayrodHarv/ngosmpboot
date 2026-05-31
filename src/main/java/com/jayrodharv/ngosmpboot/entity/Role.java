package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Role")
public class Role {

    @Id
    private String RoleID;

    private boolean CanAddBuilds;
    private boolean CanEditAllBuilds;
    private boolean CanDeleteAllBuilds;

    private boolean CanViewBuildTypes;
    private boolean CanAddBuildTypes;
    private boolean CanEditBuildTypes;
    private boolean CanDeleteBuildTypes;

    private boolean CanViewWorlds;
    private boolean CanAddWorlds;
    private boolean CanEditWorlds;
    private boolean CanDeleteWorlds;

    private boolean CanViewAllVotes;
    private boolean CanAddVotes;
    private boolean CanEditAllVotes;
    private boolean CanDeleteAllVotes;

    private boolean CanViewRoles;
    private boolean CanAddRoles;
    private boolean CanEditRoles;
    private boolean CanDeleteRoles;

    private boolean CanViewUsers;
    private boolean CanAddUsers;
    private boolean CanEditUsers;
    private boolean CanBanUsers;

    private String Description;

    public String getRoleID() {
        return RoleID;
    }

    public void setRoleID(String RoleID) {
        this.RoleID = RoleID;
    }

    public boolean isCanAddBuilds() {
        return CanAddBuilds;
    }

    public void setCanAddBuilds(boolean CanAddBuilds) {
        this.CanAddBuilds = CanAddBuilds;
    }

    public boolean isCanEditAllBuilds() {
        return CanEditAllBuilds;
    }

    public void setCanEditAllBuilds(boolean CanEditAllBuilds) {
        this.CanEditAllBuilds = CanEditAllBuilds;
    }

    public boolean isCanDeleteAllBuilds() {
        return CanDeleteAllBuilds;
    }

    public void setCanDeleteAllBuilds(boolean CanDeleteAllBuilds) {
        this.CanDeleteAllBuilds = CanDeleteAllBuilds;
    }

    public boolean isCanViewBuildTypes() {
        return CanViewBuildTypes;
    }

    public void setCanViewBuildTypes(boolean CanViewBuildTypes) {
        this.CanViewBuildTypes = CanViewBuildTypes;
    }

    public boolean isCanAddBuildTypes() {
        return CanAddBuildTypes;
    }

    public void setCanAddBuildTypes(boolean CanAddBuildTypes) {
        this.CanAddBuildTypes = CanAddBuildTypes;
    }

    public boolean isCanEditBuildTypes() {
        return CanEditBuildTypes;
    }

    public void setCanEditBuildTypes(boolean CanEditBuildTypes) {
        this.CanEditBuildTypes = CanEditBuildTypes;
    }

    public boolean isCanDeleteBuildTypes() {
        return CanDeleteBuildTypes;
    }

    public void setCanDeleteBuildTypes(boolean CanDeleteBuildTypes) {
        this.CanDeleteBuildTypes = CanDeleteBuildTypes;
    }

    public boolean isCanViewWorlds() {
        return CanViewWorlds;
    }

    public void setCanViewWorlds(boolean CanViewWorlds) {
        this.CanViewWorlds = CanViewWorlds;
    }

    public boolean isCanAddWorlds() {
        return CanAddWorlds;
    }

    public void setCanAddWorlds(boolean CanAddWorlds) {
        this.CanAddWorlds = CanAddWorlds;
    }

    public boolean isCanEditWorlds() {
        return CanEditWorlds;
    }

    public void setCanEditWorlds(boolean CanEditWorlds) {
        this.CanEditWorlds = CanEditWorlds;
    }

    public boolean isCanDeleteWorlds() {
        return CanDeleteWorlds;
    }

    public void setCanDeleteWorlds(boolean CanDeleteWorlds) {
        this.CanDeleteWorlds = CanDeleteWorlds;
    }

    public boolean isCanViewAllVotes() {
        return CanViewAllVotes;
    }

    public void setCanViewAllVotes(boolean CanViewAllVotes) {
        this.CanViewAllVotes = CanViewAllVotes;
    }

    public boolean isCanAddVotes() {
        return CanAddVotes;
    }

    public void setCanAddVotes(boolean CanAddVotes) {
        this.CanAddVotes = CanAddVotes;
    }

    public boolean isCanEditAllVotes() {
        return CanEditAllVotes;
    }

    public void setCanEditAllVotes(boolean CanEditAllVotes) {
        this.CanEditAllVotes = CanEditAllVotes;
    }

    public boolean isCanDeleteAllVotes() {
        return CanDeleteAllVotes;
    }

    public void setCanDeleteAllVotes(boolean CanDeleteAllVotes) {
        this.CanDeleteAllVotes = CanDeleteAllVotes;
    }

    public boolean isCanViewRoles() {
        return CanViewRoles;
    }

    public void setCanViewRoles(boolean CanViewRoles) {
        this.CanViewRoles = CanViewRoles;
    }

    public boolean isCanAddRoles() {
        return CanAddRoles;
    }

    public void setCanAddRoles(boolean CanAddRoles) {
        this.CanAddRoles = CanAddRoles;
    }

    public boolean isCanEditRoles() {
        return CanEditRoles;
    }

    public void setCanEditRoles(boolean CanEditRoles) {
        this.CanEditRoles = CanEditRoles;
    }

    public boolean isCanDeleteRoles() {
        return CanDeleteRoles;
    }

    public void setCanDeleteRoles(boolean CanDeleteRoles) {
        this.CanDeleteRoles = CanDeleteRoles;
    }

    public boolean isCanViewUsers() {
        return CanViewUsers;
    }

    public void setCanViewUsers(boolean CanViewUsers) {
        this.CanViewUsers = CanViewUsers;
    }

    public boolean isCanAddUsers() {
        return CanAddUsers;
    }

    public void setCanAddUsers(boolean CanAddUsers) {
        this.CanAddUsers = CanAddUsers;
    }

    public boolean isCanEditUsers() {
        return CanEditUsers;
    }

    public void setCanEditUsers(boolean CanEditUsers) {
        this.CanEditUsers = CanEditUsers;
    }

    public boolean isCanBanUsers() {
        return CanBanUsers;
    }

    public void setCanBanUsers(boolean CanBanUsers) {
        this.CanBanUsers = CanBanUsers;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    
}
