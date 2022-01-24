package assignment;

public class push_pop {
	   public static void main(String[] args) {
	      stackthread c = new stackthread();
	      thread_push p1 = new thread_push(c, 1);
	      thread_pop c1 = new thread_pop(c, 1);
	      p1.start(); 
	      c1.start();
	   }
	}