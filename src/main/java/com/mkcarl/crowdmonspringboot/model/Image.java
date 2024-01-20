package com.mkcarl.crowdmonspringboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "image_name")
    private String image_name;

    @Column(name = "cloudflare_url")
    private String cloudflare_url;

    @Column(name = "width")
    private int width;

    @Column(name = "height")
    private int height;

    @Column(name = "timestamp_added")
    private long timestamp_added;

    @Column(name = "image_source")
    private ImageSource image_source;

    public Long getId() {
        return id;
    }

    public String getCloudflare_url() {
        return cloudflare_url;
    }

    public void setCloudflare_url(String cloudflare_url) {
        this.cloudflare_url = cloudflare_url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getTimestamp_added() {
        return timestamp_added;
    }

    public void setTimestamp_added(long timestamp_added) {
        this.timestamp_added = timestamp_added;
    }

    public ImageSource getImage_source() {
        return image_source;
    }

    public void setImage_source(ImageSource image_source) {
        this.image_source = image_source;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }
}
