package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DbAccess {
    
    private final String URL = "jdbc:mysql://localhost:3306/smartclean";
    private final String USER = "root";
    private final String PASSWORD = "";

    Connection conn ; 

    public DbAccess(){
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connected to database!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return conn;
    }

    public void createCustomer(Customer newClient){
        //SQL statement 
        String sql = "INSERT INTO customers (first_name, last_name, phone_number, email, address) VALUES (?,?,?,?,?);";
        
        //Preparing a prepared statement object to then execute (adds a row with the given info)
        //Uses a Customer object as input and get Info from the Customer methods
        try (PreparedStatement psmt = conn.prepareStatement(sql)){
            psmt.setString(1,newClient.getFirstName());
            psmt.setString(2,newClient.getLastName());
            psmt.setString(3,newClient.getPhoneNumber());
            psmt.setString(4,newClient.getEmail());
            psmt.setString(5,newClient.getAddress());
            int rowsInserted = psmt.executeUpdate();
            System.out.println("New Client has been added to the Database.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
   
}