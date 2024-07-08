package BasicLogical;

public class Reverseno {

	public static void main(String[] args) {

		int n=123;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			System.out.print(rem);
			n=n/10;
			
			
//			int n=163;                                
//			int rem=0;
//			int rev=0;
//			while(n!=0) {
//				rem=n%10;
//				rev=(rev*10)+rem;
//				n=n/10;
//			}
//			System.out.println(rev);
			
		}
	}
}
