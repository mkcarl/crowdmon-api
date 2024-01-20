package com.mkcarl.crowdmonspringboot.service;

import com.mkcarl.crowdmonspringboot.model.Image;
import com.mkcarl.crowdmonspringboot.model.ImageSource;
import com.mkcarl.crowdmonspringboot.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public Image newDummyImage() {
        Image newImage = new Image();
        newImage.setImage_source(ImageSource.USER_UPLOAD);
        newImage.setHeight(320);
        newImage.setWidth(720);
        newImage.setCloudflare_url("");
        newImage.setTimestamp_added(0);
        return imageRepository.save(newImage);
    }

    public long getTotalImageCount(){
        return imageRepository.count();
    }
}
