package com.Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Booking.Domain.BookingDetails;
import com.Booking.Service.BookingService;
//import com.Booking.Service.IBookingService;




@RestController
@Scope("request")
public class BookingController {
	
	@Autowired
	@Qualifier("bookingService")
	private BookingService bookingService;
	
	@GetMapping(value="/bookings", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<BookingDetails> getAllBookingDetails(){
		
		return bookingService.getAllBookingDetails();		
	}
	@PostMapping(value="/bookings", produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code=HttpStatus.CREATED)
	public BookingDetails insertbookingDetails(@RequestBody BookingDetails bookingDetails) {
		return bookingService.save(bookingDetails);
	}
	
	@PutMapping(value="/bookings", produces = {MediaType.APPLICATION_JSON_VALUE})
	 @ResponseStatus(code=HttpStatus.OK)
	public BookingDetails updatebookingDetails(@RequestBody BookingDetails bookingDetails) {
		return bookingService.save(bookingDetails);
	}
	
	

	@DeleteMapping(value = "/bookings/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteBooking(@PathVariable int id ) {
	
		bookingService.delete(id);
	}
	@GetMapping(value="/bookingsbyid/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public BookingDetails getBookingDetailsById(@PathVariable int id) {
		return bookingService.getBookingDetailsById(id);
	}
	

	@GetMapping(value="/bookings/{movieName}", produces ={MediaType.APPLICATION_JSON_VALUE})
	public List<BookingDetails> getAllBookingDetailsByMovieName(@PathVariable String movieName){
		
		return bookingService.getAllBookingDetailsByMovieName(movieName);
	}
	

}
