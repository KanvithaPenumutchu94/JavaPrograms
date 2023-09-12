package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrintRepeatedCharacters {

	public static void main(String[] args)
	{
		//Print repeated characters in a given string
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine();
		Set<Character> l=new HashSet<Character>();
		
		//remove spaces in a given string
		str=str.trim(); //remove start and end spaces
		str=str.replaceAll(" ", "");
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				char c1=str.charAt(j);
				int compare=Character.compare(c, c1);
				if(compare==0)
				{
					l.add(c);
					
				}
			}
		}System.out.println("repeated char are: "+l);
	}

}
