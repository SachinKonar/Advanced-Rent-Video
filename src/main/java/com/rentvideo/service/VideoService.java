package com.rentvideo.service;

import java.util.List;

import com.rentvideo.model.Video;

public class VideoService {
    private String videoTitle;
    private String videoDirector;
    private String videoGenre;
    private int videoLength;

    
    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoDirector() {
        return videoDirector;
    }

    public String getVideoGenre() {
        return videoGenre;
    }

    public int getVideoLength() {
        return videoLength;
    }

    
    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public void setVideoDirector(String videoDirector) {
        this.videoDirector = videoDirector;
    }

    public void setVideoGenre(String videoGenre) {
        this.videoGenre = videoGenre;
    }

    public void setVideoLength(int videoLength) {
        this.videoLength = videoLength;
    }

    public List<Video> getAllAvailableVideos() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAllAvailableVideos'");
    }

    public void addVideo(Video newVideo) {
        
        throw new UnsupportedOperationException("Unimplemented method 'addVideo'");
    }
}