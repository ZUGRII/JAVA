package com.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	
	String fileName;
	File fileExample;
	Scanner scan;
	
	// Constructor
	FileManager (String fileName)
	{
		
		this.fileName = fileName;
		
	}
	
	// get a connection to the file
	void connectToFile()
	{
		fileExample = new File(fileName);
	}

	@SuppressWarnings("finally")
	// Read the file, returning a string of lines
    ArrayList<Data> readFile()
    {
    
    	ArrayList<Data> values = new ArrayList<Data>(100);
    	
    	
	    try
		{
	    	scan = new Scanner(fileExample); 
			 while (scan.hasNextLine())
			    {
				 values.add(new Data(scan.next(), scan.next(), scan.next(), scan.next(), scan.next()));
			    }
		}
		catch (FileNotFoundException e)
		{
			System.out.println("run time error " + e.getMessage());
		}
	    finally
	    {
	    	System.out.println(values);
	        return values;
	    }
    }

}
