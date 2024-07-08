package KOD;

public class revrse {

	public static void main(String[] args) {
	
//		String s="Hello Hi";
//		String [] s1=s.split(" ");
//		
//		for(int i=0;i<s1.length;i++) {
//			String s2=s1[i];
//			String s3="";
//			
//			for(int j=s2.length()-1;j>=0;j--) {
//				s3=s3+s2.charAt(j);
//			}
//			System.out.print(s3+" ");
//		}
		
		String []s= {"hello", "hi", "bye","come"};
		for(int i=s.length-1;i>=0;i--) {
			System.out.println(s[i]);
		}
		
	}
	
}