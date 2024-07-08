package ArrayList;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList() ;
		l.add(10);
		l.add( null);
		l.add("java");
		l.add( 10.2);
		 
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.size());
		

	}

}
