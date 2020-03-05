/*GUI Game using random API
 * generate a random number between 0 and 100 and the user has to guess it
 * the program counts the number of guesses
 * it contains error checking for letters and numbers outside the range
 * Author: Georgiana Zugravu
 * Date: 27th February 2020
 * Compiler: Eclipse
 * Lecturer: Susan McKeever 
 */
 
package com.lab6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game  extends JFrame implements ActionListener, MouseListener {

	//attributes
	private int random;
	private int numberOfGuesses;
	JButton generate;
	JButton check;
	JLabel label1;
	JTextField guess;
	JPanel centrePanel, southPanel, northPanel, westPanel, eastPanel;
	
	//constructor
	public Game(String myTitle) {
		
		super(myTitle);
		setSize(300,300);
		
		//use BorderLayout
		setLayout(new BorderLayout());
		
		//create the objects
		generate	= new JButton("Generate the random number");
		check 		= new JButton("Check your guess");
		label1 		= new JLabel("Then make a guess.."); 
		guess		= new JTextField("Enter your Guess");
		
		//set up the panels
		centrePanel = new JPanel(); 
		southPanel  =  new JPanel();
		northPanel  = new JPanel();
		westPanel	= new JPanel();
		eastPanel = new JPanel();
		
		//adding the "objects" on the panel
		northPanel.add(generate);
		westPanel.add(label1);
		eastPanel.add(guess);
		southPanel.add(check);
		
		//add the objects to the panel
		add(eastPanel, BorderLayout.EAST);
		add(westPanel, BorderLayout.WEST);
		add(northPanel, BorderLayout.NORTH);
		add(centrePanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		//and the objects to the Listeners
		check.addActionListener(this);
		guess.addActionListener(this);
		generate.addActionListener(this);
		guess.addMouseListener(this);
		
		setVisible(true);
		
	}//end constructor

	
	 @Override
	public void actionPerformed(ActionEvent event) {
		
		//GENERATE EVENT
		if(event.getSource() == generate)
		{
			Random randomgen = new Random();
			random = randomgen.nextInt(100);
			numberOfGuesses = 0;
			
			JOptionPane.showMessageDialog(this, "New number generated. ");
			System.out.println("\n Random: "+random);
		}//end if the event is generate
		
		
		//CHECK EVENT
		if(event.getSource() ==check)
		{
			numberOfGuesses++;
			
			try{
				
				if(Integer.valueOf(guess.getText()) == random)
				{
					JOptionPane.showMessageDialog(this, "Well done! You guess of " +guess.getText() + 
							" is equal to " +  random + " and it took you " + numberOfGuesses +
							" guesses.");
				}//end good guess
				else if (Integer.valueOf(guess.getText()) < random)
				{
					//check if the input is less than 0
					if(Integer.valueOf(guess.getText()) < 0)
					{
						JOptionPane.showMessageDialog(this, "The number is less than 0. Please insert only numbers between 0 and 100. ");
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Your guess of " + guess.getText()+ " is too low. Guess again.");
					}
				}//end lower value
				else if (Integer.valueOf(guess.getText()) > random)
				{
					//check if the number is greater than 100
					if(Integer.valueOf(guess.getText()) > 100)
					{
						JOptionPane.showMessageDialog(this, " The number is greater than 100. Please insert only numbers between 0 and 100. ");
					}
					else
					{
						JOptionPane.showMessageDialog(this, "Your guess of "+ guess.getText() + " is too hight. Guess again.");
					}
				}//end greater value
			}//end try
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(this, "This is not an integer. Please insert a number between 0 and 100 ");
			}//end catch
		}//end if event check
			
	}//end actionPerformed method


	@Override
	public void mouseClicked(MouseEvent event) {
		//when mouse clicked  
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}//end Game class
