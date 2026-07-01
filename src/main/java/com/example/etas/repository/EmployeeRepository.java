package com.example.etas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etas.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
