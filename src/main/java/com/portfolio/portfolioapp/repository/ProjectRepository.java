package com.portfolio.portfolioapp.repository;

import com.portfolio.portfolioapp.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    Integer countByStatus(String status);

}