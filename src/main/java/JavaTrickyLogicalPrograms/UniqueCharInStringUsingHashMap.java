package JavaTrickyLogicalPrograms;

import java.util.HashMap;

public class UniqueCharInStringUsingHashMap {

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,1,3,2,1};
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			hm.put(array[i],i);
		}
		System.out.println(hm);
		System.out.println(hm.keySet());

	}

}
