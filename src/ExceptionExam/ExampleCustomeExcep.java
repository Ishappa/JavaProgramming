package ExceptionExam;

class IshCustomeExce extends RuntimeException{

    public IshCustomeExce(String string){
         super(string);
    }
}

public class ExampleCustomeExcep {
    public static void main(String[] args) {
        int n = 10;
        int x = 0;

        try{
            x= n/2;
            System.out.println(n/0);
            throw new IshCustomeExce("its not valid");
        }
        catch (IshCustomeExce e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("this is not custome");
        }
    }
}
