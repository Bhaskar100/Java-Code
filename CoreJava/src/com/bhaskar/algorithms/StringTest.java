package com.bhaskar.algorithms;

import java.util.StringTokenizer;

public class StringTest {
	
	public static void main(String[] args) {
		
	
	
	String s1 = "this is capgemini";
	
	
	StringTokenizer st = new StringTokenizer(s1);
	
	StringBuffer sb = new StringBuffer(s1);
	
	
	
	
			
	
	for(int i=0;i<=2;i++){
		
		System.out.println(st.nextToken());		
	}
	
	System.out.println(sb.reverse());


	
	
	
	}
	
	

}
