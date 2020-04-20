/* NaiveBayes Class 
 * 
 * Author: Georgiana Zugravu
 * Student Number: C18768301
 * Start date: 6th April 2020
 * Due date: 20th April 2020
 * Coordinator : Susan McKeever 
 */
package com.assignment;

import java.util.ArrayList;

public class NaiveBayes {
	
	//attributes
	private Data input;
	private ArrayList<Data> values;
	
	//Constructor
	public NaiveBayes(Data input, ArrayList<Data> values) {
		this.input = input;
		this.values = values;
	}//end constructor
	
	
	//Calculate has_covid19 (Yes/No) probability
	double yesOrNoProbability(String yesOrNo)
	{
		double yesTotal = 0;
		for (int i = 0; i < values.size();i++) 
	      { 
			 if (values.get(i).getHasCovid19().equals(yesOrNo))
				 yesTotal++;
	      }
		
		return yesTotal /values.size();
	}//end the calculation for yes/no probability
	
	
	//////Calculate for all if covid19 = yes/no
	double probability(String yesOrNo)
	{
		double temp = 0;
		double aches = 0;
		double cough = 0;
		double soreT = 0;
		double dangerZ = 0;
		double yesTotal = 0;
		
		for (int i = 0; i< values.size(); i++)
		{
			if(values.get(i).getHasCovid19().equals(yesOrNo))
			{
				yesTotal++;
				if(values.get(i).getTemperature().equals(input.getTemperature()))
				{
					temp++;
				}
				if(values.get(i).getAches().equals(input.getAches()))
				{
					aches++;
				}
				if(values.get(i).getCough().equals(input.getCough()))
				{
					cough++;
				}
				if(values.get(i).getSoreThroat().equals(input.getSoreThroat()))
				{
					soreT++;
				}
				if(values.get(i).getDangerZone().equals(input.getDangerZone()))
				{
					dangerZ++;
				}	
			}//end if yes/no
		}//end for loop
		
		//division validation
		if(temp == 0) temp++;
		else temp=temp/yesTotal;
		
		if(aches == 0) aches++;
		else aches=aches/yesTotal;
		
		if(cough == 0) cough++;
		else cough=cough/yesTotal;
		
		if(soreT == 0) soreT++;
		else soreT=soreT/yesTotal;
		
		if(dangerZ == 0) dangerZ++;
		else dangerZ=dangerZ/yesTotal;
		
		return temp*aches*cough*soreT*dangerZ;
	}//end probability
	
	//calculate all
	double calculateAll()
	{
		return probability("yes")*yesOrNoProbability("yes")/((probability("yes")*yesOrNoProbability("yes"))+(probability("no")*yesOrNoProbability("no")))*100;
	}//end calculation

}//end NaiveBayes class
