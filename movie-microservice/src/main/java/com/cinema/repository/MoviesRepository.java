package com.cinema.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entity.Movies;



@Repository("moviesRepository")
@Scope("singleton")
public interface MoviesRepository extends JpaRepository<Movies, Integer>{
	
	
	List<Movies> findByTitleLike(String title);
	List<Movies> findByGenreLike(String genre);
	List<Movies> findByLanguage(String language);

}
