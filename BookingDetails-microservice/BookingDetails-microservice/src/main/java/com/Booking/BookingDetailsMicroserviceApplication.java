package com.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.Booking.Domain.BookingDetails;
import com.Booking.Repository.BookingRepository;


@EnableEurekaClient
@SpringBootApplication
public class BookingDetailsMicroserviceApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("bookingRepository")
	private BookingRepository bookingRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookingDetailsMicroserviceApplication.class, args);
		
		System.out.println("Running....!");
	}

	@Override
	public void run(String... args) throws Exception {
		
		bookingRepository.save(new BookingDetails(0, "2022-11-15", "NMS Cinemas", "10 D,11 D", "Kantara", 250,"2:30"));
		bookingRepository.save(new BookingDetails(0, "2022-11-15", "NMS Cinemas", "10 D,15 D", "headbush",350,"6:0"));
		
		System.out.println(bookingRepository.findAll());
		
	}

}
