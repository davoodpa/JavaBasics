package com.cloudchain.training;

public class Hotel {

	public static void main(String[] args) {
		int countCurry = 1;
		int countparota = 5;
		total(countCurry, countparota);
	}
   static final double chickenCurry = 150.00;
   static final double parota = 12.00;
   static void total(int a, int b )
   {
	double totalAmount = (chickenCurry * a ) + ( parota * b);
	System.out.println("Chicken Curry : " + (chickenCurry * a));
	System.out.println("parota        : " + (parota * b ));
	System.out.println("Total         : " + totalAmount);
	
   }
}
