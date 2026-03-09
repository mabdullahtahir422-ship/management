package com.portfolio.portfolioapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.portfolio.portfolioapp.entity.Project;
import com.portfolio.portfolioapp.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Show all projects
    public List<Project> listAll() {
        return projectRepository.findAll();
    }

    // Save project
    public void save(Project project) {
        projectRepository.save(project);
    }

    // Get project by ID
    public Project get(Integer id) {
        return projectRepository.findById(id).orElse(null);
    }

    // Delete project
    public void delete(Integer id) {
        projectRepository.deleteById(id);
    }

    // ===== Dashboard Methods =====

    // Total projects
    public long countTotalProjects() {
        return projectRepository.count();
    }

    // Projects by status
    public long countProjectsByStatus(String status) {
        return projectRepository.countByStatus(status);
    }

}