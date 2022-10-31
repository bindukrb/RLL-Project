package com.cinema.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="show_timing")
public class ShowTimings {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TIME_ID")
	private Integer id;
	@Column(name="TIME")
	private String time;
	@Column(name="MOVIE_NAME")
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
