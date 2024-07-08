package KOD;

public class FindLength {

	public static void main(String[] args) {
//		String s1="ishwar";
//		int c=0;
//		for(int i=0;i<s1.length();i++) {
//			c++;
//			
//		}
//		System.out.println(c);
		
		String s1="Ishwar";						//WITHOUT USING INBUILT METHODS
		int len=0;
		String s="";
		for(int i=s1.length()-1;i>=0;i--) {
			s=s+s1.charAt(i);
		}
		try {
			for(len=0;s1.charAt(len)!=0;len++) ;
				
			
		}
		catch(Exception e) {
			System.out.println(len+" "+s);
		}
		
		
		System.out.println(s);
	}
}
