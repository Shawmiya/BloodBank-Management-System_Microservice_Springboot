package com.example.factory;

public class Application {
	public static void main(String[] args) {
		Package apackage1 = PackageFactory.createPackage(PackageCode.BASIC);
		System.out.println(apackage1);

		Package apackage2 = PackageFactory.createPackage(PackageCode.PATINUM);
		System.out.println(apackage2);
	}
}
