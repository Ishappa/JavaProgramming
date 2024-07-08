 package com.jsp;
import java.util.Scanner;
public class sumoffibbinocci {
	
	static boolean fib(int n)
	{
		int n1=0;
		int n2=1;
		int sum1=0;
		while(n1<=n)
		{
			if(n==n1)
			{
				return true;
			}
			int sum = n1+n2;
			n1=n2;
			n2=sum1;
		}
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=ip.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean ans=fib(arr[i]);
			if(ans==true)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
    }
		
		 
		 
		
		

	

}
