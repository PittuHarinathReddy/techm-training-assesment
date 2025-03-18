package com.example.manager.managerdemo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "consultants")
@Getter
@Setter
public class Consultant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;

    // Default constructor
    public Consultant() {}

    // Parameterized constructor
    public Consultant(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}
