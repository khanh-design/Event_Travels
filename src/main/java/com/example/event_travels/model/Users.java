package com.example.event_travels.model;

public class Users {
    private int Id_user;
    private String username;
    private String phone;
    private String password;
    private String email;

    public Users() {

    }

    public Users(String username, String phone, String password, String email) {
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.email = email;
    }

    public Users(int id_user, String username, String phone ,String password, String email) {
        Id_user = id_user;
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.email = email;
    }

    public int getId_user() {
        return Id_user;
    }

    public void setId_user(int id_user) {
        Id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
