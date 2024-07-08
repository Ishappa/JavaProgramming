package Overload;

  class Demo {

	public int add(int x, int y) {
	return x+y;	
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	
	public static void main(String[] args) {
		Demo d= new Demo();
		int add1 = d.add(2, 5);
		System.out.println(add1);
		
		double add2 = d.add(5, 1);
		System.out.println(add2);
		
		int add3 = d.add(1, 1, 6);
		System.out.println(add3);
	}
	
}
