package Threads;

//public class Demo1 extends Thread {
//
//    public void run(){
//        System.out.println("thread inside thread");
//    }
//
//
//    public static void main(String[] args) {
//        Demo1 d= new Demo1();
//        d.start();
//        System.out.println("outside Thread");
//    }
//}

public class Demo1 implements Runnable{

    @Override
    public void run() {

        System.out.println("Run method is executing");

    }

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Thread thread = new Thread(d1);
        thread.start();

        System.out.println("Outside Thread");


    }
}


//we can threads in two way
//1.extends thread with run()
// 2.Implements Runnable Interface create obj for Thread cls
// and pass the cls obj reference to thread obj