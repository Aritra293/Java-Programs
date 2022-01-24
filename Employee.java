package internal;
	import java.util.*;
	import java.lang.*;
	public class Employee {
		int salary;
		double hra,da,pf;
	Employee()
	{
	salary=0;	
	}
	Employee(int salary,double hra,double da,double pf)
	{
		salary=this.salary;
		hra=this.hra;
		da=this.da;
		pf=this.pf;
	}
	static int calculate(int salary,
	                        char grade)
	{
	    double allowance;
	    double hra, da, pf;
	     
	    hra = 0.2 * salary;
	    da = 0.5 * salary;
	    pf = 0.11 * salary;
	     
	    // allowance for the person
	    if (grade == 'A')
	    {
	        allowance = 1700.0;
	    }
	    else if (grade == 'B')
	    {
	        allowance = 1500.0;
	    }
	    else
	    {
	        allowance = 1300.0;
	    }
	    double gross;
	     
	    // Calculate gross salary
	    gross = Math.round(salary + hra + da +
	                         allowance - pf);
	                          
	    return (int)gross;
	}
	public static void main (String[] args)
	{
		Employee ob=new Employee();
		Employee ob1=new Employee(10000,0.2,0.5,0.11);
		
	    int sal = 10000;
	    char grade = 'A';
	     
	    // Function call
	    System.out.println("the gross salary is:");
	    System.out.println(calculate(sal, grade));
	}
	}

