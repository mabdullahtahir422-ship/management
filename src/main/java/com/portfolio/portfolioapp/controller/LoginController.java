package com.portfolio.portfolioapp.controller;

import com.portfolio.portfolioapp.entity.User;
import com.portfolio.portfolioapp.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    // Login page open karega
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // Login process
    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String loginType,
            HttpSession session) {

        // ADMIN LOGIN
        if (loginType.equals("ADMIN")) {

            if (username.equals("admin") && password.equals("123456")) {
                session.setAttribute("role", "ADMIN");
                return "redirect:/admin/users";
            }

            return "redirect:/login?error";
        }

        // USER LOGIN
        User user = userRepository.findByEmail(username);

        if (user == null) {
            return "redirect:/login?error";
        }

        if (!user.getVerified()) {
            return "redirect:/login?notapproved";
        }

        if (user.getPassword().equals(password)) {
            session.setAttribute("user", user);
            return "redirect:/dashboard";
        }

        return "redirect:/login?error";
    }
}