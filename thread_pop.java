package assignment;

class thread_pop extends Thread {
	   private stackthread cubbyhole;
	   private int number;
	   
	   public thread_pop(stackthread c, int number) {
	      cubbyhole = c;
	      this.number = number;
	   }
	   public void run() {
	      int value = 0;
	      for (int i = 0; i < 20; i++) {
	         value = cubbyhole.get();
	         System.out.println("pop" + ":" + value);
	      }
	   }
	}



