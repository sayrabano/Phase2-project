package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SearchDao {

	private String dbUrl = "jdbc:mysql://localhost:3306/flyaway";
	private String dbUname = "root";
	private String dbPassword = "say123";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection()
	{
		Connection con = null;
		try { 
			con = DriverManager.getConnection(dbUrl, dbDriver, dbPassword);
			
		
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	
	 return con;
	 
	}
}