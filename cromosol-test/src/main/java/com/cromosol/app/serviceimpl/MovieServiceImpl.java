package com.cromosol.app.serviceimpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cromosol.app.entities.Actor;
import com.cromosol.app.entities.Movie;
import com.cromosol.app.repository.MovieRepository;
import com.cromosol.app.services.MovieService;

import lombok.Getter;
import lombok.Setter;


@Service
public class MovieServiceImpl implements MovieService {
	
	@Getter
	@Setter
	@Autowired
	private MovieRepository movieRepository;
	
	public Optional<Movie> findById(Long id) {
		return movieRepository.findById(id);
	}

	public List<Movie> findMovies() {
		final List<Movie> listAll   = movieRepository.findAll();
        return listAll;
	}
	
	public String createMovie(Long id, String name, String manager, List<Actor> actors) {
		
		final Movie movie = new Movie();
		movie.setId(id);
		movie.setName(name);
		movie.setPremieremDate(new Date());
		movie.setActors(actors);

		try {
			movieRepository.save(movie);
		} catch (final Exception e) {
			
			System.out.print(e.getMessage());	
		}
		return "Se creo la Pelicula Correctamente";
	}
}