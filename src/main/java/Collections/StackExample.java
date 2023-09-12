package Collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack s=new Stack(); //LIFO
		
		s.push("kanni");
		s.push(5);
		System.out.println(s);
		
	
		System.out.println(s.pop());
		
		
		System.out.println(s.peek());

	}

}
