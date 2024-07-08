package prtce;

public class Ishwa {
	
public static void main(String[] args) {
	int n=121;
	int n1=n;
	int rem=0;
	int rev=0;
	while(n!=0) {
		rem=n%10;
		rev=rev*10+rem;
		//System.out.print(rem);
		n=n/10;
	}
	
	System.out.println(rev);
	if(rev==n1) {
		System.out.println("pali");
	}
	else {
		System.out.println("not");
	}
	 
	
	
}
 
}

