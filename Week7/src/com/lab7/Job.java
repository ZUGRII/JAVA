package com.lab7;

public class Job {
	
	//attributes
	private double salary;
	private String role;
	private int jobID;
	
	
	
	
	
	
	//Constructor
	public Job(double salary, String role, int jobID) {
		super();
		this.salary = salary;
		FileProcessor check = new FileProcessor("roles.txt");
		check.openFile();
		if(check.readFile(role))
		{
			System.out.println("\n True");
			this.role = role;
		}
		else
		{
			System.out.println("\n False");
		}
		this.jobID = jobID;
	}//end Constructor

	//toString method 
	public String toString() {
		return "Job [salary=" + salary + ", role=" + role + ", jobID=" + jobID + "]";
	}//end toString method
	
	//GETTERS and SETTERS
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	

}//end class Job
