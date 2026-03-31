package com.portfolio.portfolioapp.controller;

import com.portfolio.portfolioapp.entity.User;
import com.portfolio.portfolioapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    // Admin Panel - Unapproved Users List
    @GetMapping("/users")
    public String viewUsers(Model model) {

        List<User> users = userRepository.findByVerified(false);

        model.addAttribute("users", users);

        return "admin-users";
    }

    // Approve User
    @GetMapping("/approve/{id}")
    public String approveUser(@PathVariable Long id) {

        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            user.setVerified(true);
            userRepository.save(user);
        }

        return "redirect:/admin/users";
    }

    // Optional - Approved Users List (future use)
    @GetMapping("/approved")
    public String approvedUsers(Model model) {

        List<User> users = userRepository.findByVerified(true);

        model.addAttribute("users", users);

        return "approved-users";
    }
}