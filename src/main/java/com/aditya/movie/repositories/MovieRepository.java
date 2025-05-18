package com.aditya.movie.repositories;

import com.aditya.movie.dto.MovieDTO;
import com.aditya.movie.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    MovieEntity findByName(String name);
}
