package com.jayrodharv.ngosmpboot.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jayrodharv.ngosmpboot.entity.Role;
import com.jayrodharv.ngosmpboot.entity.User;
import com.jayrodharv.ngosmpboot.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepo;

    public CustomUserDetailsService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        User user =
                userRepo.findById(email)
                        .orElseThrow(
                            () -> new UsernameNotFoundException(email)
                        );

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUserID())
                .password(user.getPassword())
                .authorities(buildAuthorities(user))
                .accountLocked(
                    user.getStatus() == User.Status.locked
                )
                .disabled(
                    user.getStatus() == User.Status.inactive
                )
                .build();
    }

    private Collection<GrantedAuthority>
    buildAuthorities(User user) {

        List<GrantedAuthority> authorities =
                new ArrayList<>();

        Role role = user.getRole();

        if(role.isCanAddBuilds())
            authorities.add(
                new SimpleGrantedAuthority("BUILD_ADD")
            );

        if(role.isCanEditAllBuilds())
            authorities.add(
                new SimpleGrantedAuthority("BUILD_EDIT_ALL")
            );

        if(role.isCanDeleteAllBuilds())
            authorities.add(
                new SimpleGrantedAuthority("BUILD_DELETE_ALL")
            );

        return authorities;
    }
}
