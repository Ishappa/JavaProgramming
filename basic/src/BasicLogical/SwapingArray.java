package BasicLogical;

import java.util.Scanner;

public class SwapingArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		int size=ip.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
		int temp=arr[0];
		arr[0]=arr[size-1];
		arr[size-1]=temp;
		
		
		
		
//		arr[0]=arr[0]+arr[size-1];
//		arr[size-1]=arr[0]-arr[size-1];
//		arr[0]=arr[0]-arr[size-1];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}
	 
}
