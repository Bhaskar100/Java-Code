package com.bhaskar.datatypes;

public class StringBufferTest2 {
	
	public static void main(String[] args) {
		
		String str = "java";
		
		StringBuffer sb = new StringBuffer("javachamp");
		
		sb.insert(9, ".com");
		
		str.concat("champ");
		
		if(sb.length()<6||str.equals("javachamp")){
			
			System.out.println(sb);
		}
		
		sb.delete(2, 7);
		
		System.out.println(sb);
	}

}
