package com.aditya.movie.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.aditya.movie.enums.Genre;
import com.aditya.movie.enums.Language;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Movies")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private Integer duration;

    @Column(scale = 2)
    private Double rating;

    private Date releaseDate;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @Enumerated(value = EnumType.STRING)
    private Language language;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<ShowEntity> shows = new ArrayList<>();
}
