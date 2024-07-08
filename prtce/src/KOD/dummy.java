package KOD;

 import java.util.*;

 import java.util.*;
 import java.io.*;

 public class dummy {

	 public static void main(String[] args) {
//		 int a=10;
//		 int b=20;
//		 
//		 a=a+b;  
//		 b=a-b;
//		 a=a-b;
//		  
//		 
//		 System.out.println(a+" "+b);
		 String s="hello";
		 char[] arr1=s.toCharArray();
		 char[] arr2=s.toCharArray();
		 char[] arr3=s.toCharArray();
		 
		 
		 for(int i=0;i<arr1.length;i++) {
			 int c=0;
			 for(int j=0;j<arr2.length;j++) {
				 if(arr1[i]==arr2[j]) {
					 c++;
					 arr2[j]='\0';
				 }
			 }
			 if(c>1) {
					 
						 for(int k=0;k<arr3.length;k++) {
							 if(arr3[k]==arr1[i]) {
								 arr3[k]='$';
							 }
							
						 }
						 
					 }
					 
		 }
		String s1=new String(arr3);
		   System.out.println(s1);
		}
 }