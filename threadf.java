package internal;

public class threadf extends Thread
{
	 int i,fct=1,num=5;  
	 {
	  for(i=1;i<=num;i++)
	  {    
	      fct=fct*i;  
	      System.out.println("Factorial of "+num+" is: "+fct);   
	  }  
}
}



