package JavaLogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class T4_Remove_Duplicates_From_String_Array2 {

	public static void main(String[] args) {
		
		String s[]= {"ram","ram","venki","kanni","venki","venki","prasad","ram","rama"};
				
		Map<String,Integer> hm=new HashMap<String,Integer>();
		
		for(int i=0;i<s.length;i++)
		{
			hm.put(s[i], 1);
		}
		System.out.println(hm.keySet());
		
		
		
		
		
	}

}
