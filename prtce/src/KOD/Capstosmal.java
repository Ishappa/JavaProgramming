package KOD;

import java.util.Scanner;

public class Capstosmal {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		
	//	System.out.println(s.toUpperCase());
		
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>='A'&&ch<='Z') {
				ch+=32;
				s1=s1+ch;
			}
			else if(ch>='a'&& ch<='z') {
				ch-=32;
				s1=s1+ch;
			}
			else {
				s1=s1+ch;
			}
			System.out.print(ch);
		}
	}
}
