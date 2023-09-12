package JavaTrickyLogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintUniqueValuesInArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,1,3,4,5,5};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		List<Integer> l=new ArrayList<Integer>();
		
		for(int a1:a)
		{
			l.add(a1);
		}
		//System.out.println(l);
		//System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==l.get(i+1))
			{
				l.remove(i+1);
			}
		
		}System.out.println(l);

		
	}

}
