package com.jsp;

public class MaxLengthArray {

	public static void main(String[] args) {
		 int[] arr= {12,54,5,42,10,11};
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>max)
			 {
				 max=arr[i];
			 }
		 }
		 System.out.println(max);

	}

}
