package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.student;

public interface studentRepo extends JpaRepository<student, Integer> {
	public student findByEmail(String email);

}
