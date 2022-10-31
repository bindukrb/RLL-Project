package com.cinema.entity;

public class ShowTimings {
	
	
	private Integer id;
	
	private String time;
	
	private String moviename;
	
	
	public ShowTimings() {}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public ShowTimings(Integer id, String time, String moviename) {
		super();
		this.id = id;
		this.time = time;
		this.moviename = moviename;
	}
	
	@Override
	public String toString() {
		return "ShowTimings [id=" + id + ", time=" + time + ", movie_name=" + moviename + "]";
	}

}
