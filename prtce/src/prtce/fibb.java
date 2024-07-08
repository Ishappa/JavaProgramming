package prtce;

public class fibb {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int c=0;
		int sum=0;
		while(n1<10) {
			
			System.out.println(n1+" "+c);
		sum=n1+n2;
		n1=n2;
		n2=sum;
		c++;
		 
		}
	}
}
