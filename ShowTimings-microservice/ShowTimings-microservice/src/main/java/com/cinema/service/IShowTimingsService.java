package com.cinema.service;

import java.util.List;



import com.cinema.domain.ShowTimings;

public interface IShowTimingsService {
	ShowTimings save(ShowTimings showTimings);
	ShowTimings update(ShowTimings showTimings);
	void delete(Integer id);
	List<ShowTimings> getAllShowTimings();
	ShowTimings getShowTimingsById(Integer id);
	List<ShowTimings> getAllShowTimingsByTime(String time);
	List<ShowTimings> getAllShowTimingsByMoviename(String movie_name);
}
	
