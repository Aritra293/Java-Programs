package assignment;

import java.util.EmptyStackException;
import java.util.Stack;

public class stack_main {

	public static void main(String[] args) {
	        {
	                try
	                {
	                        Stack stack = new Stack();
	                        push ob=new push();
	                        pop ob1=new pop();
	                        System.out.println("Stack: "+stack);
	                        ob.push(stack, 12);
	                        ob.push(stack, 15);
	                        ob.push(stack, 32);
	                        ob.push(stack, 54);
	                        ob1.pop(stack);
	                        ob1.pop(stack);
	                        ob1.pop(stack);
	                        ob1.pop(stack);
	                        ob1.pop(stack);
	                }
	                catch (EmptyStackException ex)
	                {
	                        System.out.println("Stack is empty");
	                }
	        }
	}
	}


