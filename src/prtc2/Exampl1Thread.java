package prtc2;

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

public class Exampl1Thread{

    public static void main(String[] args) {
//        Runnable test1 = ()->{
//            System.out.println("Run method1 Excecuting");
//        };
//        Runnable test2 = ()->{
//            System.out.println("Run method2 Excecuting");
//        };
//        Thread thread1 = new Thread(test1);
//        Thread thread2 = new Thread(test2);
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