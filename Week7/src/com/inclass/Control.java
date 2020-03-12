package com.inclass;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {

		// to use FileProcessing to open a file "females.txt"
		FileProcessing file1 = new FileProcessing("females.txt");
		file1.openFile();
		System.out.println("\n"+file1.readToken());
		/* or String tokenRead = file1.readToken();
		 * System.ou.println("\n tokenRead");
		 */
		System.out.println("\n"+file1.readToken());

		file1.writeSomething("text");
	}

}
