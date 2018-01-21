package com.bhaskar.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add("A");
		
		s.add(new Foo());
		
		Set t = new TreeSet();
		
		t.add("A");
		
		t.add(new Foo());
	}
}

class Foo{}

