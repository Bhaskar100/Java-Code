package com.bhaskar.datatypes;

public class BooleanTest {
	
	public static void main(String[] args) {
		 
		boolean  stmt1 ="champ"=="champ";
		
		boolean stmt2 = new String("champ")=="champ";
		
		boolean stmt3 = new String("champ")== new String("champ");
		
		System.out.println(stmt1 && stmt2 || stmt3);
		
	}

}
