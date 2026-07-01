package com.example.etas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etas.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
