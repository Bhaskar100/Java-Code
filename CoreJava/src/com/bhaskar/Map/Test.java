package com.bhaskar.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		Map m = new TreeMap();

		m.put(1001, "abc");
		m.put(1002, "raj");
		m.put(1003, "ram");
		m.put(1004, "man");
		m.put(1005, "hari");
		m.put(1005, "abc");

		Set<Map.Entry> s = m.entrySet();

		System.out.println("TreeMap implementations");
		
		for (Map.Entry e : s) {

			System.out.println(" K : " + e.getKey());

			System.out.println(" V : " + e.getValue());

			System.out.println("--------------------");
		}

		System.out.println();
		
		Map m1 = new LinkedHashMap();

		m1.put(1001, "abc");
		m1.put(1004, "man");
		m1.put(1002, "raj");
		m1.put(1005, "hari");
		m1.put(1003, "ram");
		m1.put(1005, "abc");
		

		Set<Map.Entry> s1 = m1.entrySet();

		System.out.println(" LinkedHashMap Implementions ");
		
		for (Map.Entry e1 : s1) {

			System.out.println(" K : " + e1.getKey());

			System.out.println(" V : " + e1.getValue());

			System.out.println("--------------------");
		}
		
		System.out.println();
	
		
		Map m2 = new HashMap();

		m2.put(1001, "abc");
		m2.put(1004, "man");
		m2.put(1002, "raj");
		m2.put(1005, "hari");
		m2.put(1003, "ram");
		m2.put(1005, "abc");
		

		Set<Map.Entry> s2 = m2.entrySet();

		System.out.println(" HashMap Implementions ");
		
		for (Map.Entry e2 : s2) {

			System.out.println(" K : " + e2.getKey());

			System.out.println(" V : " + e2.getValue());

			System.out.println("--------------------");
		}
		
		System.out.println();
		
	}

	}
