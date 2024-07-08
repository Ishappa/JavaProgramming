package KOD;

import java.util.LinkedHashSet;

public class duplicatearray {

	public static void main(String[] args) {
		
		String[] s1= {"ish","manoj","junaid","puni","kiran"};
		String[] s2= {"ish","manoj","Raki","puni","Avi"};
		
		LinkedHashSet<String> s=new LinkedHashSet<String>();
		for(String arr:s1) {
			s.add(arr);
		}
		for(String arr:s2) {
			s.add(arr);
		}
		System.out.println(s);
	}
}

