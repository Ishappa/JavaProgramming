package prtce;

import java.util.Scanner;

public class brkets {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the value");
		String s=ip.next();
		int c=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(') {
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(j)==')') {
						c++;
						break;
					}
				}
			}
		}
		if(c*2==s.length()) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}

}
