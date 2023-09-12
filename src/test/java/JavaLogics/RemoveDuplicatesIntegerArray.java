package JavaLogics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesIntegerArray {
	public static void main(String[] args) {
		
		int a[]= {1,4,9,1,3,11,9,4,9};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//convert array to arraylist
		List<Integer> al=new ArrayList<Integer>();
		
		for(int aa:a)
		{
			al.add(aa);
		}
		System.out.println(al);
		
		Set hs=new HashSet<Integer>(al);
		System.out.println("After removing duplicates..");
		System.out.println(hs);
		
		
		
	}

}
