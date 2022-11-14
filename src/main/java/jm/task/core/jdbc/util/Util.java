package jm.task.core.jdbc.util;

import com.mysql.cj.xdevapi.SessionFactory;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Ilas24ilas12";

    private static SessionFactory sessionFactory = null;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_Driver);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Everything is Okay");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Out of connection");
        }
        return connection;
    }
}
