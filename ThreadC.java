package dec6;

public class ThreadC extends Thread {
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("from thread C with k="+(2*k-1));
			if(k==3) {
				try
				{
					sleep(1000);
				}
				catch(Exception e)
				{
					
				}
			}
		}
		System.out.println("Exiting from thread C...");
		}
}


