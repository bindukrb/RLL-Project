package com.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


import com.cinema.domain.ShowTimings;
import com.cinema.service.IShowTimingsService;


@RestController
@Scope("request")
public class ShowTimingsController {

	@Autowired
	@Qualifier("showTimingsService")
	private IShowTimingsService showTimingsService;
	
	
	@PostMapping(value="/saveShowTimings",produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.CREATED)
	public ShowTimings saveShowTimings(@RequestBody ShowTimings showTimings) {
		return showTimingsService.save(showTimings);
	}
	
	@GetMapping(value="/getAllShowTimings",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<ShowTimings> getAllShowTimings(){
		return showTimingsService.getAllShowTimings();
	}
	
	@GetMapping(value="/getShowTimingsById/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ShowTimings getShowTimingsById(@PathVariable Integer id) {
		return showTimingsService.getShowTimingsById(id);
	}
	
	@GetMapping(value="/getAllShowTimingsByTime/{time}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<ShowTimings> getAllShowTimingsByTime(@PathVariable String time){
		return showTimingsService.getAllShowTimingsByTime(time);
	}
	@GetMapping(value="/getAllShowTimingsByMovie_Name/{movie_name}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<ShowTimings> getAllShowTimingsByMovie_name(@PathVariable String movie_name){
		return showTimingsService.getAllShowTimingsByMoviename(movie_name);
	}
	
	@DeleteMapping(value="/deleteById/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteById(Integer id) {
		showTimingsService.delete(id);
	}
	
	@PutMapping(value="/updatePayment" ,produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.OK)
	public ShowTimings updatePayment(ShowTimings showTimings) {
		return showTimingsService.update(showTimings);
	}
	
	
}
