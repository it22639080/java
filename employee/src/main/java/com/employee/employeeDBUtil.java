package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;



public class employeeDBUtil {
	
	public static List<employee> validate(String userName, String password)
	{
		
		ArrayList<employee> emp = new ArrayList<>();
		//create database connection
		String url="jdbc:mysql://localhost:3306/hotel";
		String user="root";
		String pass="1234";
		
		
		//validate
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			// create connection
			Connection con=DriverManager.getConnection(url, user,pass);
			Statement stmt= con.createStatement();//create statement
			
			// write quary
			String sql="select * from customer where user_name='"+userName+"' and password='"+password+" '";
			//run quary
			ResultSet rs =stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				int id= rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				String email=rs.getString(4);
				String phone=rs.getString(5);
				String userE=rs.getString(6);
				String passE=rs.getString(7);
				
				employee c = new employee(id,name,address,email,phone,userE,passE);
				emp.add(c);
				
				
				
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();//print the error
			
		}
		
		
		return emp;

		
		
		
	}

}
