package BasicLogical;

public class Factorial {

	public static void main(String[] args) {
		 int n=5;
		 int fact=1;
		 int i=1;
		while(i<=n)
		 {
			 fact=fact*i;
			 i++; 
		 }
		 
//		 for(int i=1;i<=n;i++) {
//			 fact=fact*i;
//		 }
		 
		 System.out.println(fact);		 
	}
	
}
