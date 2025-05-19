package com.example.event_travels.model;

public class Tickets {
    private int Id_ticket;
    private int code;
    private String type_tickets;
    private int Id_booking;

    public Tickets() {

    }

    public Tickets(int id_ticket, int code, String type_tickets, int id_booking) {
        Id_ticket = id_ticket;
        this.code = code;
        this.type_tickets = type_tickets;
        Id_booking = id_booking;
    }

    public int getId_ticket() {
        return Id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        Id_ticket = id_ticket;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType_tickets() {
        return type_tickets;
    }

    public void setType_tickets(String type_tickets) {
        this.type_tickets = type_tickets;
    }

    public int getId_booking() {
        return Id_booking;
    }

    public void setId_booking(int id_booking) {
        Id_booking = id_booking;
    }
}
