package com.example.prototype;

import java.util.List;

public class Application {
	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.insertData();

		Vehicle vehicle2 = (Vehicle) vehicle1.clone();
		List<String> list = vehicle2.getVehicleList();
		list.add("Hyundai");

		System.out.println(vehicle1.getVehicleList());
		System.out.println(list);

		vehicle2.getVehicleList().remove("Maruti");
		System.out.println(list);
		System.out.println(vehicle1.getVehicleList());
	}
}
