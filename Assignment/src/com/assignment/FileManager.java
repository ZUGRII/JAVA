/* FileManager Class 
 * 
 * Author: Georgiana Zugravu
 * Student Number: C18768301
 * Start date: 6th April 2020
 * Due date: 20th April 2020
 * Coordinator : Susan McKeever 
 */
package com.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	
	//attributes
	private String fileName;
	private File fileExample;
	private Scanner scan;
	
	// Constructor
	FileManager (String fileName)
	{
		
		this.fileName = fileName;
		connectToFile();
	}
	
	
	// get a connection to the file
	void connectToFile()
	{
		fileExample = new File(fileName);
	}
	
	
	// Read the file, returning a string of lines
    @SuppressWarnings("finally")
	ArrayList<Data> readFile()
    {
    
    	ArrayList<Data> values = new ArrayList<Data>(100);
    	
	    try
		{
	    	scan = new Scanner(fileExample); 
			 while (scan.hasNextLine())
			    {
				 values.add(new Data(scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()));
			    }
		}//end try
		catch (FileNotFoundException e)
		{
			System.out.println("run time error " + e.getMessage());
		}//end catch
	    finally
	    {
	      
	        return values;
	    }//end finally
	    
    }//end readFile()

}//end class FileManager
