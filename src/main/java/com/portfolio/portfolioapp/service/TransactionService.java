/*package com.portfolio.portfolioapp.service;

import com.portfolio.portfolioapp.entity.Transaction;
import com.portfolio.portfolioapp.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    // Constructor Injection (Best Practice)
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    // ===== SAVE TRANSACTION =====
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    // ===== GET ALL TRANSACTIONS =====
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}*/
package com.portfolio.portfolioapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.portfolio.portfolioapp.entity.Transaction;
import com.portfolio.portfolioapp.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> listAll() {
        return transactionRepository.findAll();
    }

    public void save(Transaction transaction) {
        transactionRepository.save(transaction);
    }
}
