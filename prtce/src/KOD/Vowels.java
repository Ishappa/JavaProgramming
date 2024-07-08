package KOD;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the string"); 
		String s=ip.next();
		char[] s1=s.toCharArray();
		
		int c=0;
		for(int i=0;i<s1.length;i++) {
			String s2="";
			if(s1[i]=='a'|| s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u') {
				c++;
				
			}
			
		}
		System.out.println(c);
	}
	
}
