package JavaLogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T3_Remove_Duplicates_From_Int_Array {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,1,3,1,6,2,5,9,8};
		
		List<Integer> al=new ArrayList<Integer>();
		for(int aa:a)
		{
			al.add(aa);
		}System.out.println(al);
		
		Set<Integer> hs=new HashSet<Integer>(al);
		System.out.println(hs);
	
		
	}

}
