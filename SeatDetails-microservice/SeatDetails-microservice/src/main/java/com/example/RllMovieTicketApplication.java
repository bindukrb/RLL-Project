package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.entity.Seat;
import com.example.repository.SeatRepository;

@EnableEurekaClient
@SpringBootApplication
public class RllMovieTicketApplication implements CommandLineRunner{
	
	@Autowired 
	@Qualifier("seatRepository") 
	private SeatRepository seatRepository;
	

	public static void main(String[] args)  {
		SpringApplication.run(RllMovieTicketApplication.class, args);
		
		System.out.println("Starting!!!!");
	}

	@Override
	public void run(String... args) throws Exception {
		seatRepository.save(new Seat(0,"d1","6:10","booked")); 
		System.out.println(seatRepository.findAll());
		
		
	}

}
