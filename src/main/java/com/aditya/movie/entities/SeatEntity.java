package com.aditya.movie.entities;

import com.aditya.movie.enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Seats")
@Data
public class SeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Integer price;

    private Boolean isAvailable;

    private Boolean isFoodAvailable;

    @ManyToOne
    @JoinColumn
    private ShowEntity show;
}
