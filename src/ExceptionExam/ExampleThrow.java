package ExceptionExam;

public class ExampleThrow {
    public static void main(String[] args) {
        int i=2;
        int j=0;

        //throw: it's a keyword and it's use for throw the exeption
        try{
            j=18/20;    //o/p: 0 (it will not throw error)
            //if we want to create exception based on condition(ex: if j =0 throw the error)
            if(j==0) {
                throw new ArithmeticException("zero is getting");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("bye");

    }
}
