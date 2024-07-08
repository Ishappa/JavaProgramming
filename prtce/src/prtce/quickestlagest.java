package prtce;

public class quickestlagest {

	public static void main(String[] args) {
		 int[] a= {7,18,2,5,4,9,12,2};
		 for(int i=0;i<a.length;i++)
		 {
			 int c=a[i];
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]<a[j])
				 {
					 a[i]=a[j];
					 break;
				 }
			 }
			 if(c==a[i])
			 {
				 a[i]=-1;
			 }
			 System.out.println(a[i]);
		 }

	}

}
