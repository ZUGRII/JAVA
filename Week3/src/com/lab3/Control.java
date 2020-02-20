/*******************************************
*Week 3 LAB 3 
*Control class containing the main 
*superclasses and subclasses, inheritances, polymorphism
*Author: Georgiana Zugravu
*Student No: C18768301
*Lecturer: Susan McK.
*Date: 12th February 2020
*
*********************************************/

package com.lab3;

public class Control {

	//main method 
	public static void main(String[] args) {
		
		//object for employee class
		Employee e1 = new Employee("Martha", "Smith", 5922, 40000);
		System.out.println(e1);
		double monthly1 = e1.calculatePay();
		System.out.println("Monthly pay is: "+ monthly1 + "$.\n");
		
		//object for HourlyEmployee class
		HourlyEmployee he1 = new HourlyEmployee("Miruna", "Meath", 1432, 0.0, 180.0, 12.5);
		System.out.println(he1);
		double monthly2 = he1.calculatePay();
		System.out.println("Monthly pay is: " + monthly2 + "$.\n");
		HourlyEmployee he2 = new HourlyEmployee("Luke", "Duadu", 3758, 198.5, 15.30);
		
		
		//object for SalesEmployee class
		SalesEmployee se1 = new SalesEmployee ("Mircea", "McFitz", 3985, 30000, 1000);
		System.out.println(se1);
		double monthly3 = se1.calculatePay();
		System.out.println("Monthly pay is: " + monthly3+ "$.\n");
		
		/////////////////POLYMORPHISM////////////////////
		//create the array
		Employee[] empl = new Employee[4];
		
		//Insert values into array
		empl[0] = e1;
		empl[1] = he1;
		empl[2] = se1;
		empl[3] = he2;
		
		
		System.out.println();
		for(int i=0; i<4; i++)
		{
			double monthly = empl[i].calculatePay();
			System.out.println(empl[i].getFirstName()+ " "+ empl[i].getSurName()+ " gets "+ monthly+ "$ monthly.");
		}//end for loop
		
		

	}//end main

}//end class Control
