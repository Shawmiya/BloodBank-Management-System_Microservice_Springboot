package com.example.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	private static volatile DBManager dbmanager; // = new DBManager();
	private static volatile Connection connection;

	private DBManager() {
		if (dbmanager != null) {
			throw new RuntimeException("Please get use getDBManager method");
		}
	}

	public static DBManager getDbmanager() {
		if (dbmanager == null) {
			synchronized (DBManager.class) {
				if (dbmanager == null) {

					dbmanager = new DBManager();
				}
			}

		}
		return dbmanager;
	}
	
	public Connection getConnection() {
		if(connection == null) {
			synchronized (DBManager.class) {
				if (connection == null) {
					String url = "jdbc:derby:memory:sample;create=true";
					try {
						connection = DriverManager.getConnection(url);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return connection;
	}
}
