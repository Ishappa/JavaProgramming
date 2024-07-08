package prtce;

import java.util.LinkedHashSet;

public class duplicatstring {
public static void main(String[] args) {
	String []arr1= {"ram","sham","bhim","mahi"};
	String []arr2= {"ram","sham","bhim","mahi","ish"};
	
	
	 LinkedHashSet<String> l=new LinkedHashSet<String>();
	 
	 for(String s:arr1) {
		 l.add(s);
	 }
	 
	 for(String s:arr2) {
		 l.add(s);
	 }
	 
	 System.out.println(l);
}
}
