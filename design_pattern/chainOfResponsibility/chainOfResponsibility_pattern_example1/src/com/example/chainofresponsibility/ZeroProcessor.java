package com.example.chainofresponsibility;

public class ZeroProcessor implements Chain {
	private Chain nextInChain;

	@Override
	public void setNext(Chain c) {
		// TODO Auto-generated method stub
		nextInChain = c;
	}

	@Override
	public void process(Number request) {
		// TODO Auto-generated method stub
		if (request.getNumber() == 0) {
			System.out.println("ZeroProcessor : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}
}
