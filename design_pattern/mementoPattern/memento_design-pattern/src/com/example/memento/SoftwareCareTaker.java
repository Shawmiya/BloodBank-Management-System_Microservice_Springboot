package com.example.memento;

import java.util.ArrayList;
import java.util.List;

public class SoftwareCareTaker {
	List<SoftwareMemento> mementolist;

	SoftwareCareTaker() {
		this.mementolist = new ArrayList<SoftwareMemento>();
	}

	public void add(SoftwareMemento softwareMemento) {
		this.mementolist.add(softwareMemento);
	}

	public SoftwareMemento getMemento(int index) {
		return this.mementolist.get(index);
	}
}
