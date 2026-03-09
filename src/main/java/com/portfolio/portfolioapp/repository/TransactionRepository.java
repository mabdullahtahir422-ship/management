package com.portfolio.portfolioapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolioapp.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}

