package com.example.case_stady_model3.controller;

import com.example.case_stady_model3.model.Tours;
import com.example.case_stady_model3.model.Users;
import com.example.case_stady_model3.service.bookingServiceDAO;
import com.example.case_stady_model3.service.tourServiceDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "eventServlet", urlPatterns = "/events")
public class eventServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private tourServiceDAO eventServiceImpls;
    private bookingServiceDAO bookingServiceImpls;

    public void init() {
        eventServiceImpls = new tourServiceDAO();
        bookingServiceImpls = new bookingServiceDAO();
        System.out.println("Servlet initialized");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "Register":
                showFormBooking(request, response);
                break;
            case "Payment":
                showFormPayment(request, response);
                break;
            default:
                showlistTour(request, response);
                break;
        }
    }

    private void showFormPayment(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String code = request.getParameter("code");
        bookingServiceImpls.getBookingDetail(code);
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/payment.jsp");
        try {
            request.setAttribute("code", code);
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    private void showFormBooking(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/register.jsp");
        try {
            request.getParameter("id");
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("id_tour", id);
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    private void showlistTour(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        List<Tours> tours = eventServiceImpls.findAllWithStoredProcedure();
        int id = Integer.parseInt(request.getParameter("id"));
        List<Tours> tours = eventServiceImpls.findAll(id);
        request.setAttribute("ListTour", tours);
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Register":
                FormBooking(request, response);
                break;
            case "Payment":
//                FormBookDetail(request, response);
                break;
            default:
                break;
        }
    }

//    private void FormBookDetail(HttpServletRequest request, HttpServletResponse response) {
//        Re
//    }


    private void FormBooking(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String ticketType = request.getParameter("ticketType");
        String tourId = request.getParameter("id_tour");
        int places = Integer.parseInt(request.getParameter("places"));

        Users user = new Users(name, email, phone);
        Tours tour = new Tours(Integer.parseInt(tourId), places);

        bookingServiceImpls.addBooking(user, tour, ticketType, places);
    }

}
