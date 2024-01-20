package com.mkcarl.crowdmonspringboot.controller;

import com.mkcarl.crowdmonspringboot.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
    @Autowired
    ImageService imageService;

    @GetMapping("/images/count")
    public long imagesCount() {
        return imageService.getTotalImageCount();
    }
}
