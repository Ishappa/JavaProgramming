package Thread;
//Race Condition --------------------------
class Increment{
    int count;
    public void increment(){
        count++;
    }
}

public class Example3 {

    public static void main(String[] args) throws InterruptedException {
        Increment inc = new Increment();
        Runnable test1 = ()->{
            for (int i=1;i<=1000;i++){
                inc.increment();

            }
        };
        Runnable test2 = ()->{
            for (int i=1;i<=1000;i++){
                inc.increment();

            }

        };
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(inc.count);
    }
}