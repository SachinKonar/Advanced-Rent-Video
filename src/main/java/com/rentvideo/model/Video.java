package com.rentvideo.model;

import jakarta.persistence.*;

@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String director;
    private String genre;
    private boolean available = true;

    // Getters and setters
}
