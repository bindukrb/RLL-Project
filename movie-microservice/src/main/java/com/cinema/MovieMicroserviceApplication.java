package com.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.cinema.entity.Movies;
import com.cinema.repository.MoviesRepository;

@EnableEurekaClient
@SpringBootApplication
public class MovieMicroserviceApplication implements CommandLineRunner{
	
	
	@Autowired 
	@Qualifier("moviesRepository") 
	private MoviesRepository moviesRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieMicroserviceApplication.class, args);
		System.out.println("working perfectly...");
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Running...!");
		
		moviesRepository.save(new Movies(0,"Kantara","Triller","Kannada")); 

		moviesRepository.save(new Movies(0,"KGF-2","Action","Kannada"));

		moviesRepository.save(new Movies(0,"Gandagudi","Documentory","Kannada")); 

		moviesRepository.save(new Movies(0,"RRR","Action","Telugu")); 
		
		System.out.println(moviesRepository.findAll()); 
		
		
	}

}
