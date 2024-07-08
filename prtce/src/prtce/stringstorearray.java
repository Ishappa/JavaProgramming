package prtce;

import java.util.Scanner;

public class stringstorearray {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("-------------");
		 String s="hello hi bye";
		 String[] arr=s.split(" ");
		 for(int i=0;i<arr.length;i++)
		 {
			 String s2=arr[i];
			 String s3="";
			 for(int j=s2.length()-1;j>=0;j--)
			 {
				 s3=s3+s2.charAt(j);
			 }
			 System.out.print(s3+" ");
		 }
		

	}

}
