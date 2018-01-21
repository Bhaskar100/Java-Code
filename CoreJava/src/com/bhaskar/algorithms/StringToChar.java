package com.bhaskar.algorithms;

import java.util.Scanner;

public class StringToChar {

	
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char ch[] =str.toCharArray();
		
		char c='y';
		
		
		for (int i = 0; i < ch.length; i++) {
			
			if(c==ch[i]){
				
				System.out.print(ch[i]);
			}
			
		}
	}
	
	
}
