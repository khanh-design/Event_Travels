package com.example.event_travels.controller;

import com.example.event_travels.model.Tour;
import com.example.event_travels.model.Users;
import com.example.event_travels.service.tourDAO;
import com.example.event_travels.service.userDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "/user-servlet", urlPatterns = "/Travels")
public class eventServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private userDAO userDAO;
    private tourDAO tourDAO;

    public void init() {
        userDAO = new userDAO();
        tourDAO = new tourDAO();
        System.out.println("Servlet userServlet initialized");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "login":
                showFromLogin(request, response);
                break;
            case "register":
                showFromRegister(request, response);
            default:
                showlistFrom(request, response);
                break;
        }
    }

    private void showFromRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/register.jsp");
        dispatcher.forward(request, response);
    }

    private void showFromLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.jsp");
        dispatcher.forward(request, response);
    }

    private void showlistFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Tour> Tours = tourDAO.getAllTours();
        request.setAttribute("listTour", Tours);
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/list.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "login":
                FormLogin(request, response);
                break;
            case "register":
                FormRegister(request, response);
            default:
                break;
        }
    }

    private void FormRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = request.getParameter("name");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            Users user = new Users(username, phone, password, email);
            boolean result = userDAO.register(user);
            if (result) {
                response.sendRedirect("views/login.jsp");
            } else {
                request.setAttribute("error", "Register failed");
                request.getRequestDispatcher("views/register.jsp").forward(request, response);
            }
    }

    private void FormLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Users user = userDAO.checkLogin(username, password);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            try {
                response.sendRedirect("/Travels");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            request.setAttribute("error", "Username or password is incorrect");
            request.getRequestDispatcher("view/login.jsp").forward(request, response);
        }
    }

    public void destroy() {
        userDAO = null;
        System.out.println("Servlet userServlet destroyed");
    }
}
