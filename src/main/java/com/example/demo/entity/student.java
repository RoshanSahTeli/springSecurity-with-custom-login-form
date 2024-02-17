package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String role;
	
	private String email;
	
	private String password;

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(int id, String name, String role, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", role=" + role + ", email=" + email + ", password=" + password
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
