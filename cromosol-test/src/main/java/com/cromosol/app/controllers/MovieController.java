package com.cromosol.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cromosol.app.entities.Movie;
import com.cromosol.app.repository.MovieRepository;
import com.cromosol.app.services.MovieService;

@RestController
@RequestMapping(path = "/movie")
public class MovieController {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/all")
	public List<Movie> listar(){
		return movieRepository.findAll();
	}
	
	@GetMapping("/{id}")
	Optional<Movie> findById(@PathVariable Long id){
		return movieRepository.findById(id);
	}
	@GetMapping("findByName/{name}")
	Movie findById(@PathVariable String name){
		return movieRepository.findByName(name);
	}
	
	@PostMapping("createMovie")
	public void createSucursal(@RequestBody Movie s) {
		movieService.createMovie(s.getId(), s.getName(), s.getManager(), s.getActors());
	}
	
	@DeleteMapping("/deleteMovieById/{id}")
	public void deleteMovieById(Long id){
		 movieRepository.deleteById(id);
	}	

	@PutMapping("/updateMovie")
	public @ResponseBody String updateMovie(@RequestBody Movie m) {
		return "Se actualizo la Pelicula correctamente";
	}
}