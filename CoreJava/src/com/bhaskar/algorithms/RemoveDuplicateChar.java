package com.bhaskar.algorithms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {
	
	
	public static void main(String[] args) {
		
		String s = "abacd";
		

		System.out.println(removeDuplicate(s));
	
	}
	
	public static String removeDuplicate(String str){
		
		Set<Character>set = new HashSet<Character>();
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) {
			
			Character cr = str.charAt(i);
			
			if (!set.contains(cr)) {
				
				set.add(cr);
				sb.append(cr);
			}
			
		}
		return sb.toString();
		
	}

}
