package com.aditya.movie.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shows")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showId;

    private Time time;
    private Date date;

    @ManyToOne
    @JoinColumn
    private MovieEntity movie;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<SeatEntity> showSeatList = new ArrayList<>();

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<TicketEntity> ticketList = new ArrayList<>();
}
