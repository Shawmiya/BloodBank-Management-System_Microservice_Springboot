package com.example.factorymethod;

public class Car extends Vehicle {

	int wheel;

	Car(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		// TODO Auto-generated method stub
		return this.wheel;
	}

}
