package com.agenda.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionFactory {
	
	public Connection getConnetion() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/agendadb", "root", "");
		}catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
