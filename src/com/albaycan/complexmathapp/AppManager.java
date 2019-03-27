package com.albaycan.complexmathapp;

import java.util.ArrayList;
import java.util.Scanner;

public class AppManager {
	
	public static void main(String[] args) {		
	
	System.out.println("===============================");
	System.out.println("***********Welcome*************");
	System.out.printf("===============================");
	
	Scanner input = new Scanner(System.in);
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	    
	String moreNumberChoice;
	int numOfEntry = 1;
	
	// collecting numbers and filling the arraylist
	do {
		System.out.printf("%nPlease enter number %d:", numOfEntry++).println();
		numbers.add(input.nextInt());
		
		System.out.println("Would you like to add more numbers? (y) or (n)");
		moreNumberChoice = input.next();
		
	} while (moreNumberChoice.equals("y"));
	
	
	String continueCalculation;
	
	do {			
			// Display Menu
			System.out.println(menuText());
			
			// Print calculation 
			int selectCalculation = input.nextInt();
			System.out.println(getResult(numbers, selectCalculation));

			System.out.println("Press A to go back to menu or Ctrl+C to exit.");
			continueCalculation = input.next();
			
	} while (continueCalculation.equals("A"));  
	
	}
	
	private static String menuText() {
		StringBuilder sb = new StringBuilder();
		sb.append("What would you like to do now?\n");
		sb.append("(1) Sum\n");
		sb.append("(2) Multiply\n");
		sb.append("Press Ctrl+C to exit.\n");
		
		return sb.toString();
	}
	
	private static String getResult(ArrayList<Integer> numbers, int selectCalculation) {
		BasicMath bm = new BasicMath(numbers);
		
		switch (selectCalculation) {
		case 1:
			return String.format("Result is %d", bm.add());
		case 2:
			return String.format("Result is %d", bm.multiply());
		}	
		
		return null;
	}
	
}
