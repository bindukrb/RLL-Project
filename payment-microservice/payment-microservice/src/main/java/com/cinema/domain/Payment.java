package com.cinema.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_info")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="PAY_ID")
	private Integer payment_id;
	
	@Column(name="PAY_DATE")
	private String date;
	
	@Column(name="PAY_TIME")
	private String time;
	
	@Column(name="PAY_AMT")
	private String amount;
	
	@Column(name="Booking_Id")
	
    private Integer booking_id;

	public Payment(Integer payment_id, String date, String time, String amount, Integer booking_id) {
		super();
		this.payment_id = payment_id;
		this.date = date;
		this.time = time;
		this.amount = amount;
		this.booking_id = booking_id;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", date=" + date + ", time=" + time + ", amount=" + amount
				+ ", booking_id=" + booking_id + "]";
	}

	public Integer getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Integer payment_id) {
		this.payment_id = payment_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Integer getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}

	public Payment() {
		super();
		
	}

}