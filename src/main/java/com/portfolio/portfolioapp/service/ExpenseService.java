package com.portfolio.portfolioapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.portfolio.portfolioapp.entity.Expense;
import com.portfolio.portfolioapp.repository.ExpenseRepository;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> listAll() {
        return expenseRepository.findAll();
    }

    public void save(Expense expense) {
        expenseRepository.save(expense);
    }
}
