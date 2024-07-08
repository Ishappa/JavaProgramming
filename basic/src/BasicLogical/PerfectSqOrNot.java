package BasicLogical;

public class PerfectSqOrNot 
{
	public static void main(String[] args) {
		int n=16;
		int c=0;
		
		for(int i=1;i<=n;i++)
		{
			n=i*i;//if(n==i*i)
			c++;
			
		}
		if(c==1)
		{
			System.out.println("Perfect sqr");
		}
		else
		{
			System.out.println("not a Perfect");
		}
	}
}
		 
		 
