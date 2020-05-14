package com.example.prototype;

public class Bus extends Vehicle {

	private int noOfSeats;

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "Bus [noOfSeats=" + noOfSeats + "]";
	}

}
