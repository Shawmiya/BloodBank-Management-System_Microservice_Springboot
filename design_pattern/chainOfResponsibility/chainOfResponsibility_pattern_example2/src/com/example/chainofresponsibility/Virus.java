package com.example.chainofresponsibility;

public class Virus {
	private int threatLevel;

	Virus(int threatlevel) {
		this.threatLevel = threatlevel;
	}

	public int getThreatLevel() {
		return threatLevel;
	}

}
