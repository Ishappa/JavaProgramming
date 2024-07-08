package KOD;

import java.util.Scanner;

public class printVowels {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		String s1=ip.next();
		 
		String s2="aeiouAEIOU";
		
		char[] ch1=s1.toCharArray(); 
		char[] ch2=s2.toCharArray();
	
		
		for(int i=0;i<ch1.length;i++) {
			int c=0;
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j]) {
					c++;
					ch2[j]='0';
				}
			}
			if(c>0) {
				System.out.print(ch1[i]);
			}
			
		}
	}
}
