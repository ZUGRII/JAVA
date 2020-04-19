package com.assignment;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interface extends JFrame implements ActionListener {
	
	//attributes
	//JButton temperature;
	String t, ac="no", c="no", sT="no", dZ="no";
	JButton test, testAccuracy; 
	JCheckBox aches, cough, soreThroat, dangerZone;
	JLabel welcome, temperature;
	JPanel centrePanel, northPanel, southPanel, westPanel, eastPanel;
	JComboBox<String> temp; 
	
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
		temp		 = new JComboBox<String>();
		temp.addItem("Cold");
		temp.addItem("Cool");
		temp.addItem("Normal");
		temp.addItem("Hot");
		
		
		//set up the panels
		centrePanel = new JPanel(); 
		southPanel  =  new JPanel();
		northPanel  = new JPanel();
		westPanel	= new JPanel();
		eastPanel 	= new JPanel();
		
		
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
		
		add(eastPanel, BorderLayout.EAST);
		add(westPanel, BorderLayout.WEST);
		add(northPanel, BorderLayout.NORTH);
		add(centrePanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
		//setVisible(false);
		
		System.out.println("a: "+ac+ " c: "+c+" sT: "+sT+" dZ: "+dZ+" t: "+t);

		
	}//end constructor
	
	
	

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == aches)
		{
			if( ac == "no")
				ac="yes";
			else
				ac="no";
		}
		if(event.getSource() == cough)
		{
			if( c == "no")
				c="yes";
			else
				c="no";
			
		}
		if(event.getSource() == soreThroat)
		{
			if( sT == "no")
				sT="yes";
			else
				sT="no";
		}
		if(event.getSource() == dangerZone)
		{
			if( dZ == "no")
				dZ="yes";
			else
				dZ="no";
			
		}
		if(event.getSource() == temp)
		{
			t = (String) temp.getSelectedItem();
			
		}
		if(event.getSource() == test)
		{
			System.out.println("a: "+ac+ " c: "+c+" sT: "+sT+" dZ: "+dZ+" t: "+t);
			Data input = new Data(t.toLowerCase(),ac,c,sT,dZ);
			NaiveBayes data = new NaiveBayes(input);
			String covid = data.calculateAll();
			JOptionPane.showMessageDialog(this, "You have "+covid+"chances of having COVID-19");
			System.out.println("You have "+covid+"chances of having COVID-19");
			//System.out.println(data.toString());
		}
		if(event.getSource() == testAccuracy)
		{
			
		}
		
	}
	
}
