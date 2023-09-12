package JavaLogicalPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T5_Duplicate_Count_In_Int_Array {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,3,2,4,1,1};
		
		List<Integer> al=new ArrayList<Integer>();
		for(int aa:a)
		{
			al.add(aa);
		}
		
		Set<Integer> hs=new HashSet<Integer>(al);
		
		List<Integer> al1=new ArrayList<Integer>(hs);
		
		for(int i=0;i<al1.size();i++)
		{
			int count=0;
			for(int j=0;j<al.size();j++)
			{
				if(al1.get(i)==al.get(j))
				{
					count++;
				}
			}System.out.println(al1.get(i)+" value repeated in "+count+" times.");
		}
		
		
		
	}

}
