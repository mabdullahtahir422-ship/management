package com.portfolio.portfolioapp.controller;

import com.portfolio.portfolioapp.entity.Expense;
import com.portfolio.portfolioapp.repository.ExpenseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseRepository expenseRepository;

    public ExpenseController(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    // ✅ LIST PAGE
    @GetMapping
    public String listExpenses(Model model) {
        List<Expense> expenses = expenseRepository.findAll();
        model.addAttribute("expenses", expenses);
        return "expenses-list";   // templates/expenses/list.html
    }

    // ✅ OPEN FORM
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("expense", new Expense());
        return "expenses-form";   // templates/expenses/form.html
    }

    // ✅ SAVE
    @PostMapping("/save")
    public String saveExpense(@ModelAttribute Expense expense) {
        expenseRepository.save(expense);
        return "redirect:/expenses";  // 🔥 back to list
    }
}