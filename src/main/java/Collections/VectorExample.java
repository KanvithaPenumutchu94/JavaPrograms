package Collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		Vector v1=new Vector();
		v.add("kanni");
		v.add(5);
		System.out.println(v);
		//v1.add("venki");
		//v1.add(23);
		v1.addAll(v);
		
		System.out.println(v1);
		
		

	}

}
