package prtce;

public class numStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123465"; 
		String s1="";
		 
		
		for(int i=0;i<s.length();i++)
		{
			 int n=s.charAt(i)-48 ;
			 int n1=s.charAt(i+1);
			 
			 if(n%2==0 && n1%2==0)
			 {
				 s1=n+"*"+n1;
			 }
			 else if(n%2!=0 && n1%2!=0)
			 {
				 s1=n+"-"+n1;
			 }
			System.out.println(s1);
		}

	}

}
