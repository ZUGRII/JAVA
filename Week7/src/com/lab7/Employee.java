package com.lab7;

public class Employee extends Person {
	
	//attributes
	private Job job;
	private int personnelNumber;
	private Date startDate;
	static private int nextNumber = 1;
	
	
	
	//Constructor
	public Employee(String fistName, String surName, Date dateOfBirth, String gender, Job job,
			Date startDate) 
	{
		super(fistName, surName, dateOfBirth, gender);
		this.job = job;
		this.personnelNumber = getNextNumber();
		this.startDate = startDate;
		nextNumber++;
	}//end constructor
	
	//GETTERS and SETTERS
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee job=" + job + ", personnelNumber=" + personnelNumber + ", startDate=" + startDate
				+ ", FistName=" + getFistName()+ ", surName=" + getSurName() + ", DateOfBirth="
				+ getDateOfBirth() + ", Gender=" + getGender() + ".";
	}

	public int getPersonnelNumber() {
		return personnelNumber;
	}
	public void setPersonnelNumber(int personnelNumber) {
		this.personnelNumber = personnelNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getNextNumber() {
		return nextNumber;
	}
	public void setNextNumber(int nextNumber) {
		Employee.nextNumber = nextNumber;
	}
	
	

}
