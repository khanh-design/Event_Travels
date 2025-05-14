package com.example.case_stady_model3.model;

import java.util.Date;

public class Booking {
    private int id;
    private String ticketType;
    private String state;
    private Date dateBook;
    private Users user;
    private Tours tour;
    private String code;

    public Booking(int id, String ticketType, String state, Date dateBook, Users user, Tours tour, String code) {
        this.id = id;
        this.ticketType = ticketType;
        this.state = state;
        this.dateBook = dateBook;
        this.user = user;
        this.tour = tour;
        this.code = code;
    }

    public Booking () {

    }

    public Booking (int id, String ticketType, String state, Date dateBook, Users user, Tours tour) {
        this.id = id;
        this.ticketType = ticketType;
        this.state = state;
        this.dateBook = dateBook;
        this.user = user;
        this.tour = tour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDateBook() {
        return dateBook;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDateBook(Date dateBook) {
        this.dateBook = dateBook;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Tours getTour() {
        return tour;
    }

    public void setTour(Tours tour) {
        this.tour = tour;
    }
}
