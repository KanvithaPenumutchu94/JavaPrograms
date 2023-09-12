package JavaLogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T6_Duplicate_Count_In_String_Array2{

	public static void main(String[] args) {
		
		String a[]= {"ram","ram","venki","kanni","venki","venki","prasad","ram","rama"};
		

		List<String> al=new ArrayList<String>();
		al=Arrays.asList(a);
		
		Set<String> hs=new HashSet<String>(al);
		
		List<String> al1=new ArrayList<String>(hs);
		
		for(int i=0;i<al1.size();i++)
		{
			int count=0;
			for(int j=0;j<al.size();j++)
			{
				if(al1.get(i)==al.get(j))
				{
					count++;
				}
			}System.out.println(al1.get(i)+" word repeated in "+count+" times.");
		}
		
	}

}
