package com.bhaskar.algorithms;

public class PrintNumbersWithoutLoop {
	
	
	public static void printNumbers(int n){
		if(n<=10){
		System.out.println(n);
		
		printNumbers(n+1);
		
		}
	}

	public static void main(String[] args) {
		
		printNumbers(1);
		
		
	}
	
}
