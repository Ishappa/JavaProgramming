package prtce;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		 Scanner ip=new Scanner(System.in);
		 System.out.println("enter the name");
		 String s=ip.nextLine();
		 int c=0;
		 
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			 {
				 c++;
			 }
		 }
		 System.out.println(c);
	}

}
