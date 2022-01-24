package dec6;

public class Demonstration_111 {

	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		Thread t1=new Thread(a);
		ThreadB b=new ThreadB();
		Thread t2=new Thread(b);
		ThreadC c=new ThreadC();
		Thread t3=new Thread(c);
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t3.getPriority());
		System.out.println(t2.getPriority());
		t2.setPriority(t2.getPriority() + 1);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println(".....Multithreading is over");
	}

}
