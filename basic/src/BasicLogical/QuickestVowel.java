package BasicLogical;

import java.util.Scanner;

public class QuickestVowel {

	static boolean isvowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		char c=ip.next().charAt(0);
		if(isvowel(c)) {
			System.out.println(c);
		}
		else {
			int fc=0;
			char f;
			boolean ff=false;
			
			for(f=c;f<='z';f++) {
				fc++;
				if(isvowel(f)) {
					ff=true;
					break;
				}
			}
			int bc=0;
			char b;
			boolean fb=false;
			for(b=c;b>='a';b++) {
				bc++;
				if(isvowel(b)) {
					fb=true;
					break;
				}
			}
			if(fc<bc && ff==true) {
				System.out.println(f);
			}
			else if(fb==true) {
				System.out.println(b);
			}
		}
	}
}
