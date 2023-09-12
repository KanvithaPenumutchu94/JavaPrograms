package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		//ll.descendingIterator();
		//ll.getFirst();
		//ll.getLast();
		ll.addFirst("kanni");
		ll.add("ram");
		ll.add(5);
		ll.addLast("venki");
		System.out.println(ll);
		ll.get(0);
		System.out.println(ll.get(0));
		
		Iterator i=ll.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
