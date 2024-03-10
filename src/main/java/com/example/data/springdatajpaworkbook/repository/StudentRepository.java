package com.example.data.springdatajpaworkbook.repository;

import com.example.data.springdatajpaworkbook.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
  @Query("SELECT e FROM Student e WHERE e.name = ?1 and e.age=?2")
  List<Student> findStudentByNameAndAge(String name,Integer age);
}
