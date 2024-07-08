package prtce;

import java.util.Scanner;

public class brackets3 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the string");
		String s=ip.next();
		int c=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
				
				for(int j=i+1;j<s.length();j++) {
					
					if(s.charAt(j)==')'||s.charAt(j)==']'||s.charAt(j)=='}') {
						
						c++;
						System.out.println(c);
						break;
					}
				}
				
			}
		}
		if(c*2==s.length()) {
			System.out.println("balanced");
		}
		else {
			System.out.println("not balanced");
		}
	}
}
