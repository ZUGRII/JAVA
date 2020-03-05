/**First Java GUI lab using JFrames and JBuuton, JLabel, JTextField and the Listeners
 * Author: Georgiana Zugravu
 * Date: 27th February 2020
 * Compiler: Eclipse
 * Lecturer: Susan McKeever 
 */
package com.lab5;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Screen extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

	//attributes 
	JLabel process, select, process2;
	JRadioButton p1, p2;
    JButton cancel, ok;
	JTextField name;
	JPanel centrePanel, northPanel, southPanel, westPanel, eastPanel;
	
	//constructor
	public Screen(String myTitle) {
		super(myTitle);
		setSize(400,400);
		
		//use BorderLayout
		setLayout(new BorderLayout());
		
		//create the objects
		p1		= new JRadioButton("process 1");
		p2		= new JRadioButton("process 2");
		select	= new JLabel("Select a process:");
		name	= new JTextField("Enter your name");
		process	= new JLabel("Would you like to run the process?");
		ok 		= new JButton("Run the process");
		cancel 	= new JButton("Cancel the process");
		
		//set up the panels
		centrePanel = new JPanel(); 
		southPanel  =  new JPanel();
		northPanel  = new JPanel();
		westPanel	= new JPanel();
		eastPanel = new JPanel();
		
		//attach the listener to the button
		name.addActionListener(this);
		cancel.addActionListener(this);
		ok.addActionListener(this);
		p1.addActionListener(this);
		p2.addActionListener(this);
		centrePanel.addMouseListener(this);
		westPanel.addMouseListener(this);
		eastPanel.addMouseListener(this);
		//name.addMouseMotionListener(this);
		
		//northPanel.add(name);
		northPanel.add(name);
		northPanel.add(select);
		southPanel.add(cancel);
		southPanel.add(ok);
		westPanel.add(p1);
		eastPanel.add(p2);
		centrePanel.add(process);
		
		centrePanel.setBackground(Color.red);
		
		add(eastPanel, BorderLayout.EAST);
		add(westPanel, BorderLayout.WEST);
		add(northPanel, BorderLayout.NORTH);
		add(centrePanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
		
	}//end method
	
	
	//event handler
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == name)
		{
			JOptionPane.showMessageDialog(this, "Hello " + name.getText() + "!");
		}
		
		if(event.getSource() == p1)
		{
			JOptionPane.showMessageDialog(this, "You choise is process 1.");
		}
		else if(event.getSource() == p2)
		{
			JOptionPane.showMessageDialog(this, "You choise is  process 2.");
		}
		
		
		if (event.getSource() == cancel)
		{
			//if statement is not working
			//this will display a pop up 
			JOptionPane.showMessageDialog(this, "The process was canceled");
		}
		else if (event.getSource() == ok)	
		{
			JOptionPane.showMessageDialog(this, "The process is running");
		}
		
	}//end actionPerformed

	
	//MOUSELISTENER
	@Override
	public void mouseClicked(MouseEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == centrePanel)
		{
			if(event.getButton() == MouseEvent.BUTTON1)
				JOptionPane.showMessageDialog(this, "You clicked the panel with the left button.");
			else if (event.getButton() == MouseEvent.BUTTON3)
				JOptionPane.showMessageDialog(this, "You clicked the panel with the right button.");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent event) {
		
		if(event.getSource() == westPanel)
		{
			JOptionPane.showMessageDialog(this, "You entered the panel");
		}
	}

	@Override
	public void mouseExited(MouseEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == eastPanel)
		{
			JOptionPane.showMessageDialog(this, "You left the panel");
		}
	}


	//MouseMotionListener
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//try to create a pop up when the mouse is moved over the name box
	@Override
	public void mouseMoved(MouseEvent event) {
		// TODO Auto-generated method stub
	
	}

}
