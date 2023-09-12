package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfOccurancesOfHighWordInSentance {

	public static void main(String[] args) 
	{
		//Write a program to find the no of highest occurrences of word in sentence
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine(); //shame shame puppy shame
		
		String[] str1=str.split(" ", 0);
		int count=1;
		/*System.out.println("no of words in a string: ");
		for(String s:str1)
		{
			System.out.println(s);
		}*/
		List<String> l=new ArrayList<String>();
		for(String s:str1)
		{
			l.add(s);
		}System.out.println(l);
		for(int i=1;i<l.size();i++)
		{
			String string=l.get(0);
		
				if(string.equals(l.get(i)))
				{
					count++;
				}
			
		}
		System.out.println("no of repeated words in a given String: "+count);
		

	}

}
