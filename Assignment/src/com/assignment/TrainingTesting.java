package com.assignment;

import java.util.ArrayList;
import java.util.Random;

public class TrainingTesting {

	//attributes
	ArrayList<Data> values;
	ArrayList<Data> train;
	ArrayList<Data> test;
	ArrayList<Integer> random;
	private String[] covid = new String[100];;
	private int accuracy = 0;
	int i ;
	
	//Constructor
	public TrainingTesting() 
	{
		values 	= new ArrayList<Data>(100);
		train	= new ArrayList<Data>(100);
		test	= new ArrayList<Data>(100);
		random	= new ArrayList<Integer>(100);
		FileManager myFile = new FileManager("MLdata.txt");
		myFile.connectToFile();
		values = myFile.readFile();
		
		//random values
		while(i< values.size()*70/100)
		{
			Random randomgen = new Random();
			int r = randomgen.nextInt(values.size()*70/100);
			if(random.contains(r))
			{
				continue;
			}
			else
			{
				random.add(r);
				i++;
			}
			
		}
		
		//insert values
		for(int j = 0; j<values.size(); j++)
		{
			if(random.contains(j))
			{
				train.add(values.get(j));
			}
			else
			{
				test.add(values.get(j));
			}
		}
		
		
	}//end constructor
	
	public double testAccuracy()
	{
		//call NaiveBayes
		for(i = 0; i<test.size(); i++ )
		{
				
			NaiveBayes data = new NaiveBayes(test.get(i), train);
			
			if(Double.valueOf(data.calculateAll()) > 50)
    		{
				 covid[i] = "yes";
			}
			else
			{
				 covid[i] = "no";
			}
		}
		
		//calculate accuracy
		for(i=0; i< 23; i++)
		{
			if(covid[i].equals(test.get(i).getHasCovid19()))
			{
				accuracy++;
			}
				
		}
		
		
		//return the percentage
		return (double)accuracy/23*100;
		
	}//end testAccuracy
		
}//end class
