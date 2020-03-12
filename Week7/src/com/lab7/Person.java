package com.lab7;


public class Person  {
	

	//attributes
	private String fistName;
	private String surName;
	private Date dateOfBirth;
	private String gender;
	
	
	
	//Constructor
	public Person(String fistName, String surName, Date dateOfBirth, String gender) 
	{
		super();
		this.fistName = fistName;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}//end constructor
	
	@Override
	public String toString() {
		return "Person [fistName=" + fistName + ", surName=" + surName + ", dateOfBirth=" + dateOfBirth + ", gender="
				+ gender + "]";
	}
	
	//GETTERS and SETTERS
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
