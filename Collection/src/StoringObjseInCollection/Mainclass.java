package StoringObjseInCollection;

import java.util.LinkedList;

public class Mainclass {

	public static void main(String[] args) {
		 Employee e1=new Employee("e", 2 );
		 Employee e2=new Employee("a", 1);
		 Employee e3=new Employee("b", 3 );
		 
		 LinkedList<Employee> l=new LinkedList<Employee>();
		 l.add(e1);
		 l.add(e2);
		 l.add(e3);
		 
		 for(Employee e:l)
		 {
			 System.out.println(e);
		 }

	}

}
