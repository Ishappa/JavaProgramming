package com;
import java.util.Scanner;
public class demo4 {
	
	//Program for the Factor of n number = The n no is divisible by the which those numbers
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the number");
		 int n=ip.nextInt();
		 
		  for(int i=1;i<=n;i++)
			 
		 {
			 if(n%i==0)
				
			 {
				 System.out.println(i);
			 }
			
		 }
			 
	}

}
