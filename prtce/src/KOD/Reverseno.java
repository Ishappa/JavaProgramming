package KOD;

public class Reverseno {

	public static void main(String[] args) {
		int n=161; 
		int n1=n;
		int rem=0;
		int rev=0;
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rem==n1) {
			System.out.println("pal");
		}else {
			System.out.println("not");
		}
		System.out.println(rev);
		
//		int n=123;
//		int rem=0;
//		while(n!=0) {
//			rem=n%10;
//			System.out.print(rem);
//			n=n/10;
//		}
	}
}
