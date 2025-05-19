package com.example.event_travels.service.GenneralDAO;

public interface userService <E>{
    E checkLogin(String email, String password);
    boolean register(E user);
}
