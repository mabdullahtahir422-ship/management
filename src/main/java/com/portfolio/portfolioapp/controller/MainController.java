package com.portfolio.portfolioapp.controller;

import com.portfolio.portfolioapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {

        long totalProjects = projectService.countTotalProjects();
        long activeProjects = projectService.countProjectsByStatus("Active");
        long completedProjects = projectService.countProjectsByStatus("Completed");

        model.addAttribute("totalProjects", totalProjects);
        model.addAttribute("activeProjects", activeProjects);
        model.addAttribute("completedProjects", completedProjects);

        return "dashboard";
    }
}