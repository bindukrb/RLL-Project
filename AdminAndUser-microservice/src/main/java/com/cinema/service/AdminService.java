package com.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cinema.entity.Admin;
import com.cinema.repository.AdminRepository;

import vo.Movies;
import vo.ResponseTemplateVo;


@Service("adminService")
@Scope("singleton")
public class AdminService implements IAdminService{
	
	
	@Autowired
	@Qualifier("adminRepository")
	private AdminRepository adminRepository;
//////////////////////////////////////////////////////////////////////////////////////
	
	
	@Autowired
	private RestTemplate restTemplate;

	public ResponseTemplateVo getAdminWithMovies(int movie_id) {
		
		  ResponseTemplateVo vo= new ResponseTemplateVo();
		  
		  Admin admin  = adminRepository.findById(movie_id).get();
		  
		        
		  Movies movies =restTemplate.getForObject("http://localhost:8082/moviebyid/"+admin.getMovie_id(),Movies.class);
		        
		      vo.setAdmin(admin);
		      vo.setMovies(movies);
		      
		      return vo ;
	
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////	
	@Override
	public List<Admin> getAllAdmins() {
		
	 return adminRepository.findAll();
	}

	@Override
	public Admin saveAdmin(Admin adminDetails) {
		
		return adminRepository.save(adminDetails);
	}

	@Override
	public Admin updateAdmin(Admin adminDetails) {
		
		return adminRepository.save(adminDetails);
	}

	@Override
	public void deleteAdmin(int id) {
		
		adminRepository.deleteById(id);
		
	}

	@Override
	public Admin getAdminById(int id) {
		
		return adminRepository.findById(id).get();
	}
	
	
	
	
	
	
	

}
