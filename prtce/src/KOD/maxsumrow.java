 package KOD;

import java.util.Scanner;

public class maxsumrow {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int row=ip.nextInt();
		int col=ip.nextInt();
		
		int [][] arr=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		int c=0;
		int max=arr[0][0];
		
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum=sum+arr[i][j];
				
			}
			if(max<sum) {
				max=sum;
			}
			
		}
		System.out.println(max);
			
	}
	
}