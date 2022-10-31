package com.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.cinema.entity.Admin;
import com.cinema.entity.User;
import com.cinema.repository.AdminRepository;
import com.cinema.repository.UserRepository;



@EnableEurekaClient
@SpringBootApplication
public class AdminMicroserviceApplication implements CommandLineRunner{
	
	@Autowired(required = true)
	@Qualifier("adminRepository") 
	private AdminRepository adminRepository;
	
	@Autowired(required = true)
	@Qualifier("userRepository") 
	private UserRepository userRepository; 

	public static void main(String[] args) {
		SpringApplication.run(AdminMicroserviceApplication.class, args);
		System.out.println("Running......!");
	}

///////////////////////////////////////////////////////////////////////////////////	
	
	@Bean
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	} 
	
////////////////////////////////////////////////////////////////////////////////////	
	
	
	

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("admin working");
		
		adminRepository.save(new Admin(0, "Ram", "M", "ram.1@gmail.com", "ram12345",1)); 		

		adminRepository.save(new Admin(0, "Lakshman", "M", "lakshman.2@gmail.com", "lakshman12345",2)); 

		adminRepository.save(new Admin(0, "Sita", "F", "sita.3@gmail.com", "sita12345",3));  

		adminRepository.save(new Admin(0, "Bharata", "M", "bharata.4@gmail.com", "bharata@12345",4)); 

		System.out.println(adminRepository.findAll()); 
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		System.out.println("user working");
		
		userRepository.save(new User(0, "Ganga", "F", "ganga@gmail.com", "ganga$1234")); 

		userRepository.save(new User(0, "Yamuna", "F", "yamuna@gmail.com", "yamuna$1234")); 

		userRepository.save(new User(0, "Sindhu", "F", "sindhu@gmail.com", "sindhu$1234")); 
		
		userRepository.save(new User(0, "Kaveri", "F", "Kaveri@gmail.com", "Kaveri$1234")); 
		
		System.out.println(userRepository.findAll()); 
		
	}
	
	
	
	

}
