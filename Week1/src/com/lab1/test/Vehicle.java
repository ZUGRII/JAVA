/*******************************
 * 	Vehicle: Class that contains the main attributes of a vehicle
 * 			 It has 2 constructors and 2 objects.
 *           With the help of toString method displays the objects attributes
 *           Registration Number is set to Upper Case in Constructor. 
 * 	Author: Georgiana Zugravu
 * 	C18768301
 * 	Date: 30th January 2020
 * 	Lecturer: Susan McKeever
 **********************************/
package com.lab1.test;

public class Vehicle {
	
	//attributes
	private String OwnerName;
	private String RegNumber;
	private int MaxSpeed;
	private String Colour;
	private boolean auto;
	private int NumberWheels = 4;
	
	//constructor
	public Vehicle(String OwnerName, String RegNumber)
	{
		this.OwnerName = OwnerName;
		this.RegNumber = RegNumber;
	}//end constructor
	
	//Second Constructor
	public Vehicle(String OwnerName, String RegNumber, int MaxSpeed, String Colour, int NumberWheels, boolean auto)
	{
		this.OwnerName = OwnerName;
		this.RegNumber = RegNumber;
		this.MaxSpeed = MaxSpeed;
		this.Colour = Colour;
		this.NumberWheels = NumberWheels;
		this.auto = auto;
	}//end constructor
	
	//toString method
	public String toString()
	{
		String vehicleDetails = "This vehicle has owner name: " + OwnerName + 
								" , has a registration plate of: " + RegNumber.toUpperCase() + 
								" , is of colour " + Colour + 
								" , max speed is: " + MaxSpeed + 
								" , and the number of wheels is: " + NumberWheels +
								" , auto: " +auto;
								
		return vehicleDetails;
		
	}//end toString

}//end of the Class
