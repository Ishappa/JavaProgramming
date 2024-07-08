package Comparable;
import java.util.TreeSet;
public class Mainclass2 {

	public static void main(String[] args) {
		 Employee e1=new Employee(3.1,"A");
		 Employee e2=new Employee(3.4,"C");
		 Employee e3=new Employee(4.2,"B");
		 
		 
		 TreeSet<Employee> t=new TreeSet<Employee>();
		 t.add(e1);
		 t.add(e2);
		 t.add(e3);
		 
		 for(Employee emp:t)
		 {
			 System.out.println(emp);
		 }

	}

}
