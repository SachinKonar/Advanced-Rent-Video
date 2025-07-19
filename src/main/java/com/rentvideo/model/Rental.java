package com.rentvideo.model;

import java.time.LocalDateTime;

public class Rental {
    private Long id;
    private User user;
    private Video video;
    private LocalDateTime rentedAt;
    private boolean returned = false;

    
    public Rental() {}

    public Rental(Long id, User user, Video video, LocalDateTime rentedAt, boolean returned) {
        this.id = id;
        this.user = user;
        this.video = video;
        this.rentedAt = rentedAt;
        this.returned = returned;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public LocalDateTime getRentedAt() {
        return rentedAt;
    }

    public void setRentedAt(LocalDateTime rentedAt) {
        this.rentedAt = rentedAt;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
}
