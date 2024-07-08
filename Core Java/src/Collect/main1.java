package Collect;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class main1 {
public static void main(String[] args) {
//	Student s=new Student(10, "Ish");
//	Student s2= new Student(20, "Mani");
//	Student s3= new Student(15, "puni");
//	
//	Set<Student> l=new TreeSet<Student>();
//	l.add(s);
//	l.add(s2);
//	l.add(s3);
//	
//	//System.out.println(l);
//	
//	for(Student S:l) {
//		System.out.println(S);
//	}
	
	Set s= new TreeSet<>();
	s.add(10);
	s.add(20);
	s.add(40);
	s.add(10);
	s.add(50);
	
	for(Object i:s) {
		System.out.println(i);
	}
}
}
