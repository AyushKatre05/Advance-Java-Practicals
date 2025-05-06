package keyboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class key {
    
    // JDBC connection parameters
    private static final String BASE_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "Ak@#sql18";
    
    public static Connection getConnection(String database) {
        Connection conn = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            conn = DriverManager.getConnection(BASE_URL + database, USER, PASSWORD);
            System.out.println("Connected to the database: " + database);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void createDatabase(String dbName) {
        try (Connection connection = getConnection("")) {
            if (connection != null) {
                try (Statement stmt = connection.createStatement()) {
                    String sql = "CREATE DATABASE IF NOT EXISTS " + dbName;
                    stmt.executeUpdate(sql);
                    System.out.println("Database '" + dbName + "' created successfully (if not exists)." );
                }
            }
        } catch (SQLException e) {
            System.out.println("Failed to create database.");
            e.printStackTrace();
        }
    }
    
    public static void createTable(Connection connection, String tableName) {
        try (Statement stmt = connection.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (" +
                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
                         "name VARCHAR(255) NOT NULL, " +
                         "email VARCHAR(255) UNIQUE NOT NULL" +
                         ")";
            stmt.executeUpdate(sql);
            System.out.println("Table '" + tableName + "' created successfully (if not exists)." );
        } catch (SQLException e) {
            System.out.println("Failed to create table.");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        String dbName = "AK";
        String tableName = "users";
        
        // Create database
        createDatabase(dbName);
        
        // Connect to the newly created database
        Connection connection = getConnection(dbName);
        if (connection != null) {
            System.out.println("Connection is open, not closing it.");
            
            // Create table
            createTable(connection, tableName);
        }
    }
}
