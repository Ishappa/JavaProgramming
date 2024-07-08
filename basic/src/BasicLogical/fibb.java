package BasicLogical;

public class fibb {

	public static void main(String[] args) {
		int n=10;
		int n1=0;
		int n2=1;
		int sum=0;
		int c=0;
		for(int i=0;i<=n;i++) {
			
			if(n==c) {
				n=c;
			}
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			 
		}
	}
	}
	
