package com.bhaskar.generics;

interface Calc<E>
{	
	E opr(E a,E b);	
}
class Add implements Calc<Double>
{
	@Override
	public Double opr(Double a, Double b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}
public class GenericInterFaceTest {
	
	public static void main(String[] args) {
	
	Add ad = new Add();
	
	Double sum =ad.opr(5.5, 4.5);

	System.out.println(sum);
	
	}
}
