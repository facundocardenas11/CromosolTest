package com.cromosol.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "ACTOR")
public class Actor {
	
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;

	@Getter
	@Setter
	@Column(name = "NAME")
	private String name;
	
	@Getter
	@Setter
	@Column(name = "LAST_NAME")
	private String last_name;

	
	
	@ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)  
	@JoinColumn(name= "MOVIE_ID", nullable= false)
	
	private Movie movie;



	public Movie getMovie() {
		return movie;
	}



	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
