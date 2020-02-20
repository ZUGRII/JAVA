/*******************************************
*Week 4 LAB 4 
*Account superclass 
*interfaces
*Author: Georgiana Zugravu
*Student No: C18768301
*Lecturer: Susan McKeever
*Date: 20th February 2020
*
*********************************************/

package com.lab4;

public class Account implements ValidatedAccount{
	// class attributes
	private String accountName;
	private int accountNumber;
	private String sortCode;
	private String branchName;
	private boolean inCredit;
	private double acctBalance;
	private static int currentNumber = 1111 ;
	
	//constructor
	public Account(String accountName, String sortCode, String branchName, boolean inCredit, double acctBalance)
	{
		setAccountName(accountName);
		setAccountNumber(getCurrentNumber()+1);
		setSortCode(sortCode);
		setBranchName(branchName);
		setInCredit(inCredit);
		setAcctBalance(acctBalance);
		setCurrentNumber(getCurrentNumber()+1);
	}//end constructor

	
	////////////GETTERS and SETTERS/////////////
	//getAccountName method
	public String getAccountName() {
		return accountName;
	}//end getAccountName()

	//setAccountName method
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}//end setAccountName()

	//getAccountNumber method
	public int getAccountNumber() {
		return accountNumber;
	}//end getAccountNumber()

	//setAccountNumber method
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}//end setAccountNumber()

	//getSortCode method
	public String getSortCode() {
		return sortCode;
	}//end getSortCode()

	//setSortCode method
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}//end setSortCode()

	//getBranchName method
	public String getBranchName() {
		return branchName;
	}//end getBranchName()

	//setBranchName method
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}//end setBranchName()

	//isInCredit method
	public boolean isInCredit() {
		return inCredit;
	}//end isInCredit()

	//setInCredit method
	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}//end setInCredit()

	//getAcctBalance method
	public double getAcctBalance() {
		return acctBalance;
	}//end getAcctBalance()

	//setAcctBalance method 
	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}//end setAcctBalance()
	
	//getCurrentNumber method
	public static int getCurrentNumber() {
		return currentNumber;
	}//end getCurrentNumber()

	//setCurrentName method
	public static void setCurrentNumber(int currentNumber) {
		Account.currentNumber = currentNumber;
	}//end setCurrentNumber()

	
	
	//toString method
	public String toString() {
		return " \nThis a " +this.accountName + " account and  its number is " 
				+this.accountNumber+ " with the sortCode: " 
				+this.sortCode+ " at the branch from "
				+this.branchName+ ".\nIts account balance is: "
				+this.acctBalance+ " $ and inCrdeit is :"
				+this.inCredit;
	}//end toString()
	
	
	//deposit method
	public void deposit(double depAmount) {
		
		setAcctBalance(getAcctBalance() + depAmount);
		System.out.println("\nThe amount of "+ depAmount+ " has been deposited.");
		
	}//end deposit method
	
	
	
	//withdraw method
	public void withdraw(double takeAmount) {
		
		setAcctBalance(this.acctBalance - takeAmount);
		System.out.println("\nThe amount of "+ takeAmount+ " has been withdraw.");
		
		//check the balance
		if(this.acctBalance < 0 )
		{
			setInCredit(false);
		}
		else
		{
			setInCredit(true);
		}//end if-else statement 
		
	}//end withdraw method
	
	
	
	//////////Methods from interface ValidatedAccount/////////
	//getDetails method
	public void getDetails() {
		System.out.println("\nThis is a "+this.accountName+ " account and its balance is " +acctBalance+"$.");
	}//end getDetails()
	
	//validatedAccount method
	public void valuableAccount() {
		System.out.println("\nAccount balance is: "+ acctBalance+"$.");
	}//end validatedAccount()
	

}//end Account class
