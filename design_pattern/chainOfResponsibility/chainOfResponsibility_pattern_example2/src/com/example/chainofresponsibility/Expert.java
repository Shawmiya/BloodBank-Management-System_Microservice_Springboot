package com.example.chainofresponsibility;

public class Expert extends DebuggerChain {
	public void debug(Virus v) {
		System.out.println("Virus removed by Expert");
	}
}
