package com.cinema;


import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.cinema.domain.Payment;
import com.cinema.repository.PaymentRepository;





@EnableEurekaClient
@SpringBootApplication
public class NmsCinemaPaymentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(NmsCinemaPaymentApplication.class, args);
		System.out.println("Running");
	}
//////////////////
@Bean
public RestTemplate restTemplate() {

return new RestTemplate();
} 
//////////////////////////

	@Autowired
	@Qualifier("paymentRepository")
	PaymentRepository paymentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		paymentRepository.save(new Payment(0,"10-2-2022","11:00","500",1));
		paymentRepository.save(new Payment(0,"16-1-2022","12:00","800",2));
		
		System.out.println(paymentRepository.findAll());
	

}
}
