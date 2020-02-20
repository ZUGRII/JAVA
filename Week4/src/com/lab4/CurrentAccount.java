/*******************************************
*Week 4 LAB 4 
*CurrentAccount subclass
*interfaces
*Author: Georgiana Zugravu
*Student No: C18768301
*Lecturer: Susan McKeever
*Date: 20th February 2020
*
*********************************************/

package com.lab4;

public class CurrentAccount extends Account{
	//class attributes
	private double penaltyAmount;
	
	//constructor 
	public CurrentAccount( String accountName, String sortCode, 
						String branchName, boolean inCredit, double acctBalance,double penaltyAmount)
	{
		super(accountName, sortCode, branchName, inCredit, acctBalance);
		setPenaltyAmount(penaltyAmount);
		
	}//end constructor

	/////////////GETTERS and SETTERS///////////////
	//getPenaltyAmount method
	public double getPenaltyAmount() {
		return penaltyAmount;
	}//end getPenaltyAmount()

	//setPenaltyAmount method 
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}//end setPenaltyAmount()
	
	
	//toString method 
	public String toString()
	{
		return super.toString() +
				"\nThe penalty amount is " +this.penaltyAmount+ ".";
	}//end toString()
	
	
	
	//withdraw method
	public void withdraw(double takeAmount)
	{
		if (takeAmount < getAcctBalance())
		{
			setAcctBalance(getAcctBalance() - takeAmount);
			System.out.println("\nThe amount of "+ takeAmount+ " has been withdraw.");
		}
		else
		{
			System.out.println("Insufficient funds");
		}//end if-else statement
		
	}//end withdraw()
	
	
	//////OverLoading checkCredit methods///////////
	//checkCredit method
	public String checkCredit()
	{
		if (getAcctBalance()> 0)
		{
			return "\nAccount Balance is greater than zero";
		}
		else
		{
			return "\nAccount balance is less than zero"; 
		}
		
	}//end checkCredit()
	
	//checkCredit method 
	public void checkCredit(String warningMsg) 
	{
		if (getAcctBalance() > 0 && getAcctBalance() < 100)
		{
			System.out.println("\n"+warningMsg);
		}
		
	}//end checkCredit()
	
	
}//end CurrentAccount class
