package com.cinema.fallback;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cinema.entity.Admin;
import com.cinema.entity.BookingDetails;
import com.cinema.entity.Movies;
import com.cinema.entity.Payment;
import com.cinema.entity.Seat;
import com.cinema.entity.ShowTimings;
import com.cinema.entity.User;
import com.cinema.proxy.MovieServiceProxy;

@Component
public class MovieServiceFallback implements MovieServiceProxy{


///////////////////////////////// ADMIN /////////////////////////////////////////////////////////////////////////
	
	@Override
	public List<Admin> getAllAdmin() {
		
		return  Arrays.asList(new Admin(1, "Ram", "M", "ram.1@gmail.com", "***********"),
							  new Admin(2, "Lakshman", "M", "lakshman.2@gmail.com", "***********"),
							  new Admin(3, "Sita", "F", "sita.3@gmail.com", "***********"),
							  new Admin(4, "Bharata", "M", "bharata.4@gmail.com", "***********"));
	}

	@Override
	public Admin getAdminById(Integer id) {
		
		return new Admin(id, "Ram", "M", "ram.1@gmail.com", "*********");
	}
	
///////////////////////////////// USERS ////////////////////////////////////////////////////////////////////////
	
	
	@Override
	public List<User> getAllUsers() {
		
		return  Arrays.asList(new  User(1, "Ganga", "F", "ganga@gmail.com", "***********"),
				new  User(2, "Yamuna", "F", "yamuna@gmail.com", "*************"),
				new  User(3, "Sindhu", "F", "sindhu@gmail.com", "***********"),
				new  User(4, "Kaveri", "F", "Kaveri@gmail.com", "***********"));
	}

	@Override
	public User getUserById(Integer id) {
		
		return new User(id, "Ganga", "F", "ganga@gmail.com", "*************");
	}
	
	
	//////////////////////////////////// MOVIES  //////////////////////////////////////////////
	
	@Override
	public List<Movies> getAllMovies() {
		
		return Arrays.asList(new Movies(1,"Kantara","Triller","Kannada"),
				new Movies(2,"KGF-2","Action","Kannada"),
				new Movies(3,"Sahoo","Action","Telugu"),
				new Movies(4,"Jai Bheem","Triller","Kannada"));
	}

	@Override
	public Movies getMovieById(Integer id) {
		
		return new Movies(id,"Kantara","Triller","Kannada");
	}
	
	
	
////////////////////////////////////////// BOOKING DETAILS ///////////////////////////////////////////////

	@Override
	public List<BookingDetails> getAllBookings() {
		
		return Arrays.asList(new BookingDetails(1, "2022-11-15", "NMS Cinemas", "10 D,11 D", "Kantara", 250,"2:30"),
					new BookingDetails(2, "2022-11-15", "NMS Cinemas", "10 D,15 D", "headbush",350,"6:00"));
	}

	@Override
	public BookingDetails getBookingsById(Integer id) {
		
		return new BookingDetails(id, "2022-11-15", "NMS Cinemas", "10 D,11 D", "Kantara", 250,"2:30");
	}


////////////////////////////////////////// SHOW TIMINGS ///////////////////////////////////////////////////////////
	
	
	@Override
	public List<ShowTimings> getAllShows() {
		
		return Arrays.asList(new ShowTimings(1,"11:00","Kantara"),
						new ShowTimings(2,"11:11","KGF"));
	}

	@Override
	public ShowTimings getShowsById(Integer id) {
		
		return new ShowTimings(id, "11:00","Kantara");
		
	}

	
////////////////////////////////////////  SEAT  ///////////////////////////////////////////////////////////////////
	
	@Override
	public List<Seat> getAllSeats() {
		
		return Arrays.asList(new Seat(1,"d1","6:10pm","booked"),
				new Seat(2,"A4","1:10pm","booked"));
	}

	@Override
	public Seat getSeatById(Integer id) {
		
		return new Seat(id,"d1","6:10pm","booked");
	}
	
///////////////////////////////// PAYMENT DETAILS ?///////////////////////////////////////////////////////////	

	@Override
	public List<Payment> getAllPayments() {
		return Arrays.asList(new Payment(1,"10-2-2022","11:00","500"),
				new Payment(2,"16-1-2022","12:00","800"));
	}

	@Override
	public Payment getPaymentById(Integer id) {
	
	  return new Payment(id,"16-1-2022","12:00","800");
	}

 


	

}
