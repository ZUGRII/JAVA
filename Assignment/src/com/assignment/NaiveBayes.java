package com.assignment;

import java.util.ArrayList;

public class NaiveBayes {
	
	//attributes
	Data input;
	ArrayList<Data> values;
	
	//Constructor
	public NaiveBayes(Data input) {
		this.input = input;
		values = new ArrayList<Data>(100);
		FileManager myFile = new FileManager("MLdata.txt");
		myFile.connectToFile();
		values = myFile.readFile();
	}
	
	
	//Calculate has_covid19 (Yes) probability
	double yesProbability()
	{
		double yesTotal = 0;
		for (int i = 0; i < values.size();i++) 
	      { 
			 if (values.get(i).hasCovid19.equals("yes"))
				 yesTotal++;
	      }
		return yesTotal /values.size();
		
	}
	
	//////Calculate data ////
	double dataProbability()
	{
		double temp = 0;
		double aches = 0;
		double cough = 0;
		double soreT = 0;
		double dangerZ = 0;
		
		for (int i = 0; i< values.size(); i++)
		{
			if(values.get(i).temperature.equals(input.temperature))
			{
				temp++;
			}
			if(values.get(i).aches.equals(input.aches))
			{
				aches++;
			}
			if(values.get(i).cough.equals(input.cough))
			{
				cough++;
			}
			if(values.get(i).soreThroat.equals(input.soreThroat))
			{
				soreT++;
			}
			if(values.get(i).dangerZone.equals(input.dangerZone))
			{
				dangerZ++;
			}
		}
		return (temp/values.size())*(aches/values.size())*(cough/values.size())*(soreT/values.size())*(dangerZ/values.size());
		
	}
	
	
	
	//////Calculate for each if covid19 = yes
	double ifyesProbability()
	{
		double temp = 0;
		double aches = 0;
		double cough = 0;
		double soreT = 0;
		double dangerZ = 0;
		double yesTotal = 0;
		
		for (int i = 0; i< values.size(); i++)
		{
			if(values.get(i).hasCovid19.equals("yes"))
			{
				yesTotal++;
				if(values.get(i).temperature.equals(input.temperature))
				{
					temp++;
				}
				if(values.get(i).aches.equals(input.aches))
				{
					aches++;
				}
				if(values.get(i).cough.equals(input.cough))
				{
					cough++;
				}
				if(values.get(i).soreThroat.equals(input.soreThroat))
				{
					soreT++;
				}
				if(values.get(i).dangerZone.equals(input.dangerZone))
				{
					dangerZ++;
				}	
			}
		}
		return (temp/yesTotal)*(aches/yesTotal)*(cough/yesTotal)*(soreT/yesTotal)*(dangerZ/yesTotal);
	}
	
	//calculate all
	double calculateAll()
	{
		return ifyesProbability()*+yesProbability()/dataProbability();
	}

}
