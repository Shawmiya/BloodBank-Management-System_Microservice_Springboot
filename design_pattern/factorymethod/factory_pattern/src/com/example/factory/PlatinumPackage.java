package com.example.factory;

public class PlatinumPackage extends Package {

	@Override
	protected void createPackage() {
		// TODO Auto-generated method stub
		decorations.add(new BridesMaidDeco());
		decorations.add(new BridalDeco());
		decorations.add(new FlowerGirlDeco());
		decorations.add(new ParentDeco());
	}

}
