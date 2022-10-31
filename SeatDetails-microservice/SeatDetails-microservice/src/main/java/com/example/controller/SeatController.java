package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Seat;

import com.example.service.ISeatService;

@RestController
@Scope("request")
public class SeatController {

	@Autowired
private ISeatService SeatService;
	
	@RequestMapping("/")
	public String dumyMethod() {
	return "Welcome to Movie world";
	}
	
	@GetMapping(value="/seat", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Seat> getAllSeat(){
	return SeatService.getAllSeats();
	}

	@PostMapping(value="/insertseat", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
			@ResponseStatus(code=HttpStatus.CREATED)
			public Seat insertProduct(@RequestBody Seat seat) {
			return SeatService.save(seat);
			}

    @PutMapping(value="/updateseat", produces = {MediaType.APPLICATION_JSON_VALUE})
   @ResponseStatus(code=HttpStatus.OK)
   public Seat updateAnySeat(@RequestBody Seat seat){
   return SeatService.update(seat);
    }
    
    @DeleteMapping(value="/deleteseat/{id}")
    @ResponseStatus(code=HttpStatus.NO_CONTENT)
    public  void deleteProductbyId(@PathVariable int id){
    	SeatService.delete(id);
    }
    
    @GetMapping(value="/seatbyid/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Seat getSeatById(@PathVariable int id){
	return SeatService.getSeatById(id);
	}

}


