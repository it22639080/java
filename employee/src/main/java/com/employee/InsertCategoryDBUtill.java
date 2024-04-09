package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertCategoryDBUtill {
	public static boolean insertCategory(String name,String Type) {
		boolean isSuccess = false;
		
		//create database connection 
		
		
		String url="jdbc:mysql://localhost:3306/hotel";
		String user="root";
		String pass="1234";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, user, pass);
			Statement stmt= con.createStatement();//create statement
			
			String sql="insert into category values(0,'"+name+"','"+Type+"')";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	

}
