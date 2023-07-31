package com.movies.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.api.models.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
	Actor findById(int actorId);
}
