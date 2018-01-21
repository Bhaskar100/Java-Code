package com.bhaskar.generics;

public class GenericsTest {

	public static void print(Integer[] ob) {

		for (Integer x : ob) {

			System.out.print(x);
		}
		
		System.out.println();
	}

	public static void printStrings(String[] obj) {

		for (String x1 : obj) {

			System.out.print(x1);
		}
		System.out.println();
	}

	public static void printChars(Character[] obc) {

		for (Character x2 : obc) {

			System.out.print(x2);
		}
		
		System.out.println();
	}

	public static void main(String[] args) {

		Integer i1[] = { 1, 5, 8, 6, 9, 3 };
		
		String s1[] ={"abc","xyz","mno","pqr","ghi"};
		
		Character c1 []={'a','e','i','o','u'}; 

		GenericsTest.print(i1);
		
		GenericsTest.printStrings(s1);
		
		GenericsTest.printChars(c1);

	}

}
