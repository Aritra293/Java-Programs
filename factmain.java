package internal;
import java.util.Scanner;
public class factmain {
		public static void main(String[] args) {
			  int i,fact=1;      
			  Scanner sc=new Scanner(System.in);
				System.out.println("enter your number");
				int number=sc.nextInt();
				threadf ob=new threadf();
				Thread t1=new Thread(ob);   
			  System.out.println("Factorial of "+number+" is: "+fact);    

	}
}


