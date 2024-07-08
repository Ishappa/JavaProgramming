package prtce;

public class dummy1 {

	public static void main(String[] args) {
		 String s1="hello hi";
		 String[] s2=s1.split(" ");
		  
		  for(int i=0;i<s2.length;i++) {
			  String s3=s2[i];
			  String s4="";
			  
			  for(int j=s3.length()-1;j>=0;j--) {
				   s4=s4+s3.charAt(j);
			  }
			  System.out.print(s4+" ");
		  }
		
	}
}
