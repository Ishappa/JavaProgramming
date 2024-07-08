package Polymorphism;

public class Mtdoverload {	
	
	public int add(int x, int y) {
			return x+y;
	}
	
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	
	public String add(String x, String y) {
		return x+y;
	}
	
	
	public static void main(String[] args) {
		Mtdoverload m = new Mtdoverload();
		
	int add1 =m.add(2, 5);
	int add2 =m.add(2, 4, 5);
	String s=m.add("ish", "mano");
	
	System.out.println(add1);
	System.out.println(add2);
	System.out.println(s);
	
	//System.out.println(2+1+"ish");
	
	}
}
 

