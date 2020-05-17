package com.example.builder;

public class BuilderPatternMain {
	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Saman", "roy").age(20).phone("1234567").address("Colombo").build();
		System.out.println(user1);

		User user2 = new User.UserBuilder("John", "raj").age(30).phone("368999988").build();
		System.out.println(user2);

		User user3 = new User.UserBuilder("nimal", "ann").build();
		System.out.println(user3);
	}
}
