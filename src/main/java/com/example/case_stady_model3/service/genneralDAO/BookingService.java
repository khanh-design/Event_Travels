package com.example.case_stady_model3.service.genneralDAO;

import com.example.case_stady_model3.model.Booking;
import com.example.case_stady_model3.model.BookingDetail;
import com.example.case_stady_model3.model.Tours;
import com.example.case_stady_model3.model.Users;

public interface BookingService {
    void addBooking(Users user, Tours tour, String ticketType, int places);
    BookingDetail getBookingDetail(String bookingCode);
    Booking getBookingByCode(String bookingCode);
}
