package com.example.etas.entity;

import com.example.etas.enums.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

	private Long id;
	private String username;
	private String password;
	private Role role;

}
