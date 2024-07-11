package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Employee;


@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> 
{
  
}
