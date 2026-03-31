package com.portfolio.portfolioapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolioapp.entity.User;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    List<User> findByVerified(Boolean verified);

}