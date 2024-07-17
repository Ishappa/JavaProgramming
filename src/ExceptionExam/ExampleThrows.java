package ExceptionExam;

import static java.lang.Class.forName;



/* -> throws: its a keyword is used to indicate that a method might throw certain exceptions.
->These exceptions can be either checked or unchecked exceptions,
    but its primary use is associated with checked exceptions.
*/

class Demo{
    public void disp() throws ClassNotFoundException{
        Class.forName("helo");
    }

}


public class ExampleThrows {
    static {
        System.out.println("Class is loaded");
    }
    public static void main(String[] args) {

        try{
            Demo a=new Demo();
            a.disp();
        }
        catch (ClassNotFoundException c){
            c.printStackTrace();

        }
    }
}
