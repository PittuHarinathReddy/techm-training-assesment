package com.example.manager.managerdemo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // Default constructor
    public Client() {}

    // Parameterized constructor
    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
