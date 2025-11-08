package com.ashhek.transaction_service.controller;

import com.ashhek.transaction_service.model.Transaction;
import com.ashhek.transaction_service.service.TransactionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.saveTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{userId}")
    public List<Transaction> getUserTransactions(@PathVariable String userId) {
        return transactionService.getTransactionsByUserId(userId);
    }
}
