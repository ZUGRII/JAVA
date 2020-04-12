package com.assignment;

import java.util.ArrayList;

public class NaiveBayes {
	
	//attributes
	Data input;
	
	//Constructor
	public NaiveBayes(Data input) {
		this.input = input;
	}
	
	ArrayList<Data> values = new ArrayList<Data>(100);
	
	
	//Calculate has_covid19 (Yes) probability
	double yesProbability()
	{
		double yesTotal = 0;
		for (int i = 0; i < values.size();i++) 
	      { 
			 if (values.get(i).hasCovid19 == "yes")
				 yesTotal++;
	      }
		
		return yesTotal / (double)values.size();
		
	}
	
	//////Calculate data ////
	//Calculate temperature probability
	double temperatureProbability ()
	{
		double tempTotal = 0;
		for (int i = 0; i< values.size(); i++)
		{
			if(values.get(i).temperature == input.temperature)
			{
				tempTotal++;
			}
		}
		return tempTotal / (double)values.size();
	}
	
	//Calculate aches probability
	double achesProbability()
	{
		double achesTotal = 0;
		for (int i = 0; i< values.size(); i++)
		{
			if(values.get(i).aches == input.aches)
			{
				achesTotal++;
			}
		}
		return achesTotal / (double)values.size();
	}
	
	//Calculate soreThroat probability
	double soreThroatProbability()
	{
		double soreThroatTotal = 0;
		for (int i = 0; i< values.size(); i++)
		{
			if(values.get(i).soreThroat == input.soreThroat)
			{
				soreThroatTotal++;
			}
		}
		return soreThroatTotal / (double)values.size();
	}
	
	//calculate dangerZone
	double dangerZoneProbability()
	{
		double dangerZoneTotal = 0;
		for (int i = 0; i< values.size(); i++)
		{
			if(values.get(i).dangerZone == input.dangerZone)
			{
				dangerZoneTotal++;
			}
		}
		return dangerZoneTotal / (double)values.size();
	}
	
	///
	
	

}
