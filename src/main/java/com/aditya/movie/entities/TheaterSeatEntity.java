package com.aditya.movie.entities;

import com.aditya.movie.enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Theater_Seats")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheaterSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    @ManyToOne
    @JoinColumn(name = "ticketId")
    private TheaterEntity theater;
}
