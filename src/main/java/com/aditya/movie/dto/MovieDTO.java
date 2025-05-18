package com.aditya.movie.dto;

import com.aditya.movie.enums.Genre;
import com.aditya.movie.enums.Language;
import lombok.Data;

import java.sql.Date;

@Data
public class MovieDTO {
    private String name;
    private Integer duration;
    private Double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}
