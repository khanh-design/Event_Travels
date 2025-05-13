package com.example.case_stady_model3.service;

import com.example.case_stady_model3.model.Tours;
import com.example.case_stady_model3.model.Users;
import com.example.case_stady_model3.service.genneralDAO.BookingService;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class bookingServiceDAO implements BookingService {
    @Override
    public void addBooking(Users user, Tours tour, String ticketType, int places) {
        String sql = "CALL sp_insert_booking(?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = DBConnection.getConnection();
            CallableStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getPhone());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, ticketType);
            stmt.setInt(5, tour.getId());
            stmt.setInt(6, places);
            stmt.executeUpdate();
        } catch (SQLException e) {
            DBConnection.printSQLException(e);
        }
    }
}
