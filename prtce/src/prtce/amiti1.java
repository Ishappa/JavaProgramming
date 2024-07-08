package prtce;

import java.util.Scanner;

public class amiti1 {

	public static void main(String[] args) {//i/p-->628043502    o/p-->6*2*8043-502
		Scanner ip=new Scanner(System.in);
		System.out.println("==========");
		 int n=ip.nextInt();
		String s="";
		int rem=0,pre=0;
		while(n!=0) {
			rem=n%10;
			String s1="";
			if(rem%10==0 && pre%10==0 && rem!=0 && pre!=0) {
				s1=rem+"*";
				s=s1+s;
			}
			else if(rem%10==1 && pre%10==1) {
				s1=rem+"-";
				s=s1+s;
			}
			else {
				s=s1+s;
			}
			pre=rem;
			n=n/10;
		}
		System.out.println(s);
	}
}
