package com.example.memento;

public class ApplicationMemento {
	public static void main(String[] args) {
		SoftwareStatus ss = new SoftwareStatus("change1", "correction1");

		CurrentSoftwareStatus css = new CurrentSoftwareStatus(ss);
		SoftwareMemento sm = css.createMemento();
		SoftwareCareTaker sct = new SoftwareCareTaker();
		sct.add(sm);
		css.setCorrection("correction2");
		sct.add(css.createMemento());

		sct.add(css.createMemento());

		css.setStatusMemento(sct.getMemento(0));
		css.getDetails();
	}
}
