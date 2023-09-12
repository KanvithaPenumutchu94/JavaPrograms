package Map;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
	
		String s="aabccddeee";
		char[] chs=s.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		/*for(Character ch:chs)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}System.out.println(hm);*/
		for(int i=0;i<chs.length;i++)
		{
			if(hm.containsKey(chs[i]))
			{
				hm.put(chs[i], hm.get(chs[i])+1);
			}
			else
			{
				hm.put(chs[i], 1);
			}
				
			System.out.println(hm);
		}
	}

}
