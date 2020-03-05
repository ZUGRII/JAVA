
package com.inclass;
//import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFirstScreen extends JFrame implements ActionListener{
	
	//attributes  = usually the components that you'll have on the screen
	
	JLabel label1, topLabel;
	JButton button1, button2;
	JPanel centrePanel, southPanel, northPanel;
	
	//constructor
	public MyFirstScreen(String myTitle) 
	{	
		super(myTitle);
		setSize(250,250);
		
		setLayout(new BorderLayout());
		
		label1	= new JLabel ("Java screen building");
		topLabel= new JLabel("Top North of the screen");
		button1	= new JButton("Click me");
		button2	= new JButton("Then me");
		
		//attach the listener to the button
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		//set up the panels
		centrePanel = new JPanel(); 
		southPanel  =  new JPanel();
		northPanel  = new JPanel();
		
		centrePanel.add(label1);
		southPanel.add(button1);
		southPanel.add(button2);
		northPanel.add(topLabel);
		
		//add(label1, BorderLayout.CENTER);
		//add(button1, BorderLayout.SOUTH);
		
		//nothing would appear without these lines
		add(northPanel, BorderLayout.NORTH);
		add(centrePanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		
		
	}//ende MyFirstScreen


	//this is an example of an eventhandler
	//you don't have to call this directly, the system does
	
	@Override
	public void actionPerformed(ActionEvent myEvent) 
	{
		// TODO Auto-generated method stub
		if (myEvent.getSource() == button1)
		{
			//this will display a pop up 
			JOptionPane.showMessageDialog(this, "The button 1 click worked.");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "The button 2 click worked.");
		}
		
		
	}

}
