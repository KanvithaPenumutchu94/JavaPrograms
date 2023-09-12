package Collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Entry_Methods_Example {

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
		
		// Using entrySet() to get the entry's of the map
        Set<Map.Entry<String,Integer>> s = hm.entrySet();
        System.out.println(s);  //{kanni=1, venki=1, prasad=1, rama=1, ram=1}
        
        for (Map.Entry<String, Integer> it: s)
        {
            // Using the getKey to get key of the it element
            // Using the getValue to get value of the it element
            System.out.println("Before change of value = " + 
                       it.getKey() + "   " +  it.getValue());
            
            int value=5;
            it.setValue(value);
            
            System.out.println("After change of value = " + 
                    it.getKey() + "   " + it.getValue());
        }
		
	}

}
