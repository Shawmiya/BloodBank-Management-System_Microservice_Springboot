package com.example.memento;

public class SoftwareMemento {
	SoftwareStatus softwareStatus;

	SoftwareMemento(SoftwareStatus softwareStatus) {
		this.softwareStatus = softwareStatus;
	}

	public SoftwareStatus getSoftwareStatus() {
		return softwareStatus;
	}

}
