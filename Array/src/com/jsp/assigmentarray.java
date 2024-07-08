package com.jsp;
import java.util.Scanner;
public class assigmentarray {

	public static void main(String[] args) 
	{
		 Scanner ip=new Scanner(System.in);
		 System.out.println("enter the size of arry");
		 int size=ip.nextInt();
		 int[] arr=new int[size]; 
		 System.out.println("enter the values");
		 for(int i=0;i<arr.length;i++)
		 {
			 
			 arr[i]=ip.nextInt();
			 
	     }
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>max)
			 {
				 max=arr[i];
			 }
		 }
		 
		 int sum=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(max!=arr[i])
			 {
				 sum=sum+arr[i];
			 }
		 }
		 if(sum==max)
		 {
			 System.out.println("super group");
		 }
		 else
		 {
			 System.out.println("not a super group");
			
		 }
	}

}
