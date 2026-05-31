package com.jayrodharv.ngosmpboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jayrodharv.ngosmpboot.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

    Optional<Role> findByRoleID(String roleID);

}
