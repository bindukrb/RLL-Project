package com.cinema.controller;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.entity.Movies;
import com.cinema.service.IMoviesService;


@RestController
@Scope("request")
public class MoviesController {
	
	@Autowired
	@Qualifier("moviesService")
	private IMoviesService moviesService;
	
	@GetMapping(value="/movies", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Movies> getAllMovies(){
		
		return moviesService.getAllMovies();		
	}

	
	@PostMapping(value="/movies", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.CREATED)
	public Movies insertMovie(@RequestBody Movies movie) {
		
		return moviesService.save(movie);
	}
	
	
	@PutMapping(value="/movies", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.OK)
	public Movies updateMovie(@RequestBody Movies movie) {
		
		return moviesService.update(movie); 
	}
	
	
	@DeleteMapping(value = "/movies/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteMovie(@PathVariable int id ) {
	
		moviesService.delete(id);
	}
	
	
	@GetMapping(value="/moviebyid/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Movies getmovieById(@PathVariable int id) {
		return moviesService.getMoviesById(id);
	}
	
	
	@GetMapping(value="/moviebytitle/{title}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Movies> getMoviesByTitle(@PathVariable String title){
		
		return moviesService.getAllMoviesByTitle(title);
	}
	
	
	@GetMapping(value="/moviebygenre/{genre}", produces ={MediaType.APPLICATION_JSON_VALUE})
	public List<Movies> getMoviesByGenre(@PathVariable String genre){
		
		return moviesService.getAllMoviesByGenre(genre);
	}
	
	
	@GetMapping(value="/moviebylanguage/{language}", produces ={MediaType.APPLICATION_JSON_VALUE})
	public List<Movies> getMoviesByLanguage(@PathVariable String language){
		
		return moviesService.getAllMoviesByLanguage(language);
	}
	
}
