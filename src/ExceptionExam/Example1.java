
package ExceptionExam;

public class Example1 {
public static void main(String[] args) {

//    int i=0;
    int i=10;
    try {
        System.out.println(i/0);

    }
    catch (ArithmeticException e){
        String message = e.getMessage();
        System.out.println(e+" 1st one");
    }
    catch (Exception e1){
        System.out.println(e1+"2nd one");
    }
    System.out.println(i); //if i=0 i will get execute
    System.out.println("bye");


}
    
}