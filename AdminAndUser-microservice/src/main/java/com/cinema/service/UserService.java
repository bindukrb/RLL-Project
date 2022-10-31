package com.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cinema.entity.User;

import com.cinema.repository.UserRepository;

@Service("userService")
@Scope("singleton")
public class UserService implements IUserService{
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User userDetails) {
		
		return userRepository.save(userDetails);
	}

	@Override
	public User updateUser(User userDetails) {
		
		return userRepository.save(userDetails);
	}

	@Override
	public void deleteUser(int id) {
		
		userRepository.deleteById(id);
		
	}

	@Override
	public User getUserById(int id) {
		
		return userRepository.findById(id).get();
	}

}
