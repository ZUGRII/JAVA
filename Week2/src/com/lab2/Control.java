/*******************************************
*Week 2 LAB 2 
*
*Author: Georgiana Zugravu
*Student No: C18768301
*Lecturer: Susan McK.
*Date: 6th February 2020
*
*********************************************/


package com.lab2;
import java.util.Scanner; //Import the Scanner

public class Control {

	public static void main(String[] args) {
		
		//two new objects
		Animal a1 = new Animal("Spot", "dog", 3, true,"blue");
		Animal a2 = new Animal("Leo");
		
		//Print the objects
		System.out.println(a1);
		System.out.println(a2);
		
		//Part 3/4 printing
		System.out.println(a1.getName());
		System.out.println(a1.isDomesticAnimal());
		System.out.println(a1.getAge());
		
		//Part 6 makeNoise methods
		a1.makeNoise();
		a1.makeNoise(true);
		a1.makeNoise(false);
		
		//Part 7 object inserted from keyboard
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = input.nextLine();
		System.out.println("Enter the breed: ");
		String breed = input.nextLine();
		System.out.println("Enter the colour: ");
		String colour = input.nextLine();
		System.out.println("Enter the age: ");
		int age = input.nextInt();
		System.out.println("Enter If it is domestic or not(true/false): ");
		boolean domestic = input.nextBoolean();

		//Part 7 create and print the object
		Animal a3 = new Animal (name, breed, age, domestic, colour);
		System.out.println(a3);
		a3.makeNoise(false);
		
		input.close();
	}//end main

}//end class Control
