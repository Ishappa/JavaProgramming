package BasicLogical;

import java.util.Scanner;

	public class primeno 
	{
	public static void main(String[] args) 
	{
		System.out.println("enter a no");
		Scanner ip=new Scanner(System.in);
		
		 int n=ip.nextInt();
		 int c=0;
		 for(int i=1;i<=n;i++)
		 {
			 
			 if(n%i==0)
			 {
				 c++;
			 }
		 }
		 if(c==2)
		 {
			 
			 System.out.println(n+": prime number");
		 }
		 else
		 {
			 System.out.println(n+":is not a prime number");
		 }
	}

}
