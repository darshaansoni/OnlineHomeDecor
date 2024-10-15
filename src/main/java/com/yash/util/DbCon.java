package com.yash.util;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
	private static final String URL= "jdbc:mysql://localhost:3306/cart_module";
	   private static final String USER = "root";
	   private static final String PASSWORD = "Password@2024";
	  static{
		  try 
		 {
	  
           // Load the MySQL JDBC driver
           Class.forName("com.mysql.cj.jdbc.Driver");
       
		 } catch (ClassNotFoundException e) {
           e.printStackTrace();
		 }
	  }

    public static  Connection getConnection() throws SQLException {
	   System.out.println("Connection is created");
    return DriverManager.getConnection(URL, USER, PASSWORD);
}
}
