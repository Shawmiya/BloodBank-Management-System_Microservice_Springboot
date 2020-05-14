package com.example.factory;

public class SilverPackage extends Package {

	@Override
	protected void createPackage() {
		// TODO Auto-generated method stub
		decorations.add(new BridesMaidDeco());
		decorations.add(new BridalDeco());
	}

}
