package dec6;

public class ThreadB extends Thread {
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("from thread B with j="+2*j);
			if(j==2)stop();
		}
		System.out.println("Exiting from thread B...");
		}
}


