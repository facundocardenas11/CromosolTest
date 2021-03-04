package com.cromosol.app.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "MOVIE")
public class Movie {
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;

	@Getter
	@Setter
	@Column(name = "NAME")
	private String name;

	@Getter
	@Setter
	@Column(name =  "PREMIERE_DATE")
	private Date premieremDate;

	@Getter
	@Setter
	@Column(name =  "MANAGER")
	private String manager;

	
	@OneToMany(cascade = CascadeType.ALL, fetch =  FetchType.LAZY, mappedBy = "movie")
	@Getter
	@Setter
	private List<Actor> actors;
	 
		
}
