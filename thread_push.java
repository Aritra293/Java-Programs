package assignment;

class thread_push extends Thread {
	   private stackthread cubbyhole;
	   private int number;
	   public thread_push(stackthread c, int number) {
	      cubbyhole = c;
	      this.number = number;
	   } 
	   public void run() {
	      for (int i = 0; i < 20; i++) {
	         cubbyhole.put(i);
	         System.out.println("Push"+ ":" + i);
	         try {
	            sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) { }
	      } 
	   }
	} 

