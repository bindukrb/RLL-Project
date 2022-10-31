package com.cinema.entity;


public class User {


	private Integer userId;
	

	private String userName;
	

	private String userGender;
	
	
	
	private String userEmail;
	
	
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
