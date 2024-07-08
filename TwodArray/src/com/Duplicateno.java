package com;

import java.util.LinkedHashSet;
import java.util.Scanner;


public class Duplicateno {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("===========");
		int size=ip.nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		
		 for(int ele:arr)
		 {
			 l.add(ele);
		 }
		 System.out.println(l);
	}

	}
	