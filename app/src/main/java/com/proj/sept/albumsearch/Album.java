package com.proj.sept.albumsearch;




public class Album {
    private String name;
    private String artist;
    private String url;
    private String image;

    public Album() {
    }

    public Album(String name, String artist, String url, String image) {
        this.name = name;
        this.artist = artist;
        this.url = url;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}


