package com.example.data.springdatajpaworkbook.repository;

import com.example.data.springdatajpaworkbook.entity.Units;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnitsRepository extends JpaRepository<Units,Long> {
  List<Units> findByParent_Name(String studentName);
  List<Units> findByParent_IdAndUnitName(Long parentId, String unitName);


}
