package KOD;

public class ASCI {
 
	public static void main(String[] args) {
		String s="hello";
		char[] ch=s.toCharArray();
		int sum=0;
		 
		for(int i=0;i<ch.length;i++) {
			int asci=ch[i];
			sum=sum+asci;
			System.out.println(asci+" ");
		}
		System.out.println("sum of asci:"+sum);
		 
		 
		 
	}
	 
}
