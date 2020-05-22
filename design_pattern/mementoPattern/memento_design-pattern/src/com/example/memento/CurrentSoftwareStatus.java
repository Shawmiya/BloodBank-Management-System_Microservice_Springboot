package com.example.memento;

public class CurrentSoftwareStatus {
	SoftwareStatus softwareStatus = null;

	CurrentSoftwareStatus(SoftwareStatus softwareStatus) {
		this.softwareStatus = softwareStatus;
	}

	public void setStatus(SoftwareStatus softwareStatus) {
		this.softwareStatus = softwareStatus;
	}

	public SoftwareMemento createMemento() {
		return new SoftwareMemento(this.softwareStatus);
	}

	public void setStatusMemento(SoftwareMemento softwareMemento) {
		this.softwareStatus = softwareMemento.getSoftwareStatus();
	}

	public void setNewChange(String newChange) {
		this.softwareStatus.setNewChange(newChange);
	}

	public void setCorrection(String correction) {
		this.softwareStatus.setCorrection(correction);
	}

	public void getDetails() {
		this.softwareStatus.getDetails();
	}
}
