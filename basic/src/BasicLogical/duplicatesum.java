package BasicLogical;

import java.util.Scanner;

public class duplicatesum {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int [] arr =  new int[size];  
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
        int sum=0;
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				// System.out.println(arr[j]);
				 sum=sum+arr[j];
				}
			}
			
		}
		System.out.println(sum);
        
        }  
	}


