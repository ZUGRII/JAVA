package com.lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileProcessor {
	
	//attributes
	private String fileName;
	private File actualFile;
	private Scanner scan;
	private String role;
    private	String token = "";
    private PrintWriter myWrite; 
	
	
	//Constructor
	public FileProcessor(String fileName)
	{
		this.fileName = fileName;

	}//end constructor
	

	//Open the file
	public void openFile ()
	{
		actualFile = new File (fileName);
		
	}//end open the file method

	//Read the File
	public boolean readFile(String role)
	{
		int trueCheck=0;
		
		try 
		{
			scan = new Scanner(actualFile);
			scan.useDelimiter(",");
		}//end try
		catch (FileNotFoundException e) 
		{
			
			System.out.println("Couldn't find the file ");
			e.printStackTrace();
		}//end catch
		
		
		while(scan.hasNextLine()) 
		{
			token = scan.nextLine();
			if (role.equals(token))
			{
				System.out.println("\nRole "+role+" is same as token "+token);
				trueCheck ++;
			}
			else
			{
				System.out.println("\nRole "+role+" isn't same as token "+token);
				 
			}
		}
		
		if(trueCheck > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}//end read the file
	
	public void writeSomething(String textToWrite)
	{
		try {
			myWrite = new PrintWriter(actualFile);
			myWrite.write(textToWrite);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//GETTERS and SETTERS
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}//end FileProcessors
