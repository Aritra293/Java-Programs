package dec6;

public class ThreadA extends Thread{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		if(i==1)yield();
		System.out.println("from thread A with i="+-1*i);
	}
	System.out.println("Exiting from thread A...");
	}
}


