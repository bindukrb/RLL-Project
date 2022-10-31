package com.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_gender")
	private String userGender;
	
	
	@Column(name="user_email")
	private String userEmail;
	
	
	@Column(name="user_password")
	private String userPassword;
	
	public User() {
		super();
	}

	public User(Integer userId, String userName, String userGender, String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userGender = userGender;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userGender=" + userGender + ", userEmail="
				+ userEmail + ", userPassword=" + userPassword + "]";
	}
	
	
}
