package Thread;

//class A1 implements Runnable{
//    public void run(){
//        for (int i=1;i<=5;i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Hi");
//        }
//    }
//}
//class A2 implements Runnable{
//    public void run(){
//        for (int i=1;i<=5;i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Hello");
//        }
//    }
//}


public class Example2 {
    public static void main(String[] args) {
        Runnable a1= ()-> {

        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hi");
        }
        };

        Runnable a2 = ()-> {
        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");
        }
        };

        Thread thread1 = new Thread(a1);
        Thread thread2= new Thread(a2);

        thread1.start();
        thread2.start();



    }

}
