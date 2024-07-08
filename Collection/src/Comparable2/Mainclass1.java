package Comparable2;
import java.util.ArrayList;
import java.util.Collections;
public class Mainclass1 {

	public static void main(String[] args) {
		ArrayList<Pen> t=new ArrayList<Pen>();
			t.add(new Pen(10));
			t.add(new Pen(20));
			t.add(new Pen(40));
			t.add(new Pen(30));
			
			Collections.sort(t);
			
			for(Pen p:t)
			{
				System.out.println(p);
			}
	}

}
