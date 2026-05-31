package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Role")
public class Role {

    @Id
    private String roleID;

    private boolean canAddBuilds;
    private boolean canEditAllBuilds;
    private boolean canDeleteAllBuilds;

    private boolean canViewBuildTypes;
    private boolean canAddBuildTypes;
    private boolean canEditBuildTypes;
    private boolean canDeleteBuildTypes;

    private boolean canViewWorlds;
    private boolean canAddWorlds;
    private boolean canEditWorlds;
    private boolean canDeleteWorlds;

    private boolean canViewAllVotes;
    private boolean canAddVotes;
    private boolean canEditAllVotes;
    private boolean canDeleteAllVotes;

    private boolean canViewRoles;
    private boolean canAddRoles;
    private boolean canEditRoles;
    private boolean canDeleteRoles;

    private boolean canViewUsers;
    private boolean canAddUsers;
    private boolean canEditUsers;
    private boolean canBanUsers;

    private String description;

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public boolean isCanAddBuilds() {
        return canAddBuilds;
    }

    public void setCanAddBuilds(boolean canAddBuilds) {
        this.canAddBuilds = canAddBuilds;
    }

    public boolean isCanEditAllBuilds() {
        return canEditAllBuilds;
    }

    public void setCanEditAllBuilds(boolean canEditAllBuilds) {
        this.canEditAllBuilds = canEditAllBuilds;
    }

    public boolean isCanDeleteAllBuilds() {
        return canDeleteAllBuilds;
    }

    public void setCanDeleteAllBuilds(boolean canDeleteAllBuilds) {
        this.canDeleteAllBuilds = canDeleteAllBuilds;
    }

    public boolean isCanViewBuildTypes() {
        return canViewBuildTypes;
    }

    public void setCanViewBuildTypes(boolean canViewBuildTypes) {
        this.canViewBuildTypes = canViewBuildTypes;
    }

    public boolean isCanAddBuildTypes() {
        return canAddBuildTypes;
    }

    public void setCanAddBuildTypes(boolean canAddBuildTypes) {
        this.canAddBuildTypes = canAddBuildTypes;
    }

    public boolean isCanEditBuildTypes() {
        return canEditBuildTypes;
    }

    public void setCanEditBuildTypes(boolean canEditBuildTypes) {
        this.canEditBuildTypes = canEditBuildTypes;
    }

    public boolean isCanDeleteBuildTypes() {
        return canDeleteBuildTypes;
    }

    public void setCanDeleteBuildTypes(boolean canDeleteBuildTypes) {
        this.canDeleteBuildTypes = canDeleteBuildTypes;
    }

    public boolean isCanViewWorlds() {
        return canViewWorlds;
    }

    public void setCanViewWorlds(boolean canViewWorlds) {
        this.canViewWorlds = canViewWorlds;
    }

    public boolean isCanAddWorlds() {
        return canAddWorlds;
    }

    public void setCanAddWorlds(boolean canAddWorlds) {
        this.canAddWorlds = canAddWorlds;
    }

    public boolean isCanEditWorlds() {
        return canEditWorlds;
    }

    public void setCanEditWorlds(boolean canEditWorlds) {
        this.canEditWorlds = canEditWorlds;
    }

    public boolean isCanDeleteWorlds() {
        return canDeleteWorlds;
    }

    public void setCanDeleteWorlds(boolean canDeleteWorlds) {
        this.canDeleteWorlds = canDeleteWorlds;
    }

    public boolean isCanViewAllVotes() {
        return canViewAllVotes;
    }

    public void setCanViewAllVotes(boolean canViewAllVotes) {
        this.canViewAllVotes = canViewAllVotes;
    }

    public boolean isCanAddVotes() {
        return canAddVotes;
    }

    public void setCanAddVotes(boolean canAddVotes) {
        this.canAddVotes = canAddVotes;
    }

    public boolean isCanEditAllVotes() {
        return canEditAllVotes;
    }

    public void setCanEditAllVotes(boolean canEditAllVotes) {
        this.canEditAllVotes = canEditAllVotes;
    }

    public boolean isCanDeleteAllVotes() {
        return canDeleteAllVotes;
    }

    public void setCanDeleteAllVotes(boolean canDeleteAllVotes) {
        this.canDeleteAllVotes = canDeleteAllVotes;
    }

    public boolean isCanViewRoles() {
        return canViewRoles;
    }

    public void setCanViewRoles(boolean canViewRoles) {
        this.canViewRoles = canViewRoles;
    }

    public boolean isCanAddRoles() {
        return canAddRoles;
    }

    public void setCanAddRoles(boolean canAddRoles) {
        this.canAddRoles = canAddRoles;
    }

    public boolean isCanEditRoles() {
        return canEditRoles;
    }

    public void setCanEditRoles(boolean canEditRoles) {
        this.canEditRoles = canEditRoles;
    }

    public boolean isCanDeleteRoles() {
        return canDeleteRoles;
    }

    public void setCanDeleteRoles(boolean canDeleteRoles) {
        this.canDeleteRoles = canDeleteRoles;
    }

    public boolean isCanViewUsers() {
        return canViewUsers;
    }

    public void setCanViewUsers(boolean canViewUsers) {
        this.canViewUsers = canViewUsers;
    }

    public boolean isCanAddUsers() {
        return canAddUsers;
    }

    public void setCanAddUsers(boolean canAddUsers) {
        this.canAddUsers = canAddUsers;
    }

    public boolean isCanEditUsers() {
        return canEditUsers;
    }

    public void setCanEditUsers(boolean canEditUsers) {
        this.canEditUsers = canEditUsers;
    }

    public boolean isCanBanUsers() {
        return canBanUsers;
    }

    public void setCanBanUsers(boolean canBanUsers) {
        this.canBanUsers = canBanUsers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
