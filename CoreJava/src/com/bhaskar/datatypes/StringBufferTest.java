package com.bhaskar.datatypes;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("javachamp");
		
		StringBuffer sb1 = new StringBuffer(sb);
		
		if (sb.equals(sb1)) {
			System.out.println("true");
		}else{
			
			System.out.println("false");
		}
	}

}
