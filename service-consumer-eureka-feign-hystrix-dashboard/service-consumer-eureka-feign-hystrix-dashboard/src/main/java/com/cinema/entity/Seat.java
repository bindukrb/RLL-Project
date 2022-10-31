package com.cinema.entity;

public class Seat {
	
	
    private int id;
	
	
	private String Seat_Number;
	
	
	private String time;
	
	
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
