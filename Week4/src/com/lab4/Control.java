/*******************************************
*Week 4 LAB 4 
*Control class containing the main 
*interfaces
*Author: Georgiana Zugravu
*Student No: C18768301
*Lecturer: Susan McKeever
*Date: 20th February 2020
*
*********************************************/
package com.lab4;

public class Control {

	//main method
	public static void main(String[] args) {
		//create the objects
		Account a1 = new Account ("Account", "BOIF2", "Dublin", true, 200.0);
		DepositAccount da1 = new DepositAccount("Deposit", "AIB1", "Cork", false, 100.0, 0.0);
		CurrentAccount ca1 = new CurrentAccount ("Current", "KSB", "Ashbourne", true, 560.0, 10.0);
		
		//print the objects
		System.out.println(a1);
		System.out.println(da1);
		System.out.println(ca1);
		
		//call the methods
		a1.deposit(200);
		a1.withdraw(50.0);
		da1.withdraw(20.0);
		ca1.withdraw(500.0);
		System.out.println(ca1.checkCredit());
		ca1.checkCredit("hELP");
		
		System.out.println(a1);
		System.out.println(da1);
		System.out.println(ca1);
		
		//get the details
		a1.getDetails();
		a1.valuableAccount();
		da1.getDetails();
		da1.valuableAccount();
		ca1.getDetails();
		ca1.valuableAccount();
	}//end main method

}//end class Control
