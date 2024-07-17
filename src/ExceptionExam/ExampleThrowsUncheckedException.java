package ExceptionExam;

public class ExampleThrowsUncheckedException {
    public static void main(String[] args) {
        int a =10;
        int b= 0;
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Exception: Division by zero");
        }
        System.out.println("No exception occured : "+a / b);
    }
}

