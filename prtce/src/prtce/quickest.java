package prtce;
import java.util.Scanner;
public class quickest {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("=======");
		int size=ip.nextInt();
		System.out.println("===========");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=ip.nextInt();		
			
		}
		for(int i=0;i<a.length;i++)
		{
			 for(int j=i+1;j<a.length;j++)
			 {
				 System.out.println( a[i]+"  "+a[j]);
			 }
			
		}
		
		
	}
}
				
			 

	

		
