package com.cromosol.app.services;

import java.util.List;
import java.util.Optional;

import com.cromosol.app.entities.Actor;
import com.cromosol.app.entities.Movie;

public interface MovieService {
		
	Optional<Movie> findById(Long id);
		
	List<Movie> findMovies();

	public String createMovie(Long id, 
			 String name,
			 String manager,
			 List<Actor> actors);
 
}
