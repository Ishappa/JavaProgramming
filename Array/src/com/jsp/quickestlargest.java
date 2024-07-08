package com.jsp;

public class quickestlargest {

	public static void main(String[] args) {
		//  Quickest Largest number to the right side
		int[] a= {12,36,89,11,62,78,99,7,16};
		for(int i=0;i<a.length;i++)
		{
			int c=a[i];
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]<a[j])
				 {
					 a[i]=a[j];
					 break;
					 
				 }
			 }
			 if(a[i]==c)
			 {
				 a[i]=-1;
			 }
			 System.out.print(a[i]+" ");
		}

	}

}
