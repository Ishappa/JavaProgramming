package KOD;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class dumy {

	public static void main(String[] args) {

		int n=10;
		int sum=0;
		for(int i=1;i<=n;i++) {
			int c=0;
			for(int j=1;j<=n;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(i);
			}
			
		}
	}

}