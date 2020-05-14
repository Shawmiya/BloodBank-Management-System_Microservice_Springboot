package com.example.singleton;

public class Singleton {
	private static Singleton myInstance;

	private double randomNumber;

	private Singleton() {
		this.randomNumber = Math.random();
	}

	public static synchronized Singleton getInstance() {
		if (myInstance == null) {
			myInstance = new Singleton();
		}
		return myInstance;
	}

	public double getRandomNumber() {
		return randomNumber;
	}
}
