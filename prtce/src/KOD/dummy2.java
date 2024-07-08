package KOD;

import java.util.Scanner;

public class dummy2 {


public static void main(String[] args) {
	 
	Scanner ip=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=ip.nextInt();
	int[] n=new int[size];
	
	for(int i=0;i<n.length;i++) {
		n[i]=ip.nextInt();
		
	}
	 for(int i=0;i<n.length;i++) {
		 for(int j=0;j<n.length;j++) {
			 if(n[i]<n[j]) {
				 int temp=n[i];
				 n[i]=n[j];
				 n[j]=temp;
			 }
		 }
		 
	 }
	 for(int i=0;i<n.length;i++) {
		 System.out.println(n[i]);
	 }
	 
}
	
}
