package prtce;

import java.util.Scanner;

public class partialrevers {

	public static void main(String[] args) {
		 
		int[] arr= {4,3,2,5,2,1};
		 
		int key=3;
		int In=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				In=i;
				break;
			}
			 
		}
		if(In==-1)
		{
			System.out.println("Not found in "+In);
		}
		else 
		{
			System.out.println("key found at IndexNo "+In);
		}

	}

}
