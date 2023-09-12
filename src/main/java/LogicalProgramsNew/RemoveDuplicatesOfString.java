package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.List;



public class RemoveDuplicatesOfString {

	public static void main(String[] args) {
		
		String s="kanvitha";
		
		List<Character> l=new ArrayList<Character>();
		List<Character> l1=new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			l.add(ch);
		}
		

		
		for(int i=0;i<l.size();i++)
		{
			if(!l1.contains(l.get(i)))
			{
				l1.add(l.get(i));
			}
		}System.out.println(l1);
		
		

	}

}
