package prtce;

import java.util.Scanner;

public class duplicateint {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		int size=ip.nextInt();
		int[] arr1=new int[size];
		int [] arr2=new int[size];
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			
			arr1[i]=ip.nextInt();
			arr2[i]=ip.nextInt();
			
		}
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					c++;
					arr2[j]='\0';
				}
			}
			if(c>1) {
				sum=sum+arr1[i];
				
			}
			System.out.println(sum);
		}
	}
}
