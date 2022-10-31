package com.example.service;

import java.util.List;


import com.example.entity.Seat;


public interface ISeatService {

	Seat save(Seat seat);
	Seat update(Seat seat);
	void delete(int id);
	List<Seat> getAllSeats();
	Seat getSeatById(int id);

}
