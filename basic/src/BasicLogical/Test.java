package BasicLogical;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		 
		
		int [] arr1= {1,2,3,2,5,3};
 		//int [] arr2 =new int[n];
		
		
		
		
		for(int i=0;i<arr1.length;i++) {
			int c=0;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					//arr1[j]='0';
					c++;
				}
			}
			if(c==1) {
				System.out.println(arr1[i]);
			}
		}
		
		
		
	}
}
