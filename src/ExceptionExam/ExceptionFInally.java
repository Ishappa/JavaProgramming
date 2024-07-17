package ExceptionExam;

public class ExceptionFInally {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }
//        catch (Exception e){
//            System.out.println("dividing zero");
//        }

        //it will execute always, and it will remove compile time error when we working with catch block with try
        finally {
            System.out.println("Finally block is running");
        }
    }
}
