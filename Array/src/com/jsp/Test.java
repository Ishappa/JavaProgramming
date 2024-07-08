package com.jsp;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the size");
		int size=ip.nextInt();
		
		System.out.println("enter the elements");
		int[] a=new int[size];
		int[] b=new int[size];
		int c=0;
		
		for(int i=0;i<a.length;i++) 
		{
			a[i]=ip.nextInt();
		}
		for(int j=0;j<b.length;j++) 
		{
			b[j]=ip.nextInt();
		}
			
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]-a[j];
					c++;
				}
			}
			
		}
//		int [] a= {5,7,10,5,15};
//		int [] b= {2,2,1,3,5};
//		int c=1;
//		 for(int i=0;i<a.length;i++)
//		 {
//			 for(int j=0;j<b.length;j++)
//			 {
//				 if(a[i]>a[j])
//				 {
//					 
//					 a[i]=a[i]-a[j];
		
		System.out.println(c);
	}

}
