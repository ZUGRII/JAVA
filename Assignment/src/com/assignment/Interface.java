/* Interface Class 
 * 
 * Author: Georgiana Zugravu
 * Student Number: C18768301
 * Start date: 6th April 2020
 * Due date: 20th April 2020
 * Coordinator : Susan McKeever 
 */
package com.assignment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interface extends JFrame implements ActionListener {
	
	//attributes
	private String t="cold", ac="no", c="no", sT="no", dZ="no";
	private JButton test, testAccuracy; 
	private JCheckBox aches, cough, soreThroat, dangerZone;
	private JLabel welcome, temperature;
	private JPanel centrePanel, northPanel, southPanel;
	private JComboBox<String> temp; 
	
	DecimalFormat df = new DecimalFormat("#.##"); 
	
	//Constructor
	public Interface (String myTitle) {
		super(myTitle);
		setSize(400,300);
		
		//use BorderLayout
		setLayout(new BorderLayout());
		
		//create the objects
		test 		= new JButton("Test symptoms");
		testAccuracy= new JButton("Test accuracy");
		welcome		= new JLabel("Which of the following symptoms do you have?");
		temperature	= new JLabel("Temperature:");
		aches		= new JCheckBox("Aches");
		cough		= new JCheckBox("Cough");
		soreThroat	= new JCheckBox("Sore Throat");
		dangerZone	= new JCheckBox("Danger Zone");
		
		//create ComboBox
		temp = new JComboBox<String>();
		temp.addItem("Cold");
		temp.addItem("Cool");
		temp.addItem("Normal");
		temp.addItem("Hot");
		
		
		//set up the panels
		centrePanel = new JPanel(); 
		southPanel  = new JPanel();
		northPanel  = new JPanel();
		
		//interface color
		northPanel.setBackground(new Color(255,206,91));
		southPanel.setBackground(new Color(255,206,91));
		centrePanel.setBackground(Color.white);
		aches.setBackground(Color.white);
		cough.setBackground(Color.white);
		soreThroat.setBackground(Color.white);
		dangerZone.setBackground(Color.white);
		test.setBackground(new Color(206,178,255));
		testAccuracy.setBackground(new Color(206,178,255));
		temp.setBackground(new Color(242,219,255));
		
		//attach the listener to the button
		aches.addActionListener(this);
		cough.addActionListener(this);
		soreThroat.addActionListener(this);
		dangerZone.addActionListener(this);
		temp.addActionListener(this);
		test.addActionListener(this);
		testAccuracy.addActionListener(this);
		
		//add the objects to the panels
		northPanel.add(welcome);
		centrePanel.add(aches);
		centrePanel.add(cough);
		centrePanel.add(soreThroat);
		centrePanel.add(dangerZone);
		centrePanel.add(temperature);
		centrePanel.add(temp);
		southPanel.add(test);
		southPanel.add(testAccuracy);
		
		
		add(northPanel, BorderLayout.NORTH);
		add(centrePanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
				
	}//end constructor
	
	
	//actionPerformed method
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == aches){
			if( ac == "no")
				ac="yes";
			else
				ac="no";
		}//end for aches event
		
		if(event.getSource() == cough){
			if( c == "no")
				c="yes";
			else
				c="no";
		}//end for cough event
		
		if(event.getSource() == soreThroat){
			if( sT == "no")
				sT="yes";
			else
				sT="no";
		}//end for soreTroat event
		
		if(event.getSource() == dangerZone){
			if( dZ == "no")
				dZ="yes";
			else
				dZ="no";
		}//end for dangerZone event
		
		if(event.getSource() == temp){
			t = (String) temp.getSelectedItem();
		}//end for temp event
		
		if(event.getSource() == test){
			
			//create new object based on user input
			Data input = new Data(t.toLowerCase(),ac,c,sT,dZ);
			
			//read the file
			ArrayList<Data> values = new ArrayList<Data>(100);
			FileManager myFile = new FileManager("MLdata.txt");
			values = myFile.readFile();
			
			//calculate the prediction
			NaiveBayes data = new NaiveBayes(input, values);
			
			//display the diagnose
			JOptionPane.showMessageDialog(this, "You have "+ df.format(data.calculateAll())+"% chances of having COVID-19");
		}//end for test event
		
		if(event.getSource() == testAccuracy){
			//create new object for TrainingTesting
			TrainingTesting test = new TrainingTesting();
			
			//display the accuracy
			JOptionPane.showMessageDialog(this, "The program has  "+df.format(test.testAccuracy())+"% accuracy.");
		}//end for testAccuracy event
		
	}//end actionPerformed method
	
}//end Interface class
