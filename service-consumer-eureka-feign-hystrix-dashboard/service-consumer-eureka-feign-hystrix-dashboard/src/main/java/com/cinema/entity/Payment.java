package com.cinema.entity;

public class Payment {
	
	private Integer id;
	
	
	private String date;
	
	
	private String time;
	
	
	private String amount;
	
	public Payment() {}
	public Payment(Integer id, String date, String time, String amount) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.amount = amount;
	}
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Payment [id=" + id + ", date=" + date + ", time=" + time + ", amount=" + amount + "]";
	}

}
