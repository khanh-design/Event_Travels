package com.example.case_stady_model3.service;

import com.example.case_stady_model3.model.BookingDetail;
import com.example.case_stady_model3.model.Tours;
import com.example.case_stady_model3.model.Users;
import com.example.case_stady_model3.service.genneralDAO.BookingService;

import java.sql.*;

public class bookingServiceDAO implements BookingService {
    String GET_BOOKING_DETAIL = "{CALL sp_get_booking_detail(?)}";
    @Override
    public void addBooking(Users user, Tours tour, String ticketType, int places) {
        String sql = "{CALL sp_insert_booking(?, ?, ?, ?, ?, ?)}";

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

    @Override
    public BookingDetail getBookingDetail(String bookingCode) {
        BookingDetail detail = null;
        try {
            Connection conn = DBConnection.getConnection();
            CallableStatement callableStatement = conn.prepareCall(GET_BOOKING_DETAIL);
            callableStatement.setString(1, bookingCode);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                detail = new BookingDetail();
                detail.setBookingId(rs.getInt("Id_booking"));
                detail.setDateBook(rs.getDate("date_book"));
                detail.setTickets(rs.getString("Tickets"));
                detail.setState(rs.getString("State"));
                detail.setTourId(rs.getInt("Id_tour"));
                detail.setTourName(rs.getString("Name_tour"));
                detail.setDescription(rs.getString("Description"));
                detail.setPrice(rs.getDouble("Price"));
                detail.setDateStart(rs.getDate("Date_start"));
                detail.setDateEnd(rs.getDate("Date_end"));
                detail.setCustomerName(rs.getString("customer_name"));
                detail.setEmail(rs.getString("email"));
                detail.setPhone(rs.getString("phone"));
            }
        } catch (SQLException e) {
            DBConnection.printSQLException(e);
        }
        return detail;
    }
}
