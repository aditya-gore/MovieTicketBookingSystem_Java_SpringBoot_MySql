package com.aditya.movie.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table(name = "Tickets")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketId;

    private Integer totalTicketsPrice;

    private String bookedSeats;

    @CreationTimestamp
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    @ManyToOne
    @JoinColumn
    private UserEntity user;
}
