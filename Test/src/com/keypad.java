package com;

import java.util.ArrayList;
import java.util.Scanner;

public class keypad {

	public static void main(String[] args) {
		 ArrayList<Character> a1=new ArrayList<Character>();
		 ArrayList<Character> a2=new ArrayList<Character>();
		 ArrayList<Character> a3=new ArrayList<Character>();
		 
		 Scanner ip=new Scanner(System.in);
		 System.out.println("enter the elements");
		 String s=ip.next();
		 char c='a';
		 
		 for(int i=1;i<=26;i=i+3)
		 {
			 a1.add(c);
			 c++;
			 a2.add(c);
			 c++;
			 a3.add(c);
			 c++;
		 }
		 System.out.println(a1);
		 System.out.println(a2);
		 System.out.println(a3);
		 int sum=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(a1.contains(s.charAt(i)))
			 {
				sum=sum+1; 
			 }
			 else if(a2.contains(s.charAt(i)))
			 {
				 sum=sum+2;
			 }
			 else if(a3.contains(s.charAt(i)))
			 {
				 sum= sum+3;
			 }
		 }
		 System.out.println(sum);
	}

}
