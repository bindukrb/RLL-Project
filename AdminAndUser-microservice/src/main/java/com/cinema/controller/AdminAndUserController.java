package com.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.entity.Admin;
import com.cinema.entity.User;
import com.cinema.service.AdminService;
import com.cinema.service.UserService;

import vo.ResponseTemplateVo;


@RestController
@Scope("request")
public class AdminAndUserController {
	
	@Autowired
	@Qualifier("adminService")
	private AdminService adminService;
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	
///////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	@GetMapping(value="/adminwithmovies/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseTemplateVo getAdminWithMovies(@PathVariable("id") int movie_id) {
		
		return adminService.getAdminWithMovies(movie_id);
	}
	
	

	
	
///////////////////////////////////////////////////////////////////////////////////////////	
	
	@GetMapping(value="/admin", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Admin> getAllAdmins(){
		
		return adminService.getAllAdmins();	
	}
	
	@PostMapping(value="/admin", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.CREATED)
	public Admin createAdmin(@RequestBody Admin admin) {
		
		return adminService.saveAdmin(admin);
	}
	
	@PutMapping(value="/admin", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.OK)
	public Admin updateAdmin(@RequestBody Admin admin) {
		
		return adminService.updateAdmin(admin); 
	}
	
	@DeleteMapping(value = "/admin/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteAdmin(@PathVariable int id ) {
	
		adminService.deleteAdmin(id);
	}
	
	@GetMapping(value="/adminbyid/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Admin getAdminById(@PathVariable int id) {
		return adminService.getAdminById(id);
	}
	
	

//	**********************************************************************************************
//              *****************  USER CONTROLLERS  *********************************************
//************************************************************************************************
	
	

	@GetMapping(value="/user", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<User> getAllUsers(){
		
		return userService.getAllUser();		
	}
	
	
	@PostMapping(value="/user", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.CREATED)
	public User createUser(@RequestBody User user) {
		
		return userService.saveUser(user);
	}
	
	
	@PutMapping(value="/user", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.OK)
	public User updateUser(@RequestBody User user) {
		
		return userService.updateUser(user);
	}
	

	@DeleteMapping(value = "/user/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable int id ) {
	
		userService.deleteUser(id);
	}
	
	
	@GetMapping(value="/Userbyid/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	
		

}































