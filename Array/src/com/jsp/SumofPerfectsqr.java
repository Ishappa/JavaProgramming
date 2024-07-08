package com.jsp;
import java.util.Scanner;
public class SumofPerfectsqr {

	public static void main(String[] args) {
		 Scanner ip=new Scanner(System.in);
		 System.out.println("enter the size of array");
		 int size=ip.nextInt();
		 int[] arr=new int[size];
		 int sum=0;
		 System.out.println("enter the values");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=ip.nextInt();
			 for(int j=1;j<arr.length;j++)
			 {
				  
				 if(arr[i]==j*j)
				 {
					 sum=sum+arr[i];
					 
				 }
				 
				
			 }
			 
			  }
		 System.out.println(sum);
		 
		 
		 
		 
	}

}
