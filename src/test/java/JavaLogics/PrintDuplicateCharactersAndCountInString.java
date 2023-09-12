package JavaLogics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateCharactersAndCountInString {

	public static void main(String[] args) {
		//Need to finish		
		String s="Kanvitha" ;
		char ch[]=s.toCharArray();
		
		ArrayList<Character> al=new ArrayList<Character>();
		for(char chh:ch)
		{
			al.add(chh);
		}System.out.println(al);
		
		Set<Character> hs=new HashSet<Character>(al);
		System.out.println(hs);
		
		ArrayList<Character> al1=new ArrayList<Character>(hs);
		System.out.println(al1);
		
		
		for(int i=0;i<al1.size();i++)
		{
			int count=0;
			char ch1=al1.get(i);
			for(int j=0;j<al.size();j++)
			{
				char ch2=al.get(j);
				if(ch1==ch2)
				{
					count++;
				}
			}System.out.println(ch1+" repeated in "+count+" times");
			
		}
		
		
		
		
	}

}
