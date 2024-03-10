package com.example.data.springdatajpaworkbook.service;

import com.example.data.springdatajpaworkbook.entity.Student;
import com.example.data.springdatajpaworkbook.repository.CatRepository;
import com.example.data.springdatajpaworkbook.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatService {
  private final CatRepository catRepository;
  private final StudentRepository studentRepository;

  public CatService(CatRepository catRepository, StudentRepository studentRepository) {
    this.catRepository = catRepository;
    this.studentRepository = studentRepository;
  }

  public boolean doesCatExist(Long id) {
    Student student = studentRepository.findByName("studentName");
    if (student != null) {
      // Handle the student
    } else {
      // Handle the case when the student is not found
    }
  }


}

