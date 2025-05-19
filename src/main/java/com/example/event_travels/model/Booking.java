package com.example.event_travels.model;

public class Booking {
    private int Id_booking;
    private String date;
    private String tickets;
    private String status;
    private int Id_user;
    private int Id_tour;

    public Booking() {

    }

    public Booking(int id_booking, String date, String tickets, String status, int id_user, int id_tour) {
        Id_booking = id_booking;
        this.date = date;
        this.tickets = tickets;
        this.status = status;
        Id_user = id_user;
        Id_tour = id_tour;
    }

    public int getId_booking() {
        return Id_booking;
    }

    public void setId_booking(int id_booking) {
        Id_booking = id_booking;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_user() {
        return Id_user;
    }

    public void setId_user(int id_user) {
        Id_user = id_user;
    }

    public int getId_tour() {
        return Id_tour;
    }

    public void setId_tour(int id_tour) {
        Id_tour = id_tour;
    }
}
