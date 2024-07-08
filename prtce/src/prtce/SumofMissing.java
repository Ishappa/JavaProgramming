package prtce;

import java.util.Scanner;

public class SumofMissing {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int[] arr=new int[size];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
			
		}
		
		for(int i=0;i<=size;i++) {
			sum=sum+i;
		}
		
		for(int i=0;i<arr.length;i++) {
			sum=sum-arr[i];
		}
		System.out.println(sum);
	}
}
