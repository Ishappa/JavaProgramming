package com ;
import java.util.Scanner;
// To Check given no is divisible by 3 or 5?

public class DivisibleTwoNo {

	public static void main(String[] args) {
		 Scanner ip=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=ip.nextInt();
		 
		 if(n%3==0||n%5==0)
		 {
			 System.out.println("The no is divisible by 3 or 5");
		 }
		 else
		 {
			 System.out.println("The no is not divisible by 3 or 5");
		 }
		
	}

}
