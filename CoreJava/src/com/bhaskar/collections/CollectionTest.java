package com.bhaskar.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		List<Integer> aob;
		
		aob= new ArrayList<>();
		
		aob.add(22);
		aob.add(11);
		aob.add(44);
		aob.add(22);
		aob.add(33);
		aob.add(55);
		
		List<Integer> vob ;
		
		vob = new Vector<>();
		
		vob.addAll(aob);
		
		Set<Integer> hob;
		
		hob = new HashSet<>();
		
		hob.addAll(aob);
		
		Set<Integer> lob ;
		
		lob = new LinkedHashSet<>();
		
		lob.addAll(aob);
		
		Set<Integer> tob;
		
		tob = new TreeSet<>();
		
		tob.addAll(aob);
		
		System.out.println(" ARR - LIST : " + aob);
		
		System.out.println(" VEC - LIST : " + vob);
		
		System.out.println(" HAS - SET  : " + hob);
		
		System.out.println(" LHS - SET  : " + lob);
		
		System.out.println(" TES - SET  : " + tob);
		
		}

}
