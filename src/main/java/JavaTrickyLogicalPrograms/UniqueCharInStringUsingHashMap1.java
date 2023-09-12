package JavaTrickyLogicalPrograms;

import java.util.HashMap;

public class UniqueCharInStringUsingHashMap1 {

	public static void main(String[] args) {
		
	String s="kanvitha";
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			hm.put(s.charAt(i),i);
		}
		System.out.println(hm);
		System.out.println(hm.keySet());

	}

}
