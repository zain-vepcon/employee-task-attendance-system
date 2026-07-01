package com.example.etas.entity;

import java.time.LocalDate;

import com.example.etas.enums.TaskPriority;
import com.example.etas.enums.TaskStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {
	
	private Long id;
	private String title;
	private String description;
	private Employee employee;
	private Employee assignedBy;
	private LocalDate deadline;
	private TaskPriority priority;
	 private TaskStatus status;
	 private Integer progressPercentage;

}
