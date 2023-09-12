package Collection_Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		ht.put(1, "prasad");
		ht.put(2, "Rama");
		ht.put(3, "venki");
		ht.put(4, "ram");
		ht.put(5, "kanni");
	//	ht.put(null, "sjh"); //NullPointerException
		//ht.put(107, null);//NullPointerException
		
		System.out.println(ht); //{5=kanni, 4=ram, 3=venki, 2=Rama, 1=prasad}
		
		System.out.println(ht.get(5)); //kanni
		
		ht.remove(5); //remove pair from hashmap
		System.out.println(ht); //{4=ram, 3=venki, 2=Rama, 1=prasad}
		
		System.out.println(ht.containsKey(1));//true
		System.out.println(ht.containsValue("venki"));//true
		
		System.out.println(ht.isEmpty());//false
		
		
		//returns all the keys from hashmap as set
		System.out.println(ht.keySet());  //[1, 2, 3, 4]
		
		
		for(Object o:ht.keySet())
		{
			System.out.println(o+"  "+ht.get(o));
		}
		
		// returns  all the values from hashmap as collection
		System.out.println(ht.values());// [prasad, Rama, venki, ram]
		
		for(Object o:ht.values())
		{
			System.out.println(o);
		}
		
		
		//Entry specific methods....
		for(Map.Entry entry:ht.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		//Iterator..
		Set s=ht.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
				
	}

}
