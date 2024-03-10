package com.example.data.springdatajpaworkbook.repository;

import com.example.data.springdatajpaworkbook.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat,Long> {
  // Additional methods can be defined here
}
