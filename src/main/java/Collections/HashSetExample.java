package Collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		hs.add("kanni");
		hs.add(3);
		hs.add(5);
		hs.add("venki");
		System.out.println(hs);
		
		hs.remove(3);
		System.out.println(hs);

	}

}
