package KOD;

public class LargestNO {

	public static void main(String[] args) {

		 int[] n= {1, 5 ,6,4};
		 int max=n[0];
		 for(int i=0;i<n.length;i++) {
			 
			 if(max<n[i]) {
				 max=n[i];
			 }
		 }
		 System.out.println(max);
	}
}
