package com.albaycan.complexmathapp;

import java.util.ArrayList;

public class BasicMath {
	
	// creating integer arraylist variable
	private ArrayList<Integer> inputs;
	
	// creating constructor with arraylist argument
	public BasicMath(ArrayList<Integer> inputs) {
		this.inputs = inputs;
	}	
	
	// sum method
	public int add() {
		int result = 0;
		for(int i = 0; i < inputs.size(); i++)
		    result += inputs.get(i);
		return result;
	}
	// multiply method
	public int multiply() {		
		int result = 1;
		for(int i = 0; i < inputs.size(); i++)
		    result *= inputs.get(i);
		return result;
	}
	
}
