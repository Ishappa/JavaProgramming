package com;

import java.util.Scanner;

public class SumofDuplicateNo {
//10,20,10,22,22,23------>10+22=32
	
	 
	public static void main(String[] args) {
		 Scanner ip=new Scanner(System.in);
		 System.out.println("------------");
		 int size=ip.nextInt();
		 int[] a1=new int[size];
		 int[] a2=new int[size];
		 for(int i=0;i<a1.length;i++)
		 {
			  int value=ip.nextInt();
			  a1[i]=value;
			  a2[i]=value;
		 }
		  
		  
		 int sum=0;
		 for(int i=0;i<a1.length;i++)
		 {
			 int c=0;
			 for(int j=i+1;j<a2.length;j++)
			 {
				 if(a1[i]==a2[j]  )
				 {
					 c++;
					 a2[j]='0';
				 }
				 if(c>1)
				 {
					 sum= sum+a2[j];
				 }
			 }
			
		 }
		 System.out.println(sum);
		 

	}

}
