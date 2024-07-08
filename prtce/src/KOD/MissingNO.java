package KOD;

import java.util.Scanner;

public class MissingNO {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		int size=ip.nextInt();
		
		int [] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
		int n=arr.length+1;
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		 int sum1=n*(n+1)/2;
		 int missing=sum1-sum;
		 System.out.println("missing no is "+missing);
		
		 
	}
}
