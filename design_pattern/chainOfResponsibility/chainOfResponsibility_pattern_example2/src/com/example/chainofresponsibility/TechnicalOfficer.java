package com.example.chainofresponsibility;

public class TechnicalOfficer extends DebuggerChain {
	public void debug(Virus v) {
		if (v.getThreatLevel() > 10) {
			this.next.debug(v);
		} 
		else {
			System.out.println("Virus removed by TechnicalOfficer");
		}
	}
}
