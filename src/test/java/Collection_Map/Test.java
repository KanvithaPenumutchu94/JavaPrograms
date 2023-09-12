package Collection_Map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("ram", 1);
		map.put("kanni", 5);
		map.put("venki", 3);
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" ------------"+m.getValue());
		}
		
		for(Object o:map.keySet())
		{
			System.out.println(o);
		}
		
		for(Object o:map.values())
		{
			System.out.println(o);
		}
		
	}

}
