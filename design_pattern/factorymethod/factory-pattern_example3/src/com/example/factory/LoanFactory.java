package com.example.factory;

public class LoanFactory {
	public Loan getLoan(LoanType loanType) {

		switch (loanType) {
		case CAR:
			return new CarLoan();
		case HOME:
			return new HomeLoan();
		case PERSONAL:
			return new PersonalLoan();

		default:
			return null;
		}
	}
}
