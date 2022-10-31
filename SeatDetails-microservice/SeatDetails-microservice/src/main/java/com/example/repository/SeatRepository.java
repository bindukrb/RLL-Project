package com.example.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Seat;

@Repository("seatRepository")
@Scope("singleton")
public interface SeatRepository extends JpaRepository<Seat, Integer>{

}
