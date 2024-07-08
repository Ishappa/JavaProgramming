package Compartor2;
import java.util.ArrayList;
import java.util.Collections;
public class MainSortingUsingAL {

	public static void main(String[] args) {
		sortBeerbycost cost=new sortBeerbycost();
		 ArrayList<Beer> Al=new ArrayList<Beer>();
		 Al.add(new Beer(160,"tubrgo"));
		 Al.add(new Beer(130,"KF"));
		 Al.add(new Beer(190,"Btwizer"));
		 
		 Collections.sort(Al,cost);
		 
		 for(Beer B:Al)
		 {
			 System.out.println(B);
		 }

	}

}
 