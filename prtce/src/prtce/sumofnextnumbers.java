package prtce;

public class sumofnextnumbers {

	public static void main(String[] args) {
	 int[] a= {7,8,2,5,7,9,10,2};
	 for(int i=0;i<a.length;i++)
	 {
		 int sum=0;
		 for(int j=i+1;j<a.length;j++)
		 {
			 sum=sum+a[j];
		 }
		  a[i]=sum;
		 System.out.println(sum);
	 }

	}

}
