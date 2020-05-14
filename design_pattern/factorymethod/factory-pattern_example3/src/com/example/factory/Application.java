package com.example.factory;

public class Application {
	public static void main(String[] args) {

		LoanFactory loanFactory = new LoanFactory();

		Loan homeLoan = loanFactory.getLoan(LoanType.HOME);
		System.out.println(homeLoan.calculateInterest(1000));

		Loan carLoan = loanFactory.getLoan(LoanType.CAR);
		System.out.println(carLoan.calculateInterest(1000));

		Loan persLoanLoan = loanFactory.getLoan(LoanType.PERSONAL);
		System.out.println(persLoanLoan.calculateInterest(1000));
	}
}
