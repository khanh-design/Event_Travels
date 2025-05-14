package com.example.case_stady_model3.model;

import java.util.Date;

public class BookingDetail {
    private int bookingId;
    private Date dateBook;
    private String tickets;
    private String state;
    private int tourId;
    private String tourName;
    private String description;
    private double price;
    private Date dateStart;
    private Date dateEnd;
    private String customerName;
    private String email;
    private String phone;

    public BookingDetail() {

    }

    public BookingDetail(int bookingId, Date dateBook, String tickets, String state, int tourId, String tourName, String description, double price, Date dateStart, Date dateEnd, String customerName, String email, String phone) {
        this.bookingId = bookingId;
        this.dateBook = dateBook;
        this.tickets = tickets;
        this.state = state;
        this.tourId = tourId;
        this.tourName = tourName;
        this.description = description;
        this.price = price;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getDateBook() {
        return dateBook;
    }

    public void setDateBook(Date dateBook) {
        this.dateBook = dateBook;
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
