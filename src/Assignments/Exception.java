package Assignments;

public class Exception extends Throwable {

	public Exception(String s) {
	}

	public static void main(String[] args) {
		int x = 10;
		int y =0;
		int [] z= {1,2,3};
		
		System.out.println("program started excecuting");
		try{
			//only 1st exception will print--> arrayindexoutofbound
			System.out.println(z[3]);
			System.out.println(x/y);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\nIndexout of bound");
		}
		catch(ArithmeticException a) {
			System.out.println("\nAirthmatic Exception");
			
		}
		
		try {
			System.out.println(10/0);
		}

		catch(ArithmeticException e) {
			System.out.println("\nArithmatic exception");
		}
//		catch (Exception e){
//			System.out.println("exception");
//
//		}



		finally {
			System.out.println("\nprogram ended");
		}
	}
}
