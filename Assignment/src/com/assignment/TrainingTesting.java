/* TrainingTesting Class 
 * 
 * Author: Georgiana Zugravu
 * Student Number: C18768301
 * Start date: 6th April 2020
 * Due date: 20th April 2020
 * Coordinator : Susan McKeever 
 */
package com.assignment;

import java.util.ArrayList;
import java.util.Random;

public class TrainingTesting {

	//attributes
	private ArrayList<Data> values;
	private ArrayList<Data> train;
	private ArrayList<Data> test;
	private ArrayList<Integer> random;
	
	private String[] covid;
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
		values = myFile.readFile();
		
		//random values
		while(i< values.size()*70/100)
		{
			Random randomgen = new Random();
			int r = randomgen.nextInt(values.size()*70/100);
			if(random.contains(r)){
				continue;
			}
			else{
				random.add(r);
				i++;
			}
		}//end while loop
		
		//insert values
		for(int j = 0; j<values.size(); j++)
		{
			if(random.contains(j)){
				train.add(values.get(j));
			}
			else{
				test.add(values.get(j));
			}
		}//end for loop
		
	}//end constructor
	
	public double testAccuracy()
	{
		//call NaiveBayes to calculate the prediction
		for(i = 0; i<test.size(); i++ )
		{
				
			NaiveBayes data = new NaiveBayes(test.get(i), train);
			
			if(Double.valueOf(data.calculateAll()) > 50){
				 covid[i] = "yes";
			}
			else{
				 covid[i] = "no";
			}
		}//end for loop
		
		//calculate accuracy
		for(i=0; i< test.size(); i++)
		{
			if(covid[i].equals(test.get(i).getHasCovid19())){
				accuracy++;
			}	
		}//end for loop
		
		//return the percentage
		return (double)accuracy/23*100;
		
	}//end testAccuracy
		
}//end class
