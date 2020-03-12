package com.lab7;

public class Control {

	public static void main(String[] args) {
		
		Date d1 = new Date(12, 03, 2020);
		Job j1 = new Job(20000, "Engineer", 1234);
		
		System.out.println(d1);
		System.out.println(j1);
		
		Person p1 = new Person("Enoch", "Baciu", d1, "bi");
		Date d2 = new Date(13, 03, 2000);
		Job j2 = new Job (25000, "Doctor", 1235);
		Employee e1 = new Employee ("Marcus", "Oppong", d2, "gay", j2, d1 );
		
		System.out.println(p1);
		System.out.println(e1);

	}//end main method

}//end class Control
