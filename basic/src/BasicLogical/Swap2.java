package BasicLogical;

public class Swap2 {

	public static void main(String[] args) {
		 int a=10;
		 int b=20;
		 
//		 a=a^b;//30
//		 b=a^b;//10
//		 a=a^b;//20
		 
		 
//		 int temp=a;
//		 a=b;
//		 b=temp;
		 
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 {
			 System.out.println("a value is "+a);
			 System.out.println("b value is "+b);
		 }

	}

}
