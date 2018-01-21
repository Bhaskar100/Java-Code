package com.bhaskar.generics;

 class Test1<E> {

	E[] ar;
	
	void print(){
		for (E e : ar) {
			
			System.out.println(e);
		}
	}
	
}
 public class Test{
	
	public static void main(String[] args) {
		
		Test1<Integer> ob1;
		
		Test1<Float> ob2;
		
		ob1=new Test1<Integer>();
		
		ob2=new Test1<Float>();
		
		ob1.ar=new Integer[2];
		
		ob1.ar[0]=1;
		
		ob1.ar[1]=2;
		
		ob2.ar= new Float[2];
		
		ob2.ar[0]=5.2f;
		
		ob2.ar[1]=7.2f;
		
		ob1.print();
		
		ob2.print();
	}
	
}