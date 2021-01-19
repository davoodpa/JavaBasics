package com.cloudchain.training;

public class Account {

	public static void main(String[] args) {
		int accountNumber =123;
		String name = "ajay";
		double openingBalance = 1000.00;
		printAccountDetails(accountNumber, name, openingBalance);
		deposit(openingBalance);
		withdraw(openingBalance);
		printBalance(openingBalance);
		
	}
	static void printAccountDetails(int a , String b , double c )
	{
		System.out.println("Name of the account holder : " +b);
		System.out.println("Account number : " +a);
		
		
	}
   static void deposit(double amount)
    {
    	 double depositamount = 1000;
    	 amount = amount + depositamount;
    	 System.out.println("the balance : " +amount);
    	
    }
   static void withdraw(double amount)
   {
   	 double withdrawamount = 500;
   	 amount = amount - withdrawamount ;
   	 System.out.println("the balance : " + amount);
   	
   }
   static void printBalance(double amount)
   {
	   System.out.println("the balance : " + amount);
   }
}
