package com.bhaskar.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	
	public static void main(String[] args) {
		
		String [] arr = {"java" ,"champ"," . "};
		
		List<String> list = (List<String>)Arrays.asList(arr);
				
				//ArrayList<String>(Arrays.asList(arr));
		
		arr[2]=".com";
		
		for (String word : list) {
			
			System.out.println(word);
			
		}
		
	}
	
}
