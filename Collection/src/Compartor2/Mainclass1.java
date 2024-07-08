package Compartor2;
import java.util.TreeSet;
public class Mainclass1 {

	public static void main(String[] args) {
		
		sortbeerbybrand brand=new sortbeerbybrand();
		 TreeSet<Beer> t=new TreeSet<Beer>(brand);
		 	t.add(new Beer(160,"tuborgo"));
		 	t.add(new Beer(130,"KF"));
		 	t.add(new Beer(190,"Budwzer"));
		 	
		 	for(Beer b:t)
		 	{
		 		System.out.println(b);
		 	}
	}

}
