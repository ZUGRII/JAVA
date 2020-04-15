/***********************
 * Object Oriented Programming Assignment
 * SUBJECT: 1.Machine learning model, using Naive Bayes
 * 
 * 
 * Author: Georgiana Zugravu
 * Student Number: C18768301
 * Start date: 6th April 2020
 * Due date: 20th April 2020
 * Coordinator : Susan McKeever 
********************/

package com.assignment;

public class Control {

	public static void main(String[] args) {
		Data input = new Data("hot", "no", "yes", "yes", "yes");
		NaiveBayes data = new NaiveBayes(input);
		System.out.println(data.calculateAll());
		                    
	}

}
