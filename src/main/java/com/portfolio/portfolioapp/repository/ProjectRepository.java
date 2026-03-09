package com.portfolio.portfolioapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolioapp.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    long countByStatus(String status);

}