package com.example.chainofresponsibility;

public class TeamLead extends DebuggerChain {
	public void debug(Virus v) {
		if (v.getThreatLevel() > 5) {
			this.next.debug(v);
		} 
		else {
			System.out.println("Virus removed by TeamLead");
		}
	}
}
