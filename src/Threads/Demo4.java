package Threads;

// 1st way to write a threads using extend Thread class--------------------

//class Example1 extends Thread {
//
//    @Override
//    public void run() {
//        System.out.println("Run method1 Excecuting");
//
//    }
//}
//class Example2 extends Thread{
//     @Override
//    public void run(){
//         System.out.println("Run method1 Excecuting");
//     }
//}
//public class Demo4 {
//    public static void main(String[] args) {
//        Example1 e1 = new Example1();
//        Example2 e2 = new Example2();
//
//        e1.start();
//        e2.start();
//    }
//}



// 2nd way to write a threads using implements Runnable Interface --------------------

//class Example1 implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("Run method1 Excecuting");
//
//    }
//}
//class Example2 implements Runnable{
//     @Override
//    public void run(){
//         System.out.println("Run method1 Excecuting");
//     }
//}
//public class Demo4 {
//    public static void main(String[] args) {
//        Example1 e1 = new Example1();
//        Example2 e2 = new Example2();
//        Thread t1 = new Thread(e1);
//        Thread t2 = new Thread(e2);
//
//        t1.start();
//        t2.start();
//    }
//}




// 3rd way using lambda expression for create a Rubnnable obj-----------------------

// public class Demo4{
//
//    public static void main(String[] args) {
//        Runnable test1 = ()->{
//            System.out.println("Run method1 Excecuting");
//        };
//        Runnable test2 = ()->{
//            System.out.println("Run method2 Excecuting");
//        };
//        Thread thread1 = new Thread(test1);
//        Thread thread2 = new Thread(test2);
//
//        thread1.start();
//        thread2.start();
//
//        System.out.println("Outside Thread Excecuting");
//
//    }
//}




// 4th way using lambda passing directly in Thread obje...----------------------------------

public class Demo4{

    public static void main(String[] args) {

        Thread thread1 = new Thread(()->{
            System.out.println("Run method1 Excecuting");
        });
        Thread thread2 = new Thread(()->{
            System.out.println("Run method2 Excecuting");
        });
        thread1.start();
        thread2.start();

        System.out.println("Outside Thread Excecuting");

    }
}