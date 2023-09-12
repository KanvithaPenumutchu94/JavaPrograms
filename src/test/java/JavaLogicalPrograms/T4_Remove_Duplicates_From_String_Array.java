package JavaLogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T4_Remove_Duplicates_From_String_Array {

	public static void main(String[] args) {
		
		String s[]= {"ram","ram","venki","kanni","venki","venki","prasad","ram","rama"};
		
		List<String> al=new ArrayList<String>();
		al=Arrays.asList(s);
		System.out.println(al);
		
		Set<String> hs=new HashSet<String>(al);
		System.out.println(hs);
		
		
		
		
	}

}
