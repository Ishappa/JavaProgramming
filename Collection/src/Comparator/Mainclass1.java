package Comparator;
import java.util.TreeSet;
public class Mainclass1 {

	public static void main(String[] args) {
		 Student s1=new Student(21,"A");
		 Student s2=new Student(22,"C");
		 Student s3=new Student(20,"B");
		 
		 SortStudentByAge n=new SortStudentByAge();
		 // SortStudentByName n=new SortStudentByName();
		 TreeSet<Student> t=new TreeSet(n);
		 t.add(s1);
		 t.add(s2);
		 t.add(s3);
		 
		 for(Student std:t)
		 {
			 System.out.println(std);
		 }
	}

}
