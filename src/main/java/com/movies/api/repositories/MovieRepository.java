package com.movies.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.api.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	Movie findById(int movieId);
}
