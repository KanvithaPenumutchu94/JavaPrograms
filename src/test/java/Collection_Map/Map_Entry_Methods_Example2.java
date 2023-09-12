package Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Entry_Methods_Example2 {

	public static void main(String[] args) {
		
		//Create HashMap object.
		Map hashMap = new HashMap();
 
		//Add objects to the HashSet.
		hashMap.put(4, "kanni");
		hashMap.put(2, "rama");
		hashMap.put(5, "ram");
		hashMap.put(1, "prasad");
		hashMap.put(3, "venki");
 
		//Print the HashMap object.
		System.out.println("HashMap elements:");
		System.out.println(hashMap);
 
		//Get iterator
		Set set=hashMap.entrySet();  
		Iterator iterator=set.iterator();  
 
		//Print the HashMap elements using iterator.
		System.out.println("HashMap elements using iterator:");
		while(iterator.hasNext()){
		   Map.Entry mapEntry=(Map.Entry)iterator.next();  
		   System.out.println("Key: " + mapEntry.getKey() + ", " +
		   		"Value: " + mapEntry.getValue());  
		} 
		
	}

}
