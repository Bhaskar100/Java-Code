package com.bhaskar.algorithms;

public class FindTheMissingnumber {
	
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6};
		
		int missing =getMissingNum(arr,6);
		
		System.out.print("The Missing Number is " + missing);
	}

	private static int getMissingNum(int [] arr,int n) {
		
		int expected =(n*(n+1)/2);
		
		int total =0;
		
		for (int i : arr) {
			
			total =total+i;
		}
		
		return total-expected;
	}

}
