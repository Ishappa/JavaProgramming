package prtce;

public class capstosmall {

	public static void main(String[] args) {
		 String s="hello12 3HibYE";
		  
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 
			 if(ch>='a'&& ch<='z')
			 {
				 ch-=32;
			 }
			 else if(ch>='A'&& ch<='Z')
			 {
				 ch+=32;
			 }
			 System.out.print(ch);
		 }
		
		  

	}

}
