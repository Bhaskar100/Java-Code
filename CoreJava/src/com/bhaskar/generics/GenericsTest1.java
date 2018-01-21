package com.bhaskar.generics;

public class GenericsTest1 {
	
	public static <E> void print(E[] ob){
		
		for (E e : ob) {
			
			System.out.print(e);
		}

		System.out.println();
	}
	public static void main(String[] args) {
		
		Integer  i1 []  ={1,8,3,9,6,7};
		
		String s1[] ={"abc","def","xyz","pqrs","mno"};
		
		Character c1[] ={'a','e','i','o','u'};
		
		print(i1);
		
		print(s1);
		
		print(c1);
	}
}
