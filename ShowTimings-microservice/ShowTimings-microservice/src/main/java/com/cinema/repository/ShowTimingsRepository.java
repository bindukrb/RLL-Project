package com.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.domain.ShowTimings;

@Repository("showTimingsRepository")
public interface ShowTimingsRepository extends JpaRepository<ShowTimings, Integer> {
	List<ShowTimings> findByIdLike(Integer id);
	List<ShowTimings> findByTimeLike(String time);
	List<ShowTimings> findByMovienameLike(String movie_name);
	
}
