package com;

public class Recursion { 
	static int sum=0;
	public static int add(int n)
	{
		if(n>=1)
		{
			sum=sum+n;
			add(n-1);
		}
		return sum;
	}
	public static void main(String[] args) {
		
		add(5);
		System.out.println(sum);
//		System.out.println(add(5));
	}
}
