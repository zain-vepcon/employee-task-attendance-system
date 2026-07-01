package com.example.etas.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.etas.enums.AttendanceStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "attendance")
@Getter
@Setter
public class Attendance {
	
	 private Long id;
	 private Employee employee;
	 private LocalDate attendanceDate;
	 private LocalDateTime checkInTime;
	 private LocalDateTime checkOutTime;
	 private AttendanceStatus status;

}
