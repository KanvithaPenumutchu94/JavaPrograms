package Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		
		String s="aHHHbYY";
		char ch[]=s.toCharArray();

		ArrayList<Character> al=new ArrayList<Character>();
	
		
		for(char c:ch)
		{
			al.add(c);
		}
		System.out.println(al);
		Set<Character> hs=new HashSet<Character>(al);
		System.out.println(hs);
		ArrayList<Character> al1=new ArrayList<Character>(hs);
		System.out.println(al1);
		
		
		
		for(int i=0;i<al1.size();i++)
		{
			ArrayList<Character> al2=new ArrayList<Character>();
			for(int j=0;j<al.size();j++)
			{
				if((al1.get(i)==al.get(j)))
				{
					al2.add(al.get(j));
					
				}
			}
			System.out.println(al2);
				
		}
		
	}

}
