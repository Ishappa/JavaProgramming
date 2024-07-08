package BasicLogical;

public class SunnynoOrNot {

	public static void main(String[] args) {
	 int n=3;
	 int c=0;
	 for(int i=1;i<=n;i++)
	 {
		 if(n==(i*i)-1)
			 c++;
	 }
	 if(c==1)
	 {
		 System.out.println("sunnyno");
	 }
	 else
	 {
		 System.out.println("not a sunnyno");
	 }

	}

}
