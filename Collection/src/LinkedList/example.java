package LinkedList;
import  java.util.LinkedList;
public class example {

	public static void main(String[] args) {
		 LinkedList  l=new LinkedList();
		 l.add(10);
		 l.add(null);
		 l.add( 20);
		 l.add(30.02);
		   l.add( "java");
		  

		 System.out.println(l);
		 
		 System.out.println(l.get(4));
		 System.out.println(l.indexOf(10));
		 System.out.println("================");
		 
		 
		 for(int i=0;i<l.size();i++)
		 {
			 System.out.println( l. get(i));
		 }
		 
		 System.out.println("================");
		 
		 for(int i=l.size()-1;i>=0;i--)
		 {
			 System.out.println( l. get(i));
		 }
	}

}
