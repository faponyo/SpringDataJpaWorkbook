package com.example.data.springdatajpaworkbook.entity;

import jakarta.persistence.*;

@Entity
public class Units {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String unitName;
  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student parent;

  // Getters and setters
}
