/*******************************************
*Week 3 LAB 3 
*Employee class using inheritance 
*superclasses and subclasses
*Author: Georgiana Zugravu
*Student No: C18768301
*Lecturer: Susan McK.
*Date: 12th February 2020
*
*********************************************/

package com.lab3;

public class Employee {
	//attributes
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;
	
	//constructor
	public Employee(String firstName, String surName, int staffNumber, double annualSalary) 
	{
		this.firstName = firstName;
		this.surName = surName;
		this.staffNumber = staffNumber;
		this.annualSalary = annualSalary;
	}//end Employee()
	
	//implementing method calculatePay()
	public double calculatePay()
	{
		double monthly = this.annualSalary/12;
		return monthly;
	}//end calculatePay()
	
	public String toString() 
	{
		return "This Employee is called " + firstName + " "+ surName +
				" and has a salary of: " + annualSalary + 
				" $ annualy and his employee number is " + staffNumber+
				".";
	}//end toString()

	//getFirstName method
	public String getFirstName() 
	{
		return firstName;
	}//end getFirstName() method

	//setFirstName method
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}//end setFirstName()

	//getSurName method
	public String getSurName() 
	{
		return surName;
	}//end getSurName()

	//setSurName method
	public void setSurName(String surName) 
	{
		this.surName = surName;
	}//end setSurName()

	//getStaffNumber method
	public int getStaffNumber() 
	{
		return staffNumber;
	}//end getStaffNumber()

	//setStaffNumber method
	public void setStaffNumber(int staffNumber) 
	{
		this.staffNumber = staffNumber;
	}//end setStaffNumber()

	//getAnnualSalary method
	public double getAnnualSalary() 
	{
		return annualSalary;
	}//end getAnnualSalary()
	
	//setAnnualSalary method
	public void setAnnualSalary(double annualSalary)
	{
		this.annualSalary = annualSalary;
	}//end setAnnualSalary()
	
	

}//end class Employee
