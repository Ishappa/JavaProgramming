package com ;
import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		Scanner ip=new Scanner(System.in);
		System.out.println("Please Enter the no");
		int n=ip.nextInt();
		if(n%2==0)
		{
			System.out.println("n is even no");
		}
		else
		{
			System.out.println("n is odd no");
		}
		System.out.println("Program Ended");
	}

}
