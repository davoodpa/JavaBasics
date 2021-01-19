package com.cloudchain.training;

public class Apple1 {

	public static void main(String[] args) 
	{
		double appleInKg = 2;
		appleCount(appleInKg);
		
		
	}
 static final double averageWeight = 250.00;
 static void appleCount(double a)
 {
	 double count = ( a * 1000)/ averageWeight ;
	 System.out.println("count of the apple : " + count);
 }
}
