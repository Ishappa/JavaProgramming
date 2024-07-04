package Assignments;

public class CharString {
public static void main(String[] args) {
	
	String s1="";
	char[] c1 = {'A','b','c'};
	for(int i = 0;i<c1.length;i++) {
		 s1 = s1+ c1[i];	
	}
	System.out.println(s1);
 
	
	
	
	char []c2= {'a','b','c'};
	String s2=new String(c2);
	System.out.println(s2);
	

	
	
}
}
