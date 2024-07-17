package ExceptionExam;

public class Example2 {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int []num = new int[5];

        try {
            j=10/i;
            System.out.println(j/0);
            System.out.println(num[1]);
            System.out.println(num[5]);

        }
        catch (ArithmeticException e){
            System.out.println("something went wrong"+e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
}
