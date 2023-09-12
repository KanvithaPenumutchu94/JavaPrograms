package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("kanni");
		hs.add("triveni");
		hs.add("chandrika");
		
		//hs.clear();
		hs.clone();  //copy the data
		System.out.println(hs);
		System.out.println(hs.clone());
		
		System.out.println(hs.size());
		
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
