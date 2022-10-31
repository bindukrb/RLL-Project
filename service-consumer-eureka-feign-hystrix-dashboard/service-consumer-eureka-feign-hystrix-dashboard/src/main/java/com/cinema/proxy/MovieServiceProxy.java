package com.cinema.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cinema.entity.Admin;
import com.cinema.entity.BookingDetails;
import com.cinema.entity.Movies;
import com.cinema.entity.Payment;
import com.cinema.entity.Seat;
import com.cinema.entity.ShowTimings;
import com.cinema.entity.User;
import com.cinema.fallback.MovieServiceFallback;

@FeignClient( name="admin-service", fallback= MovieServiceFallback.class)
public interface MovieServiceProxy {
	
///////////////////////////////// ADMIN //////////////////////////////////////////////////////////	
	
	
	@GetMapping(value="/admin", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Admin> getAllAdmin();
	
	
	@GetMapping(value="/adminbyid/{id}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Admin getAdminById(@PathVariable("id") Integer id);
	
	
/////////////////////////////////////// USERS /////////////////////////////////////////////////////////	
	
	
	@GetMapping(value="/user", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<User> getAllUsers();
	
	
	@GetMapping(value="/userbyid/{id}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public User getUserById(@PathVariable("id") Integer id);
	
	
	
/////////////////////////////////// Movies /////////////////////////////////////////////////////////////
	
	@GetMapping(value="/movies", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Movies> getAllMovies();
	
	
	@GetMapping(value="/moviebyid/{id}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Movies getMovieById(@PathVariable("id") Integer id);
	
	
/////////////////////////////// MOVIE BOOKINGS /////////////////////////////////////////////////////////////
	
	
	@GetMapping(value="/bookings", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<BookingDetails> getAllBookings();
	
	
	@GetMapping(value="/bookingsbyid/{id}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public BookingDetails getBookingsById(@PathVariable("id") Integer id);
	
	
	
	
///////////////////////////// SHOW TIMINGS //////////////////////////////////////////////////////////////////
	
	
	
	@GetMapping(value="/shows", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<ShowTimings> getAllShows();
	
	
	@GetMapping(value="/showsbyid/{id}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ShowTimings getShowsById(@PathVariable("id") Integer id);
	
	
	
	
///////////////////////////// SEAT ////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value="/seat", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Seat> getAllSeats();
	
	
	@GetMapping(value="/seatbyid/{id}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Seat getSeatById(@PathVariable("id") Integer id);

	
////////////////////////////// PAYMENT DETAILS ?????????????????????????????????????????????????????????????????
	
	
	
	
	@GetMapping(value="/payment", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Payment> getAllPayments();
	
	
	@GetMapping(value="/paymentbyid/{id}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Payment getPaymentById(@PathVariable("id") Integer id);
	
	
	
	
}
