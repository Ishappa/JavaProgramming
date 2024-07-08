package KOD;

public class primesum {
	
	public static void main(String[] args) {
		int n=10;
		 int sum=0;
		 for(int i=1;i<=n;i++)
		 {
			 int c=0;
			 for(int j=1;j<=n;j++) {
				 if(i%j==0) {
					 c++;
				 }
			 }
			 if(c==2) {
			 System.out.println(i);
				 sum=sum+i;
				 
			 }
			 
		 }
		 System.out.println("sum of prime no:"+sum);
	}
	 
	
}
