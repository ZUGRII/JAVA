package com.assignment;

import java.util.ArrayList;
import java.util.Random;

public class TrainingTesting {

	//attributes
	ArrayList<Data> values;
	ArrayList<Data> train;
	ArrayList<Data> test;
	ArrayList<Integer> random; 
	
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
		int i=0;
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
			
			System.out.println("values.size(): "+values.size());
			System.out.println("i:"+i);
			System.out.println("Random: "+random);
			
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
	
		
		
}//end class
	
		
		
	
	
	
