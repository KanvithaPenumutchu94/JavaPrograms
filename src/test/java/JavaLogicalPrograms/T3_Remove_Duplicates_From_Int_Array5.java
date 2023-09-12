package JavaLogicalPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T3_Remove_Duplicates_From_Int_Array5 {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,1,3,1,6,2,5,9,8};
		int count=1;
		
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			//get(key) Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key. 
			if(hm.get(a[i])==null)
			{
				hm.put(a[i], count);
				System.out.print(a[i]+" ");
			}
		}System.out.println();
		
		System.out.println(hm.keySet());
	}

}
