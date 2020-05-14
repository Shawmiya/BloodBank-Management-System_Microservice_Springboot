package com.example.singleton;

import java.sql.Connection;

public class Application {
	public static void main(String[] args) {
		
		long start;
		long end;
		
		DBManager dbManager = DBManager.getDbmanager();
		System.out.println(dbManager);
		
		start = System.currentTimeMillis();
		Connection connection = dbManager.getConnection();
		end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		DBManager dbManager1 = DBManager.getDbmanager();
		
		start = System.currentTimeMillis();
//		System.out.println(dbManager1);
		Connection connection1 = dbManager1.getConnection();
		end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}
}

