package com.example.etas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {
	
	private Long id;
	 private String employeeCode;
	 private String name;
	 private String email;
	 private String department;
	 private String designation;

}
