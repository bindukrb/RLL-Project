package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.entity.Seat;
import com.example.repository.SeatRepository;

@Service("seatService")
@Scope("singleton")
public class SeatService implements ISeatService{
	
	@Autowired
	@Qualifier("seatRepository")
	private SeatRepository seatRepository;


	@Override
	public Seat save(Seat seat) {
		return seatRepository.save(seat);
	}

	@Override
	public Seat update(Seat seat) {
		return seatRepository.save(seat) ;
	}

	@Override
	public void delete(int id) {
		seatRepository.deleteById(id);
		
	}

	@Override
	public List<Seat> getAllSeats() {
		
		return seatRepository.findAll();
	}

	@Override
	public Seat getSeatById(int id) {
		
		return seatRepository.findById(id).get();
	}

	

}
