package com.cromosol.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cromosol.app.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	Optional<Movie> findById(Long id);

	@Query("SELECT m FROM Movie m WHERE m.name=:name")
	Movie findByName(@Param("name") String name);
	
	
}
