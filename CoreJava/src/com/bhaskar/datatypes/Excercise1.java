package com.bhaskar.datatypes;

import java.util.Scanner;

public class Excercise1 {
	
	public static void main(String[] args) {
		
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Input a degree in fahrenheit");
	
	double fahreheit = input.nextDouble();
	
	double celsius = ((5*(fahreheit-32.0))/9.0);
	
	System.out.println(fahreheit + "degree Fahrenheit is equal to " +celsius + "in celsius");
	
	}
}
