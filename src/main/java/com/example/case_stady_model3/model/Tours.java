package com.example.case_stady_model3.model;

public class Tours {
    private int id;
    private String name;
    private String description;
    private String address;
    private String date_start;
    private String date_end;
    private String price;
    private int places;
    private String Images;

    public Tours(int id, String name, String description, String address, String date_start, String date_end, String price, int places, String Images) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.date_start = date_start;
        this.date_end = date_end;
        this.price = price;
        this.places = places;
        this.Images = Images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public String getImages() {
        return Images;
    }

    public void setImages(String images) {
        Images = images;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }
}
