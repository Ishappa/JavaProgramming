package com.jsp;
import java.util.Scanner;
public class SumofEven {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the size of array");
		int size=ip.nextInt();
		int[] arr=new int[size];
		
		System.out.println("enter the values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		 

	}

}
