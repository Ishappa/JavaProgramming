package Threads;

public class Demo2 extends Thread {

    public static int amount=0;

    @Override
     public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        amount++;
        System.out.println(Thread.currentThread().getName());
        System.out.println(amount);




}


     public static void main(String[] args)  {//this is main thread
        Demo2 d2=new Demo2(); //this is 2nd thread(gouda)
        d2.setName("Gouda");
        d2.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }
}
