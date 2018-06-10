package com.newtech.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	static String ip = "127.0.0.1";
	static int port = 3306;
	static String database = "newtechbookstore";
	static String encoding = "UTF-8";
	static String loginname = "root";
	static String password = "root";
	
	static Connection con = null;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
		con =  DriverManager.getConnection(url, loginname, password);
		return con;
	}
	
	public void close() throws SQLException {
		if(con != null) {
			con.close();
		}
	}
}
