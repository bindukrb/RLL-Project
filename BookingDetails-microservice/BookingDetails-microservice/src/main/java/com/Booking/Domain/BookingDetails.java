package com.Booking.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookingDetails")
public class BookingDetails {
	
	@Id
	@Column(name="Booking_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
 private Integer Id;
	
	@Column(name="Booking_Date")	
 private String Date;
	
	@Column(name="Booking_Venue")	
 private String Venue;
	
	@Column(name="Booking_SeatNo")
 private String SeatNo;
	
	@Column(name="movie_title")
 private String movieName;
	
	@Column(name="Ticket_Price")
	private int price;
	
	@Column(name="Movie_Time")
	private String time;
	
	
public BookingDetails(Integer id, String date, String venue, String seatNo, String movieName, int price,
			String time) {
		super();
		Id = id;
		Date = date;
		Venue = venue;
		SeatNo = seatNo;
		this.movieName = movieName;
		this.price = price;
		this.time = time;
	}


@Override
	public String toString() {
		return "BookingDetails [Id=" + Id + ", Date=" + Date + ", Venue=" + Venue + ", SeatNo=" + SeatNo
				+ ", movieName=" + movieName + ", price=" + price + ", time=" + time + "]";
	}


public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	public String getVenue() {
		return Venue;
	}


	public void setVenue(String venue) {
		Venue = venue;
	}


	public String getSeatNo() {
		return SeatNo;
	}


	public void setSeatNo(String seatNo) {
		SeatNo = seatNo;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


public BookingDetails() {
		
		super();
	}
}
