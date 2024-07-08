package KOD;

import java.util.Scanner;

public class vowel3 {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
//		String s="hello world";
//		String s1="aeiouAEIOU";
//		 
//		char[] arr1=s.toCharArray();
//		char[] arr2=s1.toCharArray();
//		
//		for(int i=0;i<arr1.length;i++) {
//			int c=0;
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]==arr2[j]) {
//					c++;
//					arr2[j]='0';
//				}
//			}
//			if(c>0) {
//				System.out.print(arr1[i]);
//			}
//		}
		String str = ip.next();
        String vowels = "aeiouAEIOU";
        System.out.print("Vowels in the string \"" + str + "\": ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) != -1) {
                System.out.print(c + " ");
            }
        }
		
		
		 
		  
		}
}
	
