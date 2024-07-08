package prtce;

import java.util.*;

public class Integra {

	public static void main(String[] args) {
		 String [] s1= {"ram","sham","ish","manoj"};
		 String [] s2= {"ram","sham","puni","junaid"};
		 
		 LinkedHashSet<String> l=new LinkedHashSet<String>();
		 
		 for(String ele1:s1) {
			 l.add(ele1);
		 }
		 
		 for(String ele2:s2) {
			 l.add(ele2);
		 }
		 
		 System.out.println(l);
	}

}
