package com.bhaskar.collections;

import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		
		TreeMap<Integer , String> map = new TreeMap<Integer , String>();
		
		map.put(1, "one");
		
		map.put(2, "two");
		
		map.put(3, "three");
		
		map.put(4, "four");
		
		System.out.println(map.higherKey(2));
		System.out.println(map.ceilingKey(2));
		System.out.println(map.floorKey(1));
		System.out.println(map.lowerKey(1));
	}
	
}
