package com.portfolio.portfolioapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolioapp.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    // No additional methods needed for basic save and list
}
