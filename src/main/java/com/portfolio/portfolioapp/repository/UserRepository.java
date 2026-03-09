package com.portfolio.portfolioapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolioapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
