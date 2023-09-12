package JavaLogics;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInArrayList {
	
	public static void main(String[] args) 
	{
		
		int[] num= {1,2,3,4,5,1,2,3};
		
		int[] num1=new int[num.length];
		List<Integer> al=new ArrayList<Integer>();
		List<Integer> al1=new ArrayList<Integer>();
		for(int n:num)
		{
			al.add(n);
			al1.add(n);
		}
		for(int i=0;i<al.size();i++)
		{
			int n=al.get(i);
			
			for(int j=i+1;j<al1.size();j++)
			{
				int n1=al1.get(j);
				if(n==n1)
				{
					al.remove(n);
				}
			}
		}
		
		System.out.println(al);
		
		

	}

}
