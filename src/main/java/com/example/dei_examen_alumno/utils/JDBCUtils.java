package com.example.dei_examen_alumno.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    static private Connection con = null;

    static {
        String url = "jdbc:mysql://localhost:3306/die_examen_alumno";
        String user = "newuser";
        String password = "newuser";
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static Connection getConnection() {
        return con;
    }
}
