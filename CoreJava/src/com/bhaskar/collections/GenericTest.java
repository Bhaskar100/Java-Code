package com.bhaskar.collections;

public class GenericTest<T extends Number> {
	
	void add(T a, T b){
		
		double c=a.doubleValue()+b.doubleValue();
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		GenericTest<Integer> t1 = new GenericTest<Integer>();
		
		GenericTest<Float> t2 = new GenericTest<Float>();
		
		GenericTest<Double> t3 = new GenericTest<Double>();
	
		t1.add(5, 5);
		
		t2.add(4.5f, 5.5f);

		t3.add(5.5, 4.5);
		
	}

}
