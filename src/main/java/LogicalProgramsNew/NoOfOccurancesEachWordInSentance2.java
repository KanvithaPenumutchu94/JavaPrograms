package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfOccurancesEachWordInSentance2 {

	public static void main(String[] args) 
	{
		//Write a program to find the no of occurrences of each word in sentence
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine(); //shame shame puppy puppy shame
		
		String[] str1=str.split(" ", 0);
		
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
		for(int i=0;i<l.size();i++)
		{
			int count=0;
			String string=l.get(i);
			System.out.println("No of occurances of "+(i+1)+" word is: ");
			for(int j=0;j<l.size();j++)
			{
				if(string.equals(l.get(j)))
				{
					count++;
				}
			}System.out.println(count);
		}
		
		

	}

}
