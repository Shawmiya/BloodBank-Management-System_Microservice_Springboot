package com.example.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<VehicleType, Vehicle> vehicles = new HashMap<>();

	public Registry() {
		this.initialize();
	}

	public Vehicle getVehicle(VehicleType vehicleType) {
		Vehicle vehicle = null;
		try {
			vehicle = (Vehicle) vehicles.get(vehicleType).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vehicle;
	}

	private void initialize() {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setEngineCapacity(1000);
		car.setFuelType("fueltype1");
		car.setType("type1");

		Bus bus = new Bus();
		bus.setNoOfSeats(40);
		bus.setEngineCapacity(1000);
		bus.setFuelType("fueltype2");

		vehicles.put(VehicleType.CAR, car);
		vehicles.put(VehicleType.BUS, bus);

	}
}
