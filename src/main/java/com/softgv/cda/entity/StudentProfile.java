package com.softgv.cda.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentProfile {
    @Id
    private Long userId;
    private String photo;
    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    
    private String year;

    // Getters and Setters
}