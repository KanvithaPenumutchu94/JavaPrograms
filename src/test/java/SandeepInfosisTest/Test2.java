package SandeepInfosisTest;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "One");
		hm.put(3, "Three");
		hm.put(2, "Two");
		hm.remove(2);
		hm.replace(1, "one");
		hm.replace(3, "Three","three");
		for(Integer num:hm.keySet())
		{
			System.out.println(num);
		}
	}

}
