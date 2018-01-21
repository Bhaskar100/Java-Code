package com.bhaskar.algorithms;

import java.util.Arrays;

public class FindTheLargestNumber {
	
	public static void main(String[] args) {
		
	
	
	int []array ={1,2,5,8,3,6,10,101,85};
	
	Arrays.sort(array);
	
	System.out.println(array[array.length-1]);
	System.out.println(array[array.length-2]);
	System.out.println(array[array.length-3]);
	System.out.println(array[array.length-4]);
	
	}
}
