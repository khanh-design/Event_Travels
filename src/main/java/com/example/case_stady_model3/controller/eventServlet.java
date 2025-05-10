package com.example.case_stady_model3.controller;

import com.example.case_stady_model3.model.Tours;
import com.example.case_stady_model3.service.eventServiceDAO;

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
    private eventServiceDAO eventServiceImpls;

    public void init() {
        eventServiceImpls = new eventServiceDAO();
        System.out.println("Servlet initialized");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "Register":
//                showFormBooking(request, response);
                break;
            default:
                showlistTour(request, response);
                break;
        }
    }

    private void showlistTour(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Tours> tours = eventServiceImpls.findAll();
        request.setAttribute("ListTour", tours);
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

//    private void showFormBooking(HttpServletRequest request, HttpServletResponse response) {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("views/register.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException | IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
