package UnsolvedPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintUniqueValuesInArray2 {

	public static void main(String[] args) 
	{
		int[] a= {1,2,1,3,4,5,5};
		
		List<Integer> l=new ArrayList<Integer>();
		List<Integer> l1=new ArrayList<Integer>();
	
		for(int a1:a)
		{
			l.add(a1);
			l1.add(a1);
		}System.out.println(l);
		System.out.println(l.size());
		System.out.println(l1);
		System.out.println(l1.size());
		
		for(int i=0;i<l.size();i++)
		{
			int k=l.get(i);
			for(int j=i+1;j<l1.size();j++)
			{
				int k1=l1.get(j);
				if(k==k1)
				{
					
				}
			}
		}System.out.println(l1);
		
			
		
		
		
	
		
		
	}
}


