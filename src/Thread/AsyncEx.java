package Thread;

public class AsyncEx {
    public static void main(String[] args) {
        System.out.println("Started");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run method called");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        System.out.println("End");
    }
}
