package com.example.httprequest;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int albumId,id;
    private String title;
    private String thumbnailUrl;
    private String url;

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }


    public String getUrl() {
        return url;
    }


    public int getAlbumId() {
        return albumId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
