package com.example.case_stady_model3.service;

import com.example.case_stady_model3.model.Tours;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class eventServiceDAO implements eventService<Tours> {
    private static final String SELECT_ALL_TOUR = "{CALL sp_select_tour()}";
    @Override
    public List<Tours> findAll() {
        List<Tours> toursList = new ArrayList<>();
        try{
            Connection connection = DBConnection.getConnection();
            CallableStatement callableStatement = connection.prepareCall(SELECT_ALL_TOUR);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Id_tour");
                String name = rs.getString("name_tour");
                String description = rs.getString("description");
                String address = rs.getString("address");
                String date_start = rs.getString("date_start");
                String date_end = rs.getString("date_end");
                String price = rs.getString("price_Tickets");
                int places = rs.getInt("Places");
                Tours tours = new Tours(id, name, description, address, date_start, date_end, price, places);
                toursList.add(tours);
            }
        } catch (SQLException ex) {
            DBConnection.printSQLException(ex);
        }
        return toursList;
    }
}
