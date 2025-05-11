package com.femtech.SpeedBill.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    private String PhoneNumber;
    private String password;
//    @Enumerated(EnumType.STRING)
//    private Role role;
//    ADMIN, USER ,etc
    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;

}
