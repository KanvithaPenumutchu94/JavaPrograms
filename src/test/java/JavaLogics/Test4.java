package JavaLogics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
	
		/*String input = "aHHHbYY";
		String[] result = input.replaceAll("(.)\\1{1,}", "$1").split("");
		
		for(String result1:result)
		{
			System.out.println(result1);
		}
		*/
		String input = "aHHHbYY";
		char ch[]=input.toCharArray();
		List<Character> al=new ArrayList<Character>();
		for(char ch1:ch)
		{
			al.add(ch1);
		}System.out.println("al: "+al);
		Set<Character> s=new HashSet<Character>(al);
		
		System.out.println("s: "+s);
		
		List<Character> al1=new ArrayList<Character>(s);
		
		
		
		for(int i=0;i<al1.size();i++)
		{
			List<Character> op=new ArrayList<Character>();
			for(int j=0;j<al.size();j++)
			{
				if(al1.get(i)==al.get(j))
				{
					op.add(al.get(j));
				}
			}System.out.println(op);
		}
		
	}

}
