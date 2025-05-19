package com.example.event_travels.model;

public class Tour {
    private int Id_tour;
    private String name_tour;
    private String description;
    private String date_start;
    private String date_end;
    private double price_tickets;
    private String image;
    private int Places;

    public Tour() {

    }

    public Tour(int Id_tour, String name_tour, String date_start, double price_tickets, String image, int Places) {
        this.Id_tour = Id_tour;
        this.name_tour = name_tour;
        this.date_start = date_start;
        this.price_tickets = price_tickets;
        this.image = image;
        this.Places = Places;
    }

    public Tour(int id_tour, String name_tour, String description, String date_start, String date_end, double price_tickets, String image, int places) {
        Id_tour = id_tour;
        this.name_tour = name_tour;
        this.description = description;
        this.date_start = date_start;
        this.date_end = date_end;
        this.price_tickets = price_tickets;
        this.image = image;
        Places = places;
    }

    public int getId_tour() {
        return Id_tour;
    }

    public void setId_tour(int id_tour) {
        Id_tour = id_tour;
    }

    public String getName_tour() {
        return name_tour;
    }

    public void setName_tour(String name_tour) {
        this.name_tour = name_tour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public double getPrice_tickets() {
        return price_tickets;
    }

    public void setPrice_tickets(double price_tickets) {
        this.price_tickets = price_tickets;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPlaces() {
        return Places;
    }

    public void setPlaces(int places) {
        Places = places;
    }
}
