package KOD;

import java.util.Scanner;

public class duplicatesum {

	public static void main(String[] args) {
		
//		Scanner ip=new Scanner(System.in);
//		int size=ip.nextInt();
//		int [] arr =  new int[size];  
// 		 
// 		for(int i=0;i<arr.length;i++) {
// 			arr[i]=ip.nextInt();
// 			 
// 		}
//         int sum=0;
// 		for(int i=0;i<arr.length;i++) {
// 			 
// 			for(int j=i+1;j<arr.length;j++) {
// 				if(arr[i]==arr[j]) {
// 					
// 				 //System.out.println(arr[i]);//arr[j]
// 				 sum=sum+arr[j];
// 				}
// 			}
// 			 
// 		}
// 		System.out.println(sum);
  
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int [] arr1= new int[size];
		int sum=0;
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=ip.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					c++;
//					arr1[j]='0';
				}
			}
			if(c>0 ) {
//				 System.out.println(arr1[i]);
				 sum=sum+arr1[i];
			}
		}
		  System.out.println(sum);
        }  
	}


