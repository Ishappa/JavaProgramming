package prtce;

public class repeat {

	public static void main(String[] args) {
		String s="hello";
		
		char[] c1=s.toCharArray();
		char[] c2=s.toCharArray();
		char[] c3=s.toCharArray();
		for(int i=0;i<c1.length;i++) {
			int c=0;
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					c++;
					c2[j]='0';
				}
			}
			if(c>1)
			{
				for(int k=0;k<c3.length;k++) {
					if(c1[i]==c3[k]) {
						c3[k]='0';
					}
				}
				
			}
			
		}
		String s1=new String(c3);
		System.out.println(c3);
	}
}
