package com.example.chainofresponsibility;

public class Engineer extends DebuggerChain {
	public void debug(Virus v) {
		if (v.getThreatLevel() > 2) {
			this.next.debug(v);
		} 
		else {
			System.out.println("Virus removed by Engineer");
		}
	}
}
