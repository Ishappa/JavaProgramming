package prtce;

public class sumofnumerics {

	public static void main(String[] args) {
		 String s="152hello2 hi1";
		 int sum=0;
		 
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 
			 if(ch>='0'&& ch<='9')
			 {
				 sum=sum+(ch-'0');
			 }
		 }
		 System.out.println(sum);
	}

}
