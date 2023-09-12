package JavaLogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class T6_Duplicate_Count_In_String_Array{

	public static void main(String[] args) {
		
		String a[]= {"ram","ram","venki","kanni","venki","venki","prasad","ram","rama"};
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
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
