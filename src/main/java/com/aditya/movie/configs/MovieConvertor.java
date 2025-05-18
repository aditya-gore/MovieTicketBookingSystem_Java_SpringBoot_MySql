package com.aditya.movie.configs;

import com.aditya.movie.dto.MovieDTO;
import com.aditya.movie.entities.MovieEntity;

public class MovieConvertor {
    public static MovieEntity movieDTOToMovieEntity(MovieDTO movieDTO) {
        MovieEntity movie = MovieEntity.builder()
                .name(movieDTO.getName())
                .duration(movieDTO.getDuration())
                .genre(movieDTO.getGenre())
                .language(movieDTO.getLanguage())
                .releaseDate(movieDTO.getReleaseDate())
                .rating(movieDTO.getRating())
                .build();
        return movie;
    }
}
