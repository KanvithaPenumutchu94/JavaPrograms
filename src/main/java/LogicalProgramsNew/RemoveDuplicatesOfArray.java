package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.List;



public class RemoveDuplicatesOfArray {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		List<Integer> l1=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(1);
		l.add(1);
		
		for(int i=0;i<l.size();i++)
		{
			if(!l1.contains(l.get(i)))
			{
				l1.add(l.get(i));
			}
		}System.out.println(l1);
		
		

	}

}
