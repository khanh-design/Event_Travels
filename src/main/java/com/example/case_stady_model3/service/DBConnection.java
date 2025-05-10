package com.example.case_stady_model3.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/travels?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    protected static void printSQLException(SQLException e) {
        for (Throwable x : e) {
            if (x instanceof SQLException) {
                x.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) x).getSQLState());
                System.err.println("Error Code: " + ((SQLException) x).getErrorCode());
                System.err.println("Message: " + x.getMessage());
                Throwable t = x.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                }
            }
        }
    }
}
