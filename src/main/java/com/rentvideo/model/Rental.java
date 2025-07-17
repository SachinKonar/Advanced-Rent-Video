package com.rentvideo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Video video;

    private LocalDateTime rentedAt;
    private boolean returned = false;

    // Getters and setters
}
