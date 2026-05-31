package com.jayrodharv.ngosmpboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jayrodharv.ngosmpboot.dto.RegisterDTO;
import com.jayrodharv.ngosmpboot.service.UserService;
import com.jayrodharv.ngosmpboot.util.FlashUtil;

import jakarta.validation.Valid;

@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("pageTitle", "Register");
        model.addAttribute("contentPage", "auth/register");
        model.addAttribute("registerDTO", new RegisterDTO());
        return "layouts/base";
    }

    @PostMapping("/register")
    public String processRegister(
        @Valid @ModelAttribute("registerDTO") RegisterDTO dto,
        BindingResult bindingResult,
        RedirectAttributes redirectAttributes,
        Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("pageTitle", "Register");
            model.addAttribute("contentPage", "auth/register");
            return "layouts/base";
        }

        try {
            userService.register(dto);
            FlashUtil.success(redirectAttributes, "Registration successful!");
            return "redirect:/login?registered=true";
        } catch (RuntimeException e) {
            model.addAttribute("pageTitle", "Register");
            model.addAttribute("contentPage", "auth/register");
            FlashUtil.danger(redirectAttributes, "Unable to register user: " + e.getMessage());
            return "layouts/base";
        }
    }

    @GetMapping("/login")
    public String login(Model model) {

        model.addAttribute("pageTitle", "Login");
        model.addAttribute("contentPage", "auth/login");
        return "layouts/base";
    }


}
