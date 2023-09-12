package JavaLogicalPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class T1_Print_chars_In_String3 {

	public static void main(String[] args) {
		//op=aimbollbollccc
		
		String s="AIM1boll2c3";
		String str[]=s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");;;
		
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
		
		for(int i=0;i<str.length;i++)
		{
			hm.put(str[i], Integer.parseInt(str[i+1]));
			i++;
		}
		
		System.out.println(hm);
		Set<Entry<String,Integer>> set=hm.entrySet();
		
		for(Entry<String,Integer> entry:set)
		{
			for(int i=entry.getValue();i>0;i--)
			{
				System.out.println(entry.getKey());
			}
		}
		
		
	}

}
