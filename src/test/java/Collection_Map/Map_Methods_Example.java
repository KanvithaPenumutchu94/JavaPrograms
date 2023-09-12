package Collection_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Methods_Example {

	public static void main(String[] args) {
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
		//duplicates keys are not allowed,duplicate values are allowed
		//to insert an entry in the map
		hm.put("ram", 1);
		hm.put("kanni", 1);
		hm.put("venki", 1);
		hm.put("ram", 1);
		hm.put("rama", 1);
		hm.put("prasad", 1);
		System.out.println(hm); //{kanni=1, venki=1, prasad=1, rama=1, ram=1}
		
		Map<String,Integer> hm1=new HashMap<String,Integer>(hm);
		System.out.println(hm1); //{kanni=1, venki=1, prasad=1, rama=1, ram=1}
		//It is used to delete an entry for the specified key.
		hm1.remove("kanni");
		System.out.println(hm1); //{venki=1, prasad=1, rama=1, ram=1}
		
		//It removes the specified values with the associated specified keys from the map.
		hm1.remove("ram", 1);
		System.out.println(hm1); //{venki=1, prasad=1, rama=1}
		
		
		//It returns the Set view containing all the keys.
		Set<String> s=hm1.keySet();
		System.out.println(s); //[venki, prasad, rama, ram]
		
		System.out.println(hm1.containsKey("venki")); //true
		System.out.println(hm1.containsKey("kanni")); //false
		
		System.out.println(hm1.containsValue(1)); //true
		System.out.println(hm1.containsValue(5)); //false
		
		//This method returns the object that contains the value associated with the key.
		System.out.println(hm1.get("venki")); //1
		
		int hashcode=hm1.hashCode();
		System.out.println(hashcode); //-864518605
		
		System.out.println(hm.isEmpty());	//false
		
		if(hm1.equals(hm))
		{
			System.out.println("equal");
		}else {
			System.out.println("not equal"); //not equal
		}
		
		if(!hm1.equals(hm))
		{
			System.out.println("equal"); //equal
		}else {
			System.out.println("not equal");
		}
		
		//It replaces the specified value for a specified key.
		hm1.replace("venki", 2);
		System.out.println(hm1); //{venki=2, prasad=1, rama=1}
		//It replaces the old value with the new value for a specified key.
		hm1.replace("prasad", 1, 5);
		System.out.println(hm1); //{venki=2, prasad=5, rama=1}
		
		//This method returns the number of entries in the map.
		int mapsize=hm.size();
		System.out.println(mapsize);
		
		//It returns a collection view of the values contained in the map.
		Collection c=hm.values();
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		/*Map<String,Integer> hm1=new HashMap<String,Integer>();
		hm1.putAll(hm);
		System.out.println(hm1);  ////{kanni=1, venki=1, prasad=1, rama=1, ram=1} */
		
		
	}

}
