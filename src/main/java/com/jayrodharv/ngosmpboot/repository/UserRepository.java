package com.jayrodharv.ngosmpboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayrodharv.ngosmpboot.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

    User findByUserID(String userID);
}
