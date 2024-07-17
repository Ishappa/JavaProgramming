package java8.LambdaExpr;

@FunctionalInterface  //it should have at least one abstract method and can have any no of concrete methods

 interface Demo1Exampl  {

    public void test(int a, double b);

    // public void disp();

}

// using LambdaExpr----------------------

public class Example1{

    public static void main(String[] args) {
        // we can pass the arguments with or without datatype in lamda it will understand based on the method args are declared

        Demo1Exampl d = (a, b)->System.out.println("Lambda expression implementation"+a+" double value"+b);
        d.test(10, 20);
        }
        
    }
    

// public class Example1 implements Demo1Exampl {


// @Override
// public void test() {
//     System.out.println("Unimplemented method 'test'");
// }

// public static void main(String[] args) {
// Example1 ex = new Example1();
// ex.test();

// }

// }
