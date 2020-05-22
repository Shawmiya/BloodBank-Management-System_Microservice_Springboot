package com.example.memento;

public class SoftwareStatus {
	String newChange;
	String correction;

	SoftwareStatus(String n1, String n2) {
		this.newChange = n1;
		this.correction = n2;
	}

	public void setNewChange(String newChange) {
		this.newChange = newChange;
	}

	public void setCorrection(String correction) {
		this.correction = correction;
	}

	public void getDetails() {
		System.out.println("new change :" + this.newChange + " , " + "correction : " + this.correction);
	}

}
