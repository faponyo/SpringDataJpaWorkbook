package com.example.data.springdatajpaworkbook.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "cat")
public class Cat {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "colour")
  private String colour;

  // Constructor with fields
  public Cat(Long id, String name, String colour) {
    this.id = id;
    this.name = name;
    this.colour = colour;
  }
  // Constructor
  public Cat() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }
}
