package com.portfolio.portfolioapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfolioapp.entity.Project;
import com.portfolio.portfolioapp.service.ProjectService;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    // Show all projects
    @GetMapping("/projects")
    public String viewProjectList(Model model) {
        model.addAttribute("projects", projectService.listAll());
        return "project-list";
    }

    // Open form to add new project
    @GetMapping("/projects/new")
    public String showNewProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "project-form";
    }

    // Save project
    @PostMapping("/projects/save")
    public String saveProject(@ModelAttribute("project") Project project) {
        projectService.save(project);
        return "redirect:/projects";
    }

    // EDIT project by ID
    @GetMapping("/projects/edit")
    public String showEditProjectForm(@RequestParam("id") Integer id, Model model) {
        Project project = projectService.get(id);
        model.addAttribute("project", project);
        return "project-form";
    }

    // DELETE project by ID
    @GetMapping("/projects/delete")
    public String deleteProject(@RequestParam("id") Integer id) {
        projectService.delete(id);
        return "redirect:/projects";
    }

    // SEARCH PROJECT BY ID (highlight row)
    @GetMapping("/projects/search")
    public String searchProject(@RequestParam("id") Integer id, Model model) {

        model.addAttribute("projects", projectService.listAll()); // poori table
        model.addAttribute("searchId", id); // searched id highlight ke liye

        return "project-list";
    }
}