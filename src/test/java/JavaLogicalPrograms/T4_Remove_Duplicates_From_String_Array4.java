package JavaLogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class T4_Remove_Duplicates_From_String_Array4 {

	public static void main(String[] args) {
		
		String s[]= {"ram","ram","venki","kanni","venki","venki","prasad","ram","rama"};
				
		Map<String,Integer> hm=new HashMap<String,Integer>();
		
		for(int i=0;i<s.length;i++)
		{
			if(hm.get(s[i])==null)
			{
				hm.put(s[i], 1);
				System.out.print(s[i]+" ");
			}
		}System.out.println();
		System.out.println(hm.keySet());
		
		
		
		
		
	}

}
