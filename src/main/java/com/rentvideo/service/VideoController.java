package com.rentvideo.service;

import com.rentvideo.model.Video;
import com.rentvideo.service.VideoService;
import java.util.List;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    
    @GetMapping
    public List<Video> getAvailableVideos() {
        return videoService.getAllAvailableVideos();
    }

    
    @PostMapping
    public String addVideo(@RequestBody Video newVideo) {
        videoService.addVideo(newVideo);
        return "Video added successfully.";
    }
}
