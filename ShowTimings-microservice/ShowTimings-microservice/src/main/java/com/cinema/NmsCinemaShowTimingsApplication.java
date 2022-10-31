package com.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.cinema.domain.ShowTimings;
import com.cinema.repository.ShowTimingsRepository;



@EnableEurekaClient
@SpringBootApplication
public class NmsCinemaShowTimingsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(NmsCinemaShowTimingsApplication.class, args);
		System.out.println("Running");
	}
	
	@Autowired
	@Qualifier("showTimingsRepository")
	ShowTimingsRepository showTimingsRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		showTimingsRepository.save(new ShowTimings(0,"11:00","Kantara"));
		showTimingsRepository.save(new ShowTimings(0,"11:11","KGF"));
		
		System.out.println(showTimingsRepository.findAll());
	

}

}
