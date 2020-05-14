package com.example.singleton;

public class Caller {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println("singleton1  number is : " + singleton1.getRandomNumber());
		System.out.println("singleton2  number is : " + singleton2.getRandomNumber());
	}
}
