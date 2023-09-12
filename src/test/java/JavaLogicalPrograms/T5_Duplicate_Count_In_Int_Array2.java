package JavaLogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class T5_Duplicate_Count_In_Int_Array2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,3,2,4,1,1};
		
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				int count=hm.get(a[i]);
				hm.put(a[i], count+1);
			}else {
				hm.put(a[i], 1);
			}
		}System.out.println(hm);
		
	}

}
