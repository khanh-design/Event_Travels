package com.example.event_travels.model;

public class Payment {
    private int Id_payment;
    private double amount;
    private String status;
    private String date;
    private String hinh_thuc;
    private int Id_booking;

    public Payment() {

    }
    public Payment(int id_payment, double amount, String status, String date, String hinh_thuc, int id_booking) {
        Id_payment = id_payment;
        this.amount = amount;
        this.status = status;
        this.date = date;
        this.hinh_thuc = hinh_thuc;
        Id_booking = id_booking;
    }

    public int getId_payment() {
        return Id_payment;
    }

    public void setId_payment(int id_payment) {
        Id_payment = id_payment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHinh_thuc() {
        return hinh_thuc;
    }

    public void setHinh_thuc(String hinh_thuc) {
        this.hinh_thuc = hinh_thuc;
    }

    public int getId_booking() {
        return Id_booking;
    }

    public void setId_booking(int id_booking) {
        Id_booking = id_booking;
    }
}
