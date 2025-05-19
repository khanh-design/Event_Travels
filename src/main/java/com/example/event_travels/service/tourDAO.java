package com.example.event_travels.service;

import com.example.event_travels.model.Tour;
import com.example.event_travels.service.GenneralDAO.tourService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class tourDAO implements tourService<Tour> {
    private static final String GET_ALL_TOURS = "SELECT * FROM tour";
    @Override
    public List<Tour> getAllTours() {
        List<Tour> tours = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(GET_ALL_TOURS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Id_tour");
                String name = rs.getString("name_tour");
                String date = rs.getString("date_start");
                double price = rs.getDouble("price_Tickets");
                String image = rs.getString("Images");
                int places = rs.getInt("Places");
                tours.add(new Tour(id, name, date, price, image, places));
            }
        } catch (SQLException e) {
            DBConnection.printSQLException(e);
        }
        return tours;
    }
}
