package assignment;

import java.util.Stack;

public class pop {
	static void pop(Stack st)
    {
            Integer a = (Integer) st.pop();
            System.out.println("Element "+a+" pop to the stack");
            System.out.println("Stack is: " + st);
    }
}
