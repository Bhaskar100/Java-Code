package com.bhaskar.algorithms;

import java.util.*;

public class CharDuplicates {
	
	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	String st= sc.nextLine();
	
	char ch[] = st.toCharArray();
	
	List<Character> al = new ArrayList<Character>();
	
	for (Character character : ch) {
		
		al.add(character);
		
	}
	
	Set<Character> se = new TreeSet<Character>();
	
	for (Character character : al) {
		
		
		if (se.add(character)==false) {

			System.out.print(character);
		}		
	}
}
}