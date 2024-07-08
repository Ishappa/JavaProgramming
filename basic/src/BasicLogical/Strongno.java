package BasicLogical;

public class Strongno {

	public static void main(String[] args) {
		 int n=145  ,n1=n;
		 int sum=0;
		 int rem=0;
		 while(n!=0)
		 {
			 rem=n%10;
			 int fact=1;
			 for(int i=1;i<=rem;i++)
			 {
				 fact=fact*i;
				 
			 }
			 sum=sum+fact;
			 n=n/10;
		 }
		 if(n1==sum)
		 {
			 System.out.println("Strong No");
		 }
		 else
		 {
			 System.out.println("Not a Strong ");
		 }
		 
	}

}
