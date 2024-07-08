package KOD;

public class Armstronng {

	public static void main(String[] args) {
		System.out.println("----program started----");
		int n=153;
		int n1=n,n2=n;
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		int rem=0,sum=0;
		while(n1!=0) {
			rem=n1%10;
			int pow=1;
			
			for(int i=1;i<=c;i++) {
				pow=pow*rem;		
			}
			sum=sum+pow;
			n1=n1/10;
		}
		if(sum==n2) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("no a armstrong");
		}
	}
}
