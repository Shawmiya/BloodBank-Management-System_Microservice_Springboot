package com.example.chainofresponsibility;

public class Application {
	public static void main(String[] args) {

		Virus virus = new Virus(4);

		Engineer eng = new Engineer();
		TeamLead tl = new TeamLead();
		TechnicalOfficer to = new TechnicalOfficer();
		Expert exp = new Expert();

		eng.setNextDebugger(tl);
		tl.setNextDebugger(to);
		to.setNextDebugger(exp);
		eng.debug(virus);
	}

}
