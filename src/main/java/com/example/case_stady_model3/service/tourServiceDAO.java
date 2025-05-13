package com.example.case_stady_model3.service;

import com.example.case_stady_model3.model.Tours;
import com.example.case_stady_model3.service.genneralDAO.TourService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class tourServiceDAO implements TourService<Tours> {
//    private static final String SELECT_ALL_TOUR = "{CALL sp_select_tour()}";
    private static final String SELECT_TOUR_BY_ID = "{CALL sp_select_tour_by_id(?)}";

//    @Override
//    public List<Tours> findAllWithStoredProcedure() {
//        List<Tours> toursList = new ArrayList<>();
//        try (Connection connection = DBConnection.getConnection();
//            CallableStatement callableStatement = connection.prepareCall(SELECT_ALL_TOUR)) {
//            ResultSet rs = callableStatement.executeQuery();
//            while (rs.next()) {
//                int id = rs.getInt("Id_tour");
//                String name = rs.getString("name_tour");
//                String description = rs.getString("description");
//                String address = rs.getString("address");
//                String date_start = rs.getString("date_start");
//                String date_end = rs.getString("date_end");
//                String price = rs.getString("price_Tickets");
//                int places = rs.getInt("Places");
//                String Images = rs.getString("Images");
//                Tours tours = new Tours(id, name, description, address, date_start, date_end, price, places, Images);
//                toursList.add(tours);
//            }
//        } catch (SQLException e) {
//            DBConnection.printSQLException(e);
//        }
//        return toursList;
//    }

    @Override
    public List<Tours> findAll(int id) {
        List<Tours> toursList = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             CallableStatement callableStatement = connection.prepareCall(SELECT_TOUR_BY_ID)) {
             callableStatement.setInt(1, id);
             ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name_tour");
                String description = rs.getString("description");
                String address = rs.getString("address");
                String date_start = rs.getString("date_start");
                String date_end = rs.getString("date_end");
                String price = rs.getString("price_Tickets");
                int places = rs.getInt("Places");
                String Images = rs.getString("Images");
                Tours tours = new Tours(id, name, description, address, date_start, date_end, price, places, Images);
                toursList.add(tours);
            }
        } catch (SQLException e) {
            DBConnection.printSQLException(e);
        }
        return toursList;
    }

}
