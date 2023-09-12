package JavaLogics;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInArray {
	
	public static void main(String[] args) 
	{
		
		int[] num= {1,2,3,4,5,1,2,3};
		List<Integer> al=new ArrayList<Integer>();
		List<Integer> al1=new ArrayList<Integer>();
 		
		for(Integer num1:num)
		{
			al.add(num1);
		}System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			int number=al.get(i);
			for(int j=i+1;j<al.size();j++)
			{
				int number1=al.get(j);
				if(!al1.contains(al.get(j)))
				{
					al.remove(number1);
				}
			}
		}System.out.println(al);
		
		
		
		

	}

}
