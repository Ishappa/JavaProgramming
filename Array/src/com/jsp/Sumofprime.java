package com.jsp;
import java.util.Scanner;
public class Sumofprime {

	public static void main(String[] args) {
		int c=0,sum=0;
		   Scanner ip=new Scanner(System.in);
		   System.out.println("Enter the size of array");
		   int size=ip.nextInt();
		   int[] arr=new int[size];
		   System.out.println("enter the values");
		   for(int i=1;i<arr.length;i++)
		   {
			   arr[i]=ip.nextInt();
			   
			   if(arr[i]%i==0)
			   {
				   c++;
				   
			   }
			   if(c==2)
			   {
				   sum=sum+arr[i];
			   }
		   }
		    
		  
		   System.out.println(sum);

	}
}
