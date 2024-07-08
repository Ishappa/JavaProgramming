package com;

import java.util.Scanner;

public class StringAnagram {
	public static String isSort(String s)
	{
		char[] arr=s.toCharArray(); 
		 for(int i=0;i<arr.length;i++)  
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 char temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 } 
				 
			 }
	}
		 String ans=new String(arr); 
		 return ans;
	}
		 

	public static void main(String[] args) {
		 Scanner ip=new Scanner(System.in);
		 System.out.println("Eneter a String 1");
		 String s1=ip.nextLine();
		 System.out.println("Eneter a String 2");
		 String s2=ip.nextLine();
		 
		 String ans1=isSort(s1);
		 String ans2=isSort(s2);
		 
			 if(ans1.equals(ans2))
			 {
				 System.out.println("anagram");
			 }
			 else
			 {
				 System.out.println("not a anagram");
			 }
			
			//anagram---->comparing the 2 strings of characters equal or not 
		 }
		 

	}


