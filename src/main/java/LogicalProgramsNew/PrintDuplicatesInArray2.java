package LogicalProgramsNew;

import java.util.HashSet;

public class PrintDuplicatesInArray2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,1,2,1};
		
		HashSet<Integer> al=new HashSet<Integer>();
		
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
		}System.out.println(al);
		
		
		
		
		
	}

}
