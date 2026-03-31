package com.portfolio.portfolioapp.controller;

import com.portfolio.portfolioapp.entity.User;
import com.portfolio.portfolioapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignupController {

    @Autowired
    private UserRepository userRepository;

    // Signup page open
    @GetMapping("/signup")
    public String signupPage() {
        return "signup";
    }

    // Signup process
    @PostMapping("/signup")
    public String signup(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password) {

        // Check agar email already exist karta hai
        if (userRepository.findByEmail(email) != null) {
            return "redirect:/signup?exists";
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole("USER");
        user.setVerified(false);

        userRepository.save(user);

        return "redirect:/login?registered";
    }
}