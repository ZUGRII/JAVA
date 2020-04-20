package com.assignment;

import java.util.ArrayList;

public class NaiveBayes {
	
	//attributes
	Data input;
	ArrayList<Data> values;
	
	//Constructor
	public NaiveBayes(Data input, ArrayList<Data> values) {
		this.input = input;
		this.values = values;
	}
	
	
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
		
	}
	
	
	//////Calculate for each if covid19 = yes/no
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
			}
		}
		
		return ((temp/yesTotal)+1)*(aches/yesTotal)*(cough/yesTotal)*(soreT/yesTotal)*(dangerZ/yesTotal);
	}
	
	//calculate all
	double calculateAll()
	{
		return probability("yes")*yesOrNoProbability("yes")/((probability("yes")*yesOrNoProbability("yes"))+(probability("no")*yesOrNoProbability("no")))*100;
	}

}
