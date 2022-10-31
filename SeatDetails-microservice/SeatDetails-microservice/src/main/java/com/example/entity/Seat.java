package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SeatDetails")
public class Seat {

	@Id
	@Column(name="Seat_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="Seat_Number")
	private String Seat_Number;
	
	@Column(name="Seat_Booked_Time")
	private String time;
	
	@Column(name="Seat_Status")
	private String status;

	public Seat(int id, String seat_Number, String time, String status) {
		super();
		this.id = id;
		Seat_Number = seat_Number;
		this.time = time;
		this.status = status;
	}

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeat_Number() {
		return Seat_Number;
	}

	public void setSeat_Number(String seat_Number) {
		Seat_Number = seat_Number;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Seat [id=" + id + ", Seat_Number=" + Seat_Number + ", time=" + time + ", status=" + status + "]";
	}

	
	
}
