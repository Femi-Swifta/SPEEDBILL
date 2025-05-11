package com.femtech.SpeedBill.repository;

import com.femtech.SpeedBill.model.Transaction;
import com.femtech.SpeedBill.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUser(User user);
}
