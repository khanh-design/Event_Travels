package com.example.event_travels.service;

import com.example.event_travels.model.Users;
import com.example.event_travels.service.GenneralDAO.userService;

import java.sql.*;

public class userDAO implements userService<Users> {
    private static final String LOGIN_USERS = "SELECT * FROM users WHERE email = ? AND password = ?";
    private static final String REGISTER_USERS = "CALL sp_insert_user(?,?,?,?)";
    @Override
    public Users checkLogin(String email, String password) {
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(LOGIN_USERS);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Users user = new Users();
                user.setUsername(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        } catch (SQLException ex) {
            DBConnection.printSQLException(ex);
        }
        return null;
    }

    @Override
    public boolean register(Users user) {
        try {
            Connection connection = DBConnection.getConnection();
            CallableStatement cs = connection.prepareCall(REGISTER_USERS);
            cs.setString(1, user.getUsername());
            cs.setString(2, user.getPhone());
            cs.setString(3, user.getEmail());
            cs.setString(4, user.getPassword());
            int rs = cs.executeUpdate();
            if (rs > 0) {
                System.out.println("Register successfully");
            } else {
                System.out.println("Register failed");
            }
        } catch (SQLException ex) {
            DBConnection.printSQLException(ex);
        }
        return false;
    }
}
