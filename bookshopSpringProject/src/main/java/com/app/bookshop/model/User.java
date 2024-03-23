package com.app.bookshop.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "userTable")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@Column(name = "fname")
	private String firstName;
	
	@Column(name = "lname")
	private String lastName;
	
	@Column(name = "age")
	private int age;
	
	
	@Column(name = "pwd" ,nullable = false)
	private String password;


	public User(String firstName, String lastName, int age, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getUserId() {
		return userId;
	}


	
	
}
