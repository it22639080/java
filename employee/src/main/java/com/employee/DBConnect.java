package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/hotel";
	private static String UserName="root";
	
	private static Connection con;
	
	
	public static Connection getConnection()
	{
		try {
			Class.forName("con.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, UserName);
			
		}
		
		catch(Exception e)
		{
			System.out.println("Database connection is not success");
			
		}
	}
	
}
