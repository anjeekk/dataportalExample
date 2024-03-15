package com.dataportal.dataModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column( nullable=false, length=20)
	private String userName;
	
	@Column(nullable=false, unique=true, length=15)
	private String emailId;
	
	@Column(nullable=false, length=10)
	private String password;
	
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName, String emailId, String password) {

		this.id = id;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}
