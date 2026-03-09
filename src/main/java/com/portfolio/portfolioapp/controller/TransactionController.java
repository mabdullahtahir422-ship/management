package com.portfolio.portfolioapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.portfolio.portfolioapp.entity.Transaction;
import com.portfolio.portfolioapp.service.TransactionService;

@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public String viewTransactionList(Model model) {
        model.addAttribute("transactions", transactionService.listAll());
        return "Transactions";
    }

    @GetMapping("/transactions/new")
    public String showNewTransactionForm(Model model) {
        model.addAttribute("transaction", new Transaction());
        return "ADD Transaction";
    }

    @PostMapping("/transactions/save")
    public String saveTransaction(@ModelAttribute("transaction") Transaction transaction) {
        transactionService.save(transaction);
        return "redirect:/transactions";
    }
}