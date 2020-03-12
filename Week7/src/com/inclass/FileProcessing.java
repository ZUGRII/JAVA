package com.inclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileProcessing {
	
	//Attributes
	private String fileName;
	private File actualFile;
	Scanner myScanner;
	PrintWriter myWrite;
	
	//Constructor
	public FileProcessing(String fileName)
	{
		setFileName(fileName);
		
	}
	
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
	
	public void openFile ()
	{
		actualFile = new File (fileName);
	}
	
	//method to read the next token from the file (i.e. piece of text)
	public String readToken()
	{
		String token = "";
		
		try 
		{
			myScanner = new Scanner(actualFile);
			token = myScanner.next();
			myScanner.close();
		} 
		catch (FileNotFoundException e) 
		{
			
			System.out.println("Couldn't find the file ");
			e.printStackTrace();
		}
		return token;

	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
