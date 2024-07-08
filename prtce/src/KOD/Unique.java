package KOD;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		 Scanner ip=new Scanner(System.in);
		 String s=ip.next();
		 
		 char[] c1=s.toCharArray();
		 char[] c2=s.toCharArray();
		 
		 for(int i=0;i<c1.length;i++) {
			 int c=0;
			 for(int j=0;j<c2.length;j++) {
				 if(c1[i]==c2[j]) {
					 c++;
					 c2[j]='\0';
				 }
			 }
			 if(c==1) {     //c==1-->Unique  c>1-->duplicate  c>0-->print all char in string once
				 System.out.print(c1[i]);
			 }
		 }
		  
		  
		 
	}
}
