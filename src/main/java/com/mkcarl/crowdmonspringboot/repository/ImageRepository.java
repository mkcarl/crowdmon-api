package com.mkcarl.crowdmonspringboot.repository;

import com.mkcarl.crowdmonspringboot.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
