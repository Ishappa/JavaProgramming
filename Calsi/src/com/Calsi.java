package com;
import java.util.Scanner;
public class Calsi {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("=========welcome to Calsi========");
		while(true)
		{
			System.out.println("=====menu=======");
			System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mod\n6.Exit");
			int op=ip.nextInt();
			if(op==1)
			{
				System.out.println("please enter the values");
				int n1=ip.nextInt();
				int n2=ip.nextInt();
				System.out.println("add:"+(n1+n2));
			}
			else if(op==2)
			{
				System.out.println("please enter the values");
				int n1=ip.nextInt();
				int n2=ip.nextInt();
				System.out.println("sub:"+(n1-n2));
				
			}
			else if(op==3)
			{
				System.out.println("please enter the values");
				int n1=ip.nextInt();
				int n2=ip.nextInt();
				System.out.println("mul:"+(n1*n2));
			}
			else if(op==4)
			{
				System.out.println("please enter the values");
				int n1=ip.nextInt();
				int n2=ip.nextInt();
				System.out.println("div:"+(n1/n2));
			}
			else if(op==5)
			{
				System.out.println("please enter the values");
				int n1=ip.nextInt();
				int n2=ip.nextInt();
				System.out.println("mod:"+(n1%n2));
			}
			else if(op==6)
			{
				System.out.println("=====================");
				System.out.println("Thank you");
				System.exit(0);
			}
			else
			{
				System.out.println(" ------PLEASE ENTER VALID OPTION-----");
			}
		}

	}

}
