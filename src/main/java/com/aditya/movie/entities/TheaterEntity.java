package com.aditya.movie.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Theaters")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<TheaterSeatEntity> theaterSeatList = new ArrayList<>();

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<ShowEntity> showList = new ArrayList<>();
}
