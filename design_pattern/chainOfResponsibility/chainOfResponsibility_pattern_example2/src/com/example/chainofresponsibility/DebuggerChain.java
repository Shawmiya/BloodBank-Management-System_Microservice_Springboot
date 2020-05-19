package com.example.chainofresponsibility;

public class DebuggerChain {
	DebuggerChain next;

	public void debug(Virus v) {
	}

	public void setNextDebugger(DebuggerChain d) {
		this.next = d;
	}
}
