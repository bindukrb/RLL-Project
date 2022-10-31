package com.cinema.service;

import java.util.List;

import com.cinema.entity.User;

public interface IUserService {
	
	List<User> getAllUser();
	
	User saveUser(User userDetails );
	
	User updateUser(User userDetails);
	
	void deleteUser(int id);
	
	User getUserById(int id);

}
