package com.bhaskar.datatypes;

public class StringTest3 {
	
	public static void main(String[] args) {
		
		String s =" ";
		
		Integer x = 5;
		
		StringBuffer sb = new StringBuffer();
		
		if (x<15) {
			
			s.concat("javachamp");
		}else{
			
			sb.append("javachamp");
			
			System.out.println(s + sb);
		}
		
	}

}
