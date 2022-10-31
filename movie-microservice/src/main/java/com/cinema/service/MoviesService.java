package com.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cinema.entity.Movies;
import com.cinema.repository.MoviesRepository;


@Service("moviesService")
@Scope("singleton")
public class MoviesService implements IMoviesService{
	
	@Autowired
	@Qualifier("moviesRepository")
	private MoviesRepository moviesRepository;

	@Override
	public List<Movies> getAllMovies() {
		return moviesRepository.findAll();
	}

	@Override
	public Movies save(Movies movieDetails) {
		return moviesRepository.save(movieDetails);
	}

	@Override
	public Movies update(Movies movieDetails) {
		
		return moviesRepository.save(movieDetails);
	}

	@Override
	public void delete(int id) {
		
		moviesRepository.deleteById(id);
	}

	@Override
	public Movies getMoviesById(int id) {
		
		return moviesRepository.findById(id).get();
	}

	@Override
	public List<Movies> getAllMoviesByTitle(String title) {
		
		return moviesRepository.findByTitleLike(title);
	}

	@Override
	public List<Movies> getAllMoviesByGenre(String genre) {
		
		return moviesRepository.findByGenreLike(genre);
	}

	@Override
	public List<Movies> getAllMoviesByLanguage(String language) {
		
		return moviesRepository.findByLanguage(language);
	}

}
