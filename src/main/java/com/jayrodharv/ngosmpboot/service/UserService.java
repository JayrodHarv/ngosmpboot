package com.jayrodharv.ngosmpboot.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jayrodharv.ngosmpboot.dto.RegisterDTO;
import com.jayrodharv.ngosmpboot.dto.UserDTO;
import com.jayrodharv.ngosmpboot.entity.Role;
import com.jayrodharv.ngosmpboot.entity.User;
import com.jayrodharv.ngosmpboot.repository.RoleRepository;
import com.jayrodharv.ngosmpboot.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {

    private final UserRepository userRepo;
    private final RoleRepository roleRepo;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepo, RoleRepository roleRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public void register(RegisterDTO dto) {

        if (!dto.getPassword().equals(dto.getConfirmPassword())) {
            throw new RuntimeException("Passwords do not match");
        }

        Role defaultRole =
                roleRepo.findById("User")
                        .orElseThrow(() -> new RuntimeException("Default role not found"));

        User user = new User();

        user.setUserID(dto.getEmail());
        user.setDisplayName(dto.getDisplayName());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setRole(defaultRole);
        user.setStatus(User.Status.active);
        user.setCreatedAt(LocalDateTime.now());
        user.setLanguage("en-US");

        userRepo.save(user);

        // Login the user after registration
        UserDetails userDetails =
            new org.springframework.security.core.userdetails.User(
                    user.getUserID(),
                    user.getPassword(),
                    List.of(new SimpleGrantedAuthority("ROLE_USER"))
            );

        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
                userDetails,
                null,
                userDetails.getAuthorities()
        );

        SecurityContextHolder.getContext().setAuthentication(auth);
    }

    // Entity → DTO
    public List<UserDTO> getAllUsers() {
        return userRepo.findAll().stream().map(user -> {
            UserDTO dto = new UserDTO();
            dto.setId(user.getUserID());
            dto.setDisplayName(user.getDisplayName());
            dto.setRole(user.getRole());
            return dto;
        }).toList();
    }
}
