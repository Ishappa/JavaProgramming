package KOD;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
 
//	String s1="hello";
	
	String s="hi bye";
 
	String[] s1=s.split(" ");
	
	for(int i=0;i<s1.length;i++) {
		String s2=s1[i];
		String s3="";
		for(int j=s2.length()-1;j>=0;j--) {
			 s3=s3+s2.charAt(j);
		}
		System.out.print(s3+" ");
	}
	
//	for(int i=s1.length()-1;i>=0;i--) {
//		System.out.print(s1.charAt(i));
//	}
}

}
