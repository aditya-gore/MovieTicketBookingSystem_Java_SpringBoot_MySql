package com.aditya.movie.services;

import com.aditya.movie.configs.MovieConvertor;
import com.aditya.movie.dto.MovieDTO;
import com.aditya.movie.entities.MovieEntity;
import com.aditya.movie.exceptions.MovieAlreadyExists;
import com.aditya.movie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    public MovieRepository movieRepository;
    public String addMovie(MovieDTO movieDTO) {
        MovieEntity movieByName = movieRepository.findByName(movieDTO.getName());
        if(movieByName != null && movieByName.getLanguage().equals(movieDTO.getLanguage())) {
            throw new MovieAlreadyExists();
        }
        MovieEntity movie = MovieConvertor.movieDTOToMovieEntity(movieDTO);
        movieRepository.save(movie);
        return "Movie Added Successfully";
    }
}
