package com.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.entity.Admin;
import com.cinema.entity.BookingDetails;
import com.cinema.entity.Movies;
import com.cinema.entity.Payment;
import com.cinema.entity.Seat;
import com.cinema.entity.ShowTimings;
import com.cinema.entity.User;
import com.cinema.proxy.MovieServiceProxy;

@RestController
public class MovieConsumerController {
	
	
	@Autowired
	MovieServiceProxy movieServiceProxy;

///////////////////////////// ADMIN ////////////////////////////////////////////////////////////////	
	

	@GetMapping("/admin")
	public List<Admin> getAllAdmin(Admin admin){
		
		return movieServiceProxy.getAllAdmin();
			
	}
	
	@GetMapping("/adminbyid/{id}")
	public Admin getAdminById(@PathVariable("id") int id ) {
		
		 Admin admin = movieServiceProxy.getAdminById(id);
		return admin;
	}
	
	
	
////////////////////////////////// USERS //////////////////////////////////////////////////////////////
	
	@GetMapping("/user")
	public List<User> getAllUsers(User user){
		
		return movieServiceProxy.getAllUsers();
			
	}
	
	@GetMapping("/userbyid/{id}")
	public User getUserById(@PathVariable("id") int id ) {
		
		 User user = movieServiceProxy.getUserById(id);
		return user;
	}
	
	
	//////////////////////////////// MOVIES ///////////////////////////////////////////

	
	
	@GetMapping("/movies")
	public List<Movies> getAllMovies(Movies movies){
		
		return movieServiceProxy.getAllMovies();
		
		
	}
	
	@GetMapping("/moviebyid/{id}")
	public Movies getMovieById(@PathVariable("id") int id ) {
		
		Movies movies= movieServiceProxy.getMovieById(id);
		return movies;
	}
	
//////////////////////////////// MOVIE BOOKINGS  //////////////////////////////////////////////////
	
	@GetMapping("/bookings")
	public List<BookingDetails> getAllBookings(BookingDetails bookings){
		
		return movieServiceProxy.getAllBookings();		
		
	}
	
	@GetMapping("/bookingsbyid/{id}")
	public BookingDetails getBookingsById(@PathVariable("id") int id ) {
		
		BookingDetails bookings = movieServiceProxy.getBookingsById(id);
		return bookings;
	}
	
////////////////////////////////// SHOW TIMINGS ///////////////////////////////////////////////////////
	
	
	
	@GetMapping("/shows")
	public List<ShowTimings> getAllShows(ShowTimings show){
		
		return movieServiceProxy.getAllShows();		
		
	}
	
	@GetMapping("/showsbyid/{id}")
	public ShowTimings getShowsById(@PathVariable("id") int id ) {
		
		ShowTimings show = movieServiceProxy.getShowsById(id);
		return show;
	}

	
	
/////////////////////////////////// SEATS //////////////////////////////////////////////////////////
	
	@GetMapping("/seat")
	public List<Seat> getAllSeat(Seat seat){
		
		return movieServiceProxy.getAllSeats();	
		
	}
	
	@GetMapping("/seatbyid/{id}")
	public Seat getSeatById(@PathVariable("id") int id ) {
		
		Seat seat = movieServiceProxy.getSeatById(id);
		return seat;
	}
	
//////////////////////////////////// PAYMENT ?????????????????????????????????????????????????????????
	
	@GetMapping("/payment")
	public List<Payment> getAllPayments(Payment payment){
		
		return movieServiceProxy.getAllPayments();
		
	}
	
	@GetMapping("/paymentbyid/{id}")
	public Payment getPaymentById(@PathVariable("id") int id ) {
		
		Payment payment = movieServiceProxy.getPaymentById(id);
		return payment;
	}
	
	
}
