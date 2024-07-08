package prtce;

import java.util.Scanner;

public class prime1 {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("==========");
		int n=ip.nextInt();
		 
		int sum=0;
		// int c=0,i;
		 
		 
			 for(int i=1;i<=n;i++) {
				int c=0;
				 for(int j=1;j<=i;j++) {
					 if(i%j==0) {
						 c++;
					 }
				 }
				 if(c==2) {
					 sum=sum+i;
					 
				 }
			 }
			 System.out.println(sum);
		}
		
		 	
}
