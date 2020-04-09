package com.assignment;

import java.io.File;
import java.io.FileNotFoundException;
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
    String[] readFile()
    {
    
    	String[] values = new String[76];
    	String[] temperature	= new String[76];
    	String[] aches 			= new String[76];
    	String[] cough 			= new String[76];
    	String[] sore_throat 	= new String[76];
    	String[] danger_zone 	= new String[76];
    	String[] has_covid19	= new String[76];
    	
	    try
		{
	    	int i = 0;
	    	scan = new Scanner(fileExample); 
			 while (scan.hasNextLine())
			    {
			      
				 temperature[i] = scan.next();
				 aches[i] 		= scan.next();
				 cough[i] 		= scan.next();
				 sore_throat[i] = scan.next();
				 danger_zone[i] = scan.next();
				 has_covid19[i] = scan.next();
			      i++;
			    }
		}
		catch (FileNotFoundException e)
		{
			System.out.println("run time error " + e.getMessage());
		}
	    finally
	    {
	    	System.out.println(danger_zone);
	        return values;
	    }
    }

}
