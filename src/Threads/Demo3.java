package Threads;



    public class Demo3 extends Thread {
        public static int amount = 0;

        public void run() {
            amount++;
        }

        public static void main(String[] args) {
            Demo3 thread = new Demo3();
            thread.start();

            // Wait for the thread to finish
            while(thread.isAlive()) {
                System.out.println("Waiting...");
            }
            System.out.println(thread.isAlive());
            // Update amount and print its value
            System.out.println("Main: " + amount);
            amount++;
            System.out.println(thread.isAlive());
            System.out.println("Main: " + amount);
        }

    }

