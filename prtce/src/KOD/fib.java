package KOD;

public class fib {
public static void main(String[] args) {

	int n1=0;
	int n2=1;
	int sum=0;
	int n=10;
	for(int i=0;i<=n;i++) {
		System.out.println(n1);
		 
		sum=n1+n2;
		n1=n2;
		n2=sum;
		
	}
}
}
