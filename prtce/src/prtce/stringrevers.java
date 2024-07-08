package prtce;

public class stringrevers {

	public static void main(String[] args) {
		 String s1="hello bye hi";
		 String[] arr=s1.split(" ");
		 
		 for(int i=0;i<arr.length;i++) {
			 String s2=arr[i];
			 String s3="";
			 
			 for(int j=s2.length()-1;j>=0;j--) {
				 s3=s3+s2.charAt(j) ;
			 }
			 
			 System.out.print(s3);
		 }
	}

}
