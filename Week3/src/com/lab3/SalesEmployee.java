/*******************************************
*Week 3 LAB 3 
*SalesEmployee class using inheritance 
*superclasses and subclasses
*Author: Georgiana Zugravu
*Student No: C18768301
*Lecturer: Susan McK.
*Date: 12th February 2020
*
*********************************************/

package com.lab3;

public class SalesEmployee extends Employee {
	

	//attributes 
	float commissionEarned;
	
	//constructor 
	public SalesEmployee(String firstName, String surName, int staffNumber, double annualSalary, float commissionEarned) {
		super(firstName, surName, staffNumber, annualSalary);
		setCommissionEarned(commissionEarned);
	}//end SalesEmployee constructor
	
	//calculatePay() method
	public double calculatePay()
	{
		double monthly = ( getAnnualSalary() / 12 ) + commissionEarned ;
		return monthly;
	}//end calculatePay() methos
	
	//toString method
	public String toString ()
	{
		return super.toString()  +
				"\nThe emplyee earned as commission  " + commissionEarned +
				"$ .";
	}//end toString() method

	//getCommissionEarned() method
	public float getCommissionEarned() 
	{
		return commissionEarned;
	}//end getCommissionEarned() method

	//setCommissionEarned method
	public void setCommissionEarned(float commissionEarned) 
	{
		this.commissionEarned = commissionEarned;
	}//end setCommissionEarned method
	
	
	
}//end SalesEmployee class
