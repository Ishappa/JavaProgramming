package com;

public class Factorial {
	static int fact=1;
	public static int factorial(int n)
	{
		if(n>=1)
		{
			fact=fact*n;
			factorial(n-1);
			
		}
		return fact;
	
	}
	public static void main(String[] args) {
		
		System.out.println( factorial(5));
	} 

}