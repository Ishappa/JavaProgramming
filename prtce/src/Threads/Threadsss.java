package Threads;

public class Threadsss extends Thread{
	@Override
	public void run() {
		for(int i=1;i<6;i++)
		{
			System.out.println("bye");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}