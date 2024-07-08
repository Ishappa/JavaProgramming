package com.jsp;
import java.util.Scanner;

public class Oddnoprime {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=ip.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the Values");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
			if(arr[i]%2==1)
			{
				sum=sum+arr[i];
			}
			
		}
		int c=0;
		for(int i=0;i<=sum;i++)
		{
			if(sum%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			 System.out.println( "prime no");
		}
		else
		{
			 System.out.println("not prime");
		}
		 
		
		 
		 
	}

}
