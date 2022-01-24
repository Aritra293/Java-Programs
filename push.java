package assignment;

import java.util.Stack;

public class push  {
	 static void push(Stack st, int a)
     {
             st.push(new Integer(a));
             System.out.println("Element "+a+" push to Stack");
             System.out.println("Stack is: " + st);
     }

}
