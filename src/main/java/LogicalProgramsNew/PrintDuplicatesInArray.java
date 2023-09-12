package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,1,2,1};
		//int count=0;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int z=a[i];
			//System.out.println(z);
			
			for(int j=i+1;j<a.length;j++)
			{
				int z1=a[j];
				if(z==z1)
				{
					al.add(z);
				}
			}
		}
		for(int i=0;i<al.size();i++)
		{
			int count=0;
			for(int j=0;j<al.size();j++)
			{
				
				if(al.get(i)==al.get(j))
				{
					count++;
				}
			}System.out.println(al.get(i)+"         "+count);
		}
		
		
		
		
		
	}

}
