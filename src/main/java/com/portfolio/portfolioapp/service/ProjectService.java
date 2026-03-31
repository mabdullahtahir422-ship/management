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

    // All projects list
    public List<Project> listAll() {
        List<Project> projects = projectRepository.findAll();
        updateProjectStatus(projects);
        return projects;
    }

    // Save project
    public void save(Project project) {
        updateSingleProjectStatus(project);
        projectRepository.save(project);
    }

    // Get project by id
    public Project get(Integer id) {
        return projectRepository.findById(id).orElse(null);
    }

    // Delete project
    public void delete(Integer id) {
        projectRepository.deleteById(id);
    }

    // Total projects count
    public long countTotalProjects() {
        return projectRepository.count();
    }

    // Count by status
    public long countProjectsByStatus(String status) {
        return projectRepository.countByStatus(status);
    }

    // -------- Helper Methods --------

    private void updateProjectStatus(List<Project> projects) {
        LocalDate today = LocalDate.now();

        for (Project project : projects) {
            updateStatus(project, today);
        }
    }

    private void updateSingleProjectStatus(Project project) {
        LocalDate today = LocalDate.now();
        updateStatus(project, today);
    }

    private void updateStatus(Project project, LocalDate today) {

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
}