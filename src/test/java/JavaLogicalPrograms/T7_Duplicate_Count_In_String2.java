package JavaLogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class T7_Duplicate_Count_In_String2{

	public static void main(String[] args) {
		
		String s= "aabccdsaab";
		char ch[]=s.toCharArray();
		
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(hm.containsKey(ch[i]))
			{
				int count=hm.get(ch[i]);
				hm.put(ch[i], count+1);
			}else {
				hm.put(ch[i], 1);
			}
		}System.out.println(hm);
		
	}

}
