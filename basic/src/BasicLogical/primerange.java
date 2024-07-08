package BasicLogical;

public class primerange {
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		 int range=10;
		 int count=0;
		 int range1=range;
		 
		 for(int i=1;i<=range;i++) {
			 if(isPrime(i)) {
				 count++;
				 System.out.println(i);
			 }
			 if(count==range1 ) {
				 break;
			 }
			 range++;
		 }
	}
}