package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bancoCrud", "murilio", "123");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
