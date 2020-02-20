/*******************************************
*Week 4 LAB 4 
*DepositAccount subclass 
*interfaces
*Author: Georgiana Zugravu
*Student No: C18768301
*Lecturer: Susan McKeever
*Date: 20th February 2020
*
*********************************************/

package com.lab4;

public final class DepositAccount extends Account{
	//class attributes 
	private double interestRate;

	//constructor
	public DepositAccount(String accountName, String sortCode, String branchName, boolean inCredit, double acctBalance, double interestRate)
	{
		super(accountName, sortCode, branchName, inCredit, acctBalance);
		setInterestRate(interestRate);
	}//end constructor
	
	
	///////////////GETTERS and SETTERS///////////////
	// getInterestRate method
	public double getInterestRate() {
		return interestRate;
	}//end getInterestRate()

	//setInterestRate method
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}//end setInterestRate()
	
	
	//toString method 
	public String toString()
	{
		return super.toString() +
				"\nIts interstRate is " +this.interestRate+ ".";
	}//end toString()
	
	
	//withdraw method
	public void withdraw( double takeAmount) {
		
		System.out.println("\nYou cannot withdraw from a deposit account!");
	}//end withdraw()

}
