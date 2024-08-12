package prtc2;


abstract class A{
    abstract void a();
    public void b(){
        System.out.println("method b");
    }
}

abstract class ExampleAbsract {
    abstract void test();
    public void disp(){
        System.out.println("hhhh");
    }
    public static void main(String[] args) {
        ExampleAbsract a = new ExampleAbsract() {
            @Override
            void test() {
                System.out.println("override");
            }
        };
        a.test();
        a.disp();
    }
}

public class Parent extends A{
    @Override
    void a() {
        System.out.println("A method");
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        p.a();
        p.b();
    }

}