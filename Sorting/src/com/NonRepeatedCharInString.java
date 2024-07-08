package com;

public class NonRepeatedCharInString {

	public static void main(String[] args) {
		 String s="hello";
		 char[] arr=s.toCharArray();
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 int c=0;
			 for(int j=0;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 c++;
				 }
			 }
			 if(c==1)
			 {
				 System.out.print(arr[i]);
			 }
		 }

	}

}
