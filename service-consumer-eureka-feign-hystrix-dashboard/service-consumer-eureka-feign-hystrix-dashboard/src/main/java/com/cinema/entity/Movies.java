package com.cinema.entity;


public class Movies {
	
	
	private Integer id;
	
	
	private String title;
	
	
	private String genre;
	
		
	private String language;
	
	public Movies()
	{
		super();
	}


	public Movies(Integer id, String title, String genre, String language) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.language = language;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Movies [id=" + id + ", title=" + title + ", genre=" + genre + ", language=" + language + "]";
	}
	
	
	

}
