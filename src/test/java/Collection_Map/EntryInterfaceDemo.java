package Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryInterfaceDemo {
	
	public static void main(String[] args) {
		
	//Map hs=new HashMap();
		
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "prasad");
		hm.put(2, "Rama");
		hm.put(3, "venki");
		hm.put(4, "ram");
		hm.put(5, "kanni");
		
		//System.out.println(hm); //{1=prasad, 2=Rama, 3=venki, 4=ram, 5=kanni}
		
		//Entry methods
		//************
		
		for(Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		//Iterator
		//*********
		
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
