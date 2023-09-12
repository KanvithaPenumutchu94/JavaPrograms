package JavaLogicalPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T3_Remove_Duplicates_From_Int_Array4 {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,1,3,1,6,2,5,9,8};
		
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!hm.containsKey(a[i]))
			{
				hm.put(a[i], 1);
			}
		}
		
		System.out.println(hm.keySet());
		System.out.println(hm);
	}

}
