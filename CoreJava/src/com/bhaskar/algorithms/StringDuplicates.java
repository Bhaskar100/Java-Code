package com.bhaskar.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringDuplicates {
	
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	
	String st = sc.nextLine();
	
	String[] sg = st.split("\\s+");
	int count =0;
	ArrayList<String> al = new ArrayList<String>();
	
	for (String string : sg) {
		
		al.add(string);
		
	}
	
	System.out.println(al);
	
	
	Set<String> se = new HashSet<String>();
	
	for (String string : al) {
		
		if (se.add(string)==false) {
			
			System.out.println(string);
			
			count++;
			
		}
		
	}
	
	System.out.println(count);
	
	}
}
