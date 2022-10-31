package com.cinema.service;

import java.util.List;

import com.cinema.entity.Movies;


public interface IMoviesService {
	
	List<Movies> getAllMovies();
	
	Movies save(Movies movieDetails );
	
	Movies update(Movies movieDetails);
	
	void delete(int id);
	
	Movies getMoviesById(int id);
	
	List<Movies> getAllMoviesByTitle(String title);
	
	List<Movies> getAllMoviesByGenre(String genre);
	
	List<Movies> getAllMoviesByLanguage(String language);

}
