package Thread;



     class A extends Thread {

        public void run(){
            for(int i=1; i<=10; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
       
    }
}

 class B extends Thread{

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
}
public class Example1 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}


