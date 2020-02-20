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

public class Animal {
	
	//Atributes
	private String name;
	private String breed;
	private int age;
	private boolean domesticAnimal;
	private String colour;
	
	//Constructors
	public Animal (String name)
	{
		this.name = name;
	}//end first constructor
	
	public Animal(String name, String breed, int age,boolean domesticAnimal,String colour)
	{
		setName(name);
		setBreed(breed);
		setAge(age);
		setDomesticAnimal(domesticAnimal);
		setColour(colour);
	}//end second constructor
	
	
	//toString method 
	public String toString()
	{
		return "The animal is called " +this.name+
				", is a "+this.breed+
				" that is "+this.colour+
				" in colour and is " +this.age+
				" years old and domestic is " +this.domesticAnimal+
				".";
	}//end toString
	
	
	////////////GETTERS AND SETTERS////////////
	
	//Name getter and setter
	public void setName(String name)
	{
		this.name= name;
	}//end setName
	
	public String getName ()
	{
		return name;
	}//end getName
	
	
	
	//Breed getter and setter
	public void setBreed(String breed)
	{
		this.breed = breed;
	}//endsetBreed
	
	public String getBreed()
	{
		return breed;
	}//end getBreed
	
	
	
	//DomesticAnimal getter and setter
	public boolean isDomesticAnimal() {
		return domesticAnimal;
	}//end isDomesticAnimal

	public void setDomesticAnimal(boolean domesticAnimal) {
		this.domesticAnimal = domesticAnimal;
	}//end setDomesticAnimal

	
	
	//Colour getter and setter
	public void setColour(String colour)
	{
		this.colour = colour;
	}//end setColour
	
	public String getColour()
	{
		return colour;
	}//end getColour
	
	
	
	//Age getter and setter
	public void setAge(int age)
	{
		this.age = age;
	}//end setAge
	
	public int getAge()
	{
		return age;
	}//end getAge
	
	
	/////////////////////PART 5//////////////////////
	//makeNoise methods
	public void makeNoise()
	{
		switch (breed)
		{
			case "dog" :
			{
				System.out.println("Bark");
				break;
			}//end dog
			case "cat" :
			{
				 System.out.println("Miaw");
				break;
			}//end cat
			case "goat":
			{
				System.out.println("Maa");
				break;
			}//end goat
			case "sheep":
			{
				System.out.println("Baa");
				break;
			}//end sheep
			default:
			{
				System.out.println("Nah!");
			}//end default			
		}//end  switch
	}//end makeNoise1 
	
	//Method Overload makeNoise
	public void makeNoise(boolean old)
	{
		if(old)
		{
			System.out.println("Quiet animal");
		}//end if
		else
		{
			makeNoise();
		}//end else
	}//end makeNoise boolean
	
	
}
