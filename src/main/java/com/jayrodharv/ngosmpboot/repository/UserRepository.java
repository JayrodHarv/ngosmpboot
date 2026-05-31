package com.jayrodharv.ngosmpboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayrodharv.ngosmpboot.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUserID(String userID);

    boolean existsByDisplayName(String displayName);
}
