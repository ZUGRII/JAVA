/*******************************************
*Week 3 LAB 3 
*HourlyEmployee class using inheritance 
*superclasses and subclasses
*Author: Georgiana Zugravu
*Student No: C18768301
*Lecturer: Susan McK.
*Date: 12th February 2020
*
*********************************************/

package com.lab3;

public class HourlyEmployee extends Employee {
	
	//attributes
	private double hoursWorked;
	private double hourlyRate;
	
	//constructor
	public HourlyEmployee(String firstName, String surName, int staffNumber, double annualSalary, double hoursWorked, double hourlyRate) {
		super(firstName, surName, staffNumber, annualSalary);
	     setHoursWorked(hoursWorked);
	     setHourlyRate(hourlyRate);
	}//end HourlyEmployee
	
	//second constructor for default 0 annualSalary
	public HourlyEmployee(String firstName, String surName, int staffNumber, double hoursWorked, double hourlyRate) {
		super(firstName, surName, staffNumber, 0);
		//this.annualySalary = 0;
	     setHoursWorked(hoursWorked);
	     setHourlyRate(hourlyRate);
	}//end HourlyEmployee
	
	//calculatePay() method
	public double calculatePay()
	{
		double monthly = hoursWorked * hourlyRate;
		return monthly;
	}//end calculatePay()
	
	//toString method
	public String toString()
	{
		return super.toString() +
				"\nThe employee has "+hoursWorked +
				"hours worked this mounth and the employee pay rate is " +hourlyRate +
				"$.";
	}//end toString() method 

	//getHoursWorked method
	public double getHoursWorked() {
		return hoursWorked;
	}//end getHoursWorked method

	//setHoursWorked method 
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}//end setHoursWorked() method
	
	//getHourlyRate method
	public double getHourlyRate() {
		return hourlyRate;
	}//end getHourlyRate() method
	
	//setHourlyRate method
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}//end setHourlyRate() method
	
	


}//end HourlyEmployee class
