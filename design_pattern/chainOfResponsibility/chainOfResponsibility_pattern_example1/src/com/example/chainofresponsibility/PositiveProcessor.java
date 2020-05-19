package com.example.chainofresponsibility;

public class PositiveProcessor implements Chain {
	private Chain nextInChain;

	@Override
	public void setNext(Chain c) {
		// TODO Auto-generated method stub
		nextInChain = c;
	}

	@Override
	public void process(Number request) {
		// TODO Auto-generated method stub
		if (request.getNumber() > 0) {
			System.out.println("PositiveProcessor : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}
}
