package com.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cinema.domain.ShowTimings;
import com.cinema.repository.ShowTimingsRepository;


@Service("showTimingsService")
@Scope("singleton")
public class ShowTimingsService implements IShowTimingsService{

	@Autowired
	@Qualifier("showTimingsRepository")
	private ShowTimingsRepository showTimingsRepository;
	
	@Override
	public ShowTimings save(ShowTimings showTimings) {
		return showTimingsRepository.save(showTimings);
	}

	@Override
	public ShowTimings update(ShowTimings showTimings) {
		return showTimingsRepository.save(showTimings);
	}

	@Override
	public void delete(Integer id) {
		showTimingsRepository.deleteById(id);
		
	}

	@Override
	public List<ShowTimings> getAllShowTimings() {
		return showTimingsRepository.findAll();
	}

	@Override
	public ShowTimings getShowTimingsById(Integer id) {
		return showTimingsRepository.findById(id).get();
	}

	@Override
	public List<ShowTimings> getAllShowTimingsByTime(String time) {
		
		return showTimingsRepository.findByTimeLike(time);
	}

	@Override
	public List<ShowTimings> getAllShowTimingsByMoviename(String movie_name) {
		return showTimingsRepository.findByMovienameLike(movie_name);
	}

}
