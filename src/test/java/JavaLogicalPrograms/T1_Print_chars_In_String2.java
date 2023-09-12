package JavaLogicalPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class T1_Print_chars_In_String2 {

	public static void main(String[] args) {
		
		//op=abbccc
		
		String s="a1b2c3";
		
		
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			hm.put(s.charAt(i), Integer.parseInt(String.valueOf(s.charAt(i+1))));
			i++;
		}
		
		System.out.println(hm);
		Set<Entry<Character,Integer>> set=hm.entrySet();
		
		for(Entry<Character,Integer> entry:set)
		{
			for(int i=entry.getValue();i>0;i--)
			{
				System.out.println(entry.getKey());
			}
		}
		
		
	}

}
