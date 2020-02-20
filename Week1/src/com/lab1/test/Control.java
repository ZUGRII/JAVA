/*******************************
 * 	Control: First java program after long time
 * 			 Program to print hello world
 * 	Author: Georgiana Zugravu
 * 	C18768301
 * 	Date: 30th January 2020
 * 	Lecturer: Susan McKeever
 **********************************/


package com.lab1.test;

public class Control {
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		Vehicle first = new Vehicle("Marius", "19Ke200");
		Vehicle second = new Vehicle("Jordan", "201dd343", 230, "red", 5, true);
		
		System.out.println(second.toString());
		System.out.println(first.toString());
	
	}//end main

}//end of class
