package BasicLogical;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Started");
		System.out.println("enter the number");
		
		 int n=ip.nextInt();
		 int n1=n;
		 int res=0,rem=0;
		 while(n!=0)
		 {
			 rem=n%10;
			 res=(res*10)+rem;
			 n=n/10;
		 }
		 if(res==n1)
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println("not a palindrome");
		 }
		 System.out.println("Ended");

	}

}
