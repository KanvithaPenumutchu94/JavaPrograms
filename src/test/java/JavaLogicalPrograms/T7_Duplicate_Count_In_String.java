package JavaLogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T7_Duplicate_Count_In_String{

	public static void main(String[] args) {
		
		String s= "aabccdsaab";
		char ch[]=s.toCharArray();
		

		List<Character> al=new ArrayList<Character>();
		for(char ch1:ch)
		{
			al.add(ch1);
		}
		
		Set<Character> hs=new HashSet<Character>(al);
		
		List<Character> al1=new ArrayList<Character>(hs);
		
		for(int i=0;i<al1.size();i++)
		{
			int count=0;
			for(int j=0;j<al.size();j++)
			{
				if(al1.get(i)==al.get(j))
				{
					count++;
				}
			}
			if(count>=1)
			System.out.println(al1.get(i)+" character repeated in "+count+" times.");
		}
		
	}

}
