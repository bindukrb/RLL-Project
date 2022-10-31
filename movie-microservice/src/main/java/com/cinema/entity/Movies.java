package com.cinema.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
	
	@Id
	@Column(name="movie_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer movie_id;
	
	
	@Column(name="movie_title")
	private String title;
	
	@Column(name="movie_genre")
	private String genre;
	
	
	@Column(name="movie_language")
	private String language;
	
	public Movies()
	{
		super();
	}

	public Integer getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Movies(Integer movie_id, String title, String genre, String language) {
		super();
		this.movie_id = movie_id;
		this.title = title;
		this.genre = genre;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Movies [movie_id=" + movie_id + ", title=" + title + ", genre=" + genre + ", language=" + language
				+ "]";
	}


	
	

}
