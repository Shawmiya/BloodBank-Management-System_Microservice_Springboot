package com.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
	private List<String> vehicleList;

	public Vehicle() {
		this.vehicleList = new ArrayList<String>();
	}

	public Vehicle(List<String> list) {
		this.vehicleList = list;
	}

	public void insertData() {
		vehicleList.add("Honda");
		vehicleList.add("Audi");
		vehicleList.add("BMW");
		vehicleList.add("Maruti");
	}

	public List<String> getVehicleList() {
		return this.vehicleList;

	}

	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();

		for (String s : this.getVehicleList()) {
			tempList.add(s);
		}
		return new Vehicle(tempList);

	}

}
