package assignment;

import java.util.Scanner;
import java.util.Random;

public class random {
		    public static void main(String[] args) 
		    {
		        int maxRange;

		        //create objects
		        Scanner sc= new Scanner(System.in);
		        Random rand = new Random();
		        System.out.print("Please enter maximum range: ");
		        maxRange=sc.nextInt();
		        for(int loop=1; loop<=10; loop++)
		        {
		            System.out.println(rand.nextInt(maxRange));
		        }
		    }

	}


