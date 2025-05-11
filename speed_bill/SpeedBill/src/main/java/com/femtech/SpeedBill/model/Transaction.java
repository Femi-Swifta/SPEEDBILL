package com.femtech.SpeedBill.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name ="transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private Double amount;
    private String status;
//    Success , pending, Failed
    private LocalDateTime transactionTime;
    @ManyToOne
    private Product product;

//    @ManyToMany
//    @JoinColumn(name = "user_id")
//    private User user;

}
