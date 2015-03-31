package com.cloudwick.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcManager {

	private static Connection conn;

	private static void insertData(String name, String pwd) throws SQLException {
		String query = "insert into user (username,password) values (?,?)";

		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, pwd);
		int count = ps.executeUpdate();
		System.out.println("we have inserted "+count+" records");
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/test";

		conn = DriverManager.getConnection(url, "root", Password.pass);
		insertData("swapnesh", "nopassword");
	}

}
