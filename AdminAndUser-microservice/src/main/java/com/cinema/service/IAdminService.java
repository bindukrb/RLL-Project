package com.cinema.service;

import java.util.List;

import com.cinema.entity.Admin;

import vo.ResponseTemplateVo;

public interface IAdminService {
	
	List<Admin> getAllAdmins();
	
	Admin saveAdmin(Admin adminDetails );
	
	Admin updateAdmin(Admin adminDetails);
	
	void deleteAdmin(int id);
	
	Admin getAdminById(int id);
	
//////////////////////////////////////////////////////////////
	
	public ResponseTemplateVo getAdminWithMovies(int movie_id);

}
