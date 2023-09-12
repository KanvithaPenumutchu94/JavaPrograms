package Collection_Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//Map hs=new HashMap();
		
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "prasad");
		hm.put(2, "Rama");
		hm.put(3, "venki");
		hm.put(4, "ram");
		hm.put(5, "kanni");
		
		System.out.println(hm); //{1=prasad, 2=Rama, 3=venki, 4=ram, 5=kanni}
		
		System.out.println(hm.get(5)); //kanni
		
		hm.remove(5); //remove pair from hashmap
		System.out.println(hm); //{1=prasad, 2=Rama, 3=venki, 4=ram}
		
		System.out.println(hm.containsKey(1));//true
		System.out.println(hm.containsValue("venki"));//true
		
		System.out.println(hm.isEmpty());//false
		
		//returns all the keys from hashmap as set
		System.out.println(hm.keySet());  //[1, 2, 3, 4]
		
		
		for(Object o:hm.keySet())
		{
			System.out.println(o);
		}
		
		// returns  all the values from hashmap as collection
		System.out.println(hm.values());// [prasad, Rama, venki, ram]
		
		for(Object o:hm.values())
		{
			System.out.println(o);
		}
		
		//returns all the entries as set
		System.out.println(hm.entrySet());//[1=prasad, 2=Rama, 3=venki, 4=ram]
		
		for(Object o:hm.keySet())
		{
			System.out.println(o+"   "+hm.get(o) );
		}
		
		
		
	}

}
