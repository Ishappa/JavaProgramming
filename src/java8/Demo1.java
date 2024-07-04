package java8;

interface P1{
    default String display(){
        System.out.println("P1");
        return "Hello";
    }
}

interface P2{

    default String display(){
        System.out.println("P2");
        return "bye";

    }
}


public class Demo1 implements P1,P2 {

    @Override
    public String display() {
        P1.super.display();
        P2.super.display();
        return "P2.super.display()";

    }

    public static void main(String[] args) {
//        P1 p1=new Demo1();
//        p1.display();
//
//        P2 p2=new Demo1();
//        p2.display();

        Demo1 d1=new Demo1();
        d1.display();



    }



}