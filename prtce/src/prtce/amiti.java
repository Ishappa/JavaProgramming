package prtce;

import java.util.Scanner;  

public class amiti {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the num");
		int n=ip.nextInt();
		String s="";               //i/p-->56647304
		int rem=0,pre=0;           //o/p-->56*6*47-304
		while(n!=0)
		{
			rem=n%10;
			String s1="";                         
			if(rem%2==0 && pre%2==0 && pre!=0 && rem!=0) {
				s1=rem+"*";
				s=s1+s;
			}
			else if(rem%2==1 && pre%2==1 )
			{
				s1=rem+"-";       
				s=s1+s;
			}
			else {
				s=rem+s;
			}
			pre=rem;
			n=n/10;
		}
		System.out.println(s);

	}
}
