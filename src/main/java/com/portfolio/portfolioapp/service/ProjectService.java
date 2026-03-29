package com.portfolio.portfolioapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.time.LocalDate;

import com.portfolio.portfolioapp.entity.Project;
import com.portfolio.portfolioapp.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Show all projects
    public List<Project> listAll() {
        List<Project> projects = projectRepository.findAll();

        // Auto update status when listing projects
        LocalDate today = LocalDate.now();

        for (Project project : projects) {

            if (project.getEndDate() != null && today.isAfter(project.getEndDate())) {
                project.setStatus("Completed");
            }
            else if (project.getStartDate() != null &&
                    (today.isEqual(project.getStartDate()) || today.isAfter(project.getStartDate()))) {
                project.setStatus("Active");
            }
            else {
                project.setStatus("Pending");
            }
        }

        return projects;
    }

    // Save project (Auto status set)
    public void save(Project project) {

        LocalDate today = LocalDate.now();

        if (project.getEndDate() != null && today.isAfter(project.getEndDate())) {
            project.setStatus("Completed");
        }
        else if (project.getStartDate() != null &&
                (today.isEqual(project.getStartDate()) || today.isAfter(project.getStartDate()))) {
            project.setStatus("Active");
        }
        else {
            project.setStatus("Pending");
        }

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