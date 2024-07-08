package Polymorphism;


//===========Example CompileTime polymorphism=========== 
public class MethodOverload {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		MethodOverload example = new MethodOverload();

		int sum1 = example.add(10, 20);
		int sum2 = example.add(5, 10, 15);
		double sum3 = example.add(2.5, 3.7);

		System.out.println("Sum 1: " + sum1); // Sum 1: 30
		System.out.println("Sum 2: " + sum2); // Sum 2: 30
		System.out.println("Sum 3: " + sum3); // Sum 3: 6.2
	}
}


//=================Using user input============================


//public class MethodOverload {
//     
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//     
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    
//    public double add(double a, double b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        MethodOverload example = new MethodOverload();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter two integers for sum 1: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        System.out.print("Enter three integers for sum 2: ");
//        int num3 = scanner.nextInt();
//        int num4 = scanner.nextInt();
//        int num5 = scanner.nextInt();
//
//        System.out.print("Enter two doubles for sum 3: ");
//        double num6 = scanner.nextDouble();
//        double num7 = scanner.nextDouble();
//
//        int sum1 = example.add(num1, num2);
//        int sum2 = example.add(num3, num4, num5);
//        double sum3 = example.add(num6, num7);
//
//        System.out.println("Sum 1: " + sum1);
//        System.out.println("Sum 2: " + sum2);
//        System.out.println("Sum 3: " + sum3);
//
//        scanner.close();
//    }
//}
//
