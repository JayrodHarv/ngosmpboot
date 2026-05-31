package com.jayrodharv.ngosmpboot.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jayrodharv.ngosmpboot.entity.User;
import com.jayrodharv.ngosmpboot.repository.UserRepository;

@ControllerAdvice
public class GlobalControllerAdvice {

    private final UserRepository userRepository;

    public GlobalControllerAdvice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ModelAttribute("activeSMPUser")
    public User getAuthenticatedUser() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth == null ||
            !auth.isAuthenticated() ||
            auth instanceof AnonymousAuthenticationToken) {
            return null;
        }

        String username = auth.getName();

        return userRepository.findById(username).orElse(null);
    }
}