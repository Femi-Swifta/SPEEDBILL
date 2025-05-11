package com.femtech.SpeedBill.service;

import com.femtech.SpeedBill.model.Transaction;
import com.femtech.SpeedBill.repository.TransactionRepository;
import com.femtech.SpeedBill.serviceImpl.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService implements TransactionServiceImpl {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return null;
    }

//    public Transaction saveTransaction(Transaction transaction) {
//        // Add logic to handle payments
//        return transactionRepository.save(transaction);
//    }
}
