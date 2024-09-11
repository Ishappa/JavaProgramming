package ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class demo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList() ;
		l.add(10);
		l.add( null);
		l.add("java");
		l.add( 10.2);

//		for (int i = 0; i < l.size(); i++) {
//			System.out.println(l.get(i));
//		}
		for (Object i:l){
			System.out.println(i);
		}
		 
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.size());
		

	}

}
