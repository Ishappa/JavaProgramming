package BasicLogical;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the Number");
		 int n= ip.nextInt();
		 int n2=n,n3=n;
		 int c=0;
		 while(n!=0)
		 {
			 c++;
			 n=n/10;
			
		 }
		 int rem=0; 
		 int sum=0;
		 while(n2!=0)
		 {
			 rem=n2%10;
			 int pow=1;
			 for(int i=1;i<=c;i++)
			 {
				  pow=pow*rem;
			 }
			      sum=sum+pow;
			      n2=n2/10;
		 }
		 if(n3==sum)
		 {
			System.out.println("Armstrong No");
		 }
		 else
		 {
			 System.out.println("Not a Armstrong No");
		 }

	}

}
